package com.p2p.qiyun.dyj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.dyj.dao.RoleMapper;
import com.p2p.qiyun.dyj.pojo.Role;
import com.p2p.qiyun.dyj.pojo.RoleQueryVO;

@Service
public class RoleService {
	@Autowired
	private RoleMapper mapper;
	public List<Role> fidnRole(RoleQueryVO vo){
		List<Role> list = mapper.selectByExample(vo);
		return list;
	}
	public int count(RoleQueryVO vo){
		int count = mapper.countByExample(vo);
		return count;
	}
	public int addRole(String rolename){
		int addRole = mapper.addRole(rolename);
		return addRole;
	}
	public int updateRole(Role r){
		int count = mapper.updateByPrimaryKey(r);
		return count;
	}
	public Role showRoleById(int roleid){
		Role r = mapper.selectByPrimaryKey(roleid);
		return r;
	}
	public int deleteRole(int[] idlist){
		int count = mapper.deleteRole(idlist);
		return count;
	}
	public List<Role> showRoles1(){
		List<Role> showRoles1 = mapper.showRoles1();
		return showRoles1;
	}
}
