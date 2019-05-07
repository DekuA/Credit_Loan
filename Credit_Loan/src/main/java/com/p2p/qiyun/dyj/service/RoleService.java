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
}
