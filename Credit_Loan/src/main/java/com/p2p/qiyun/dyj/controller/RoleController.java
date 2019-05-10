package com.p2p.qiyun.dyj.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.dyj.pojo.Dept;
import com.p2p.qiyun.dyj.pojo.DeptQuerVO;
import com.p2p.qiyun.dyj.pojo.Role;
import com.p2p.qiyun.dyj.pojo.RoleQueryVO;
import com.p2p.qiyun.dyj.service.RoleService;
import com.p2p.qiyun.dyj.service.TandrService;

@RestController
public class RoleController {
	@Autowired
	private RoleService rs;
	@Autowired
	private TandrService trs;
	@RequestMapping("/findRole")
	public Map<String, Object> findRole(int page,int rows){
		RoleQueryVO p=new RoleQueryVO(rows*(page-1), rows);
		List<Role> list = rs.fidnRole(p);
		Map<String, Object> map=new HashMap();
		map.put("rows", list);
		map.put("total", rs.count(p));
		return map;
		
	}
	@RequestMapping("/addRole")
	public int addRole(String rolename){
		int addRole = rs.addRole(rolename);
		return addRole;
	}
	@RequestMapping("/updateRole")
	public int updateRole(Role r){
		int count = rs.updateRole(r);
		return count;
	}
	@RequestMapping("/showRoleById")
	public Role showRoleById(int roleid){
		Role roleById = rs.showRoleById(roleid);
		return roleById;
	}
	@RequestMapping("/deleteRole")
	public int deleteRole(int[] idlist){
		int count = rs.deleteRole(idlist);
		int deleteTandR = trs.deleteTandR(idlist);
		return count;
	}
	@RequestMapping("/showRoles1")
	public List<Role> showRoles1(){
		List<Role> showRoles1 = rs.showRoles1();
		return showRoles1;
	}
}
