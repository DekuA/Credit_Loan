package com.p2p.qiyun.dyj.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.dyj.pojo.Dept;
import com.p2p.qiyun.dyj.pojo.DeptQuerVO;
import com.p2p.qiyun.dyj.pojo.Role;
import com.p2p.qiyun.dyj.pojo.RoleQueryVO;
import com.p2p.qiyun.dyj.pojo.Users;
import com.p2p.qiyun.dyj.pojo.UsersQueryVO;
import com.p2p.qiyun.dyj.service.UsersService;

@RestController
public class UsersController {
	@Autowired
	private UsersService us;
	@RequestMapping("findpwd")
	public Users findPwd(String loginname,String pwd,HttpSession session,HttpServletResponse response) throws IOException{
		Users u = us.findPwd(loginname);
		Subject subject = SecurityUtils.getSubject();
		//2.封装用户数据
		UsernamePasswordToken token = new UsernamePasswordToken(loginname,pwd,"11");
		
		//3.执行登录方法
		try {
			subject.login(token);
			session.setAttribute("user", u);
		} catch (UnknownAccountException e) {
			System.out.println("不存在");
			response.sendRedirect("lg.html");
		}catch (IncorrectCredentialsException e) {
			session.removeAttribute("user");
			System.out.println("错误");
			response.sendRedirect("lg.html");
		}
		return u;
	}
	@RequestMapping("getUsername")
	public Users findPwd(HttpSession session) {
		Users u =(Users) session.getAttribute("user");
		return u;
	}
	
	@RequestMapping("/loginout")
	public void logout(HttpSession session,HttpServletResponse response){
		Subject subject = SecurityUtils.getSubject();
		session.removeAttribute("user");
		subject.logout();
		try {
			response.sendRedirect("lg.html");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/showDeptByDid")
	public int showDeptByDid(int[] idlist){
		int showDeptByDid = us.showDeptByDid(idlist);
		return showDeptByDid;
	}
	@RequestMapping("/selectByRid")
	public int selectByRid(int[] idlist){
		int showByRid = us.showByRid(idlist);
		return showByRid;
	}
	@RequestMapping("/selectByRIds")
	public Map<String, Object> selectByRIds(int rid,int rows,int page){
		Role r=new Role();
		r.setRoleid(rid);
		RoleQueryVO p=new RoleQueryVO(rows*(page-1), rows,r);
		List<Users> list = us.showByRids(p);
		Map<String, Object> map=new HashMap();
		map.put("rows", list);
		map.put("total", us.rolecount(p));
		return map;

	}
	@RequestMapping("/selectByDeptIds")
	public Map<String, Object> selectByDeptIds(int deptid,int rows,int page){
		Dept d=new Dept();
		d.setDeptid(deptid);
		DeptQuerVO p=new DeptQuerVO(rows*(page-1), rows,d);
		List<Users> list = us.showByDeptid(p);
		Map<String, Object> map=new HashMap();
		map.put("rows", list);
		map.put("total", us.deptcount(p));
		return map;

	}
	@RequestMapping("/findUsers1")
	public Map<String, Object> findUsers1(Users u,int rows,int page){
		UsersQueryVO p=new UsersQueryVO(rows*(page-1), rows,u);
		List<Users> list = us.findUsers1(p);
		Map<String, Object> map=new HashMap();
		System.out.println(list);
		map.put("rows", list);
		map.put("total", us.userscount(p));
		return map;

	}
	@RequestMapping("/updateRid")
	public int updateRid(Users u){
		int updateRid = us.updateRid(u);
		return updateRid;
	}
	@RequestMapping("/getPwd")
	public String getpwd(String pwd,HttpSession session){
		Users u =(Users) session.getAttribute("user");
		ByteSource bytes = ByteSource.Util.bytes(u.getLoginname());
		SimpleHash hash = new SimpleHash("MD5",pwd,bytes,1234);
		if(u.getPwd().equals(hash.toString())){
			return "1";
		}else{
			return "0";
		}
	}
	@RequestMapping("/updatePwd")
	public int updatePwd(Users u,HttpSession session){
		Users uu =(Users) session.getAttribute("user");
		ByteSource bytes = ByteSource.Util.bytes(uu.getLoginname());
		SimpleHash hash = new SimpleHash("MD5",u.getPwd(),bytes,1234);
		u.setUid(uu.getUid());
		u.setPwd(hash.toString());
		int updatePwd = us.updatePwd(u);
		return updatePwd;
	}
}
