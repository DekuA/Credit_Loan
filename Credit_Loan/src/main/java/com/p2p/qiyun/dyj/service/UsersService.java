package com.p2p.qiyun.dyj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.dyj.dao.UsersMapper;
import com.p2p.qiyun.dyj.pojo.Users;

@Service
public class UsersService {
	@Autowired
	private UsersMapper mapper;
	public Users findPwd(String loginname){
		Users u = mapper.findPwd(loginname);
		return u;
	}
	public int showDeptByDid(int[] deptid){
		int count = mapper.showDeptByDid(deptid);
		return count;
	}
}
