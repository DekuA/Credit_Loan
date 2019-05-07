package com.p2p.qiyun.dyj.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.dyj.pojo.Users;
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
	public String logout(HttpSession session){
		Subject subject = SecurityUtils.getSubject();
		session.removeAttribute("user");
		subject.logout();
		return "lg.html";
	}
}
