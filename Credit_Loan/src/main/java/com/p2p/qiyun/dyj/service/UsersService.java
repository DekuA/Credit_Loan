package com.p2p.qiyun.dyj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.dyj.dao.UsersMapper;
import com.p2p.qiyun.dyj.pojo.DeptQuerVO;
import com.p2p.qiyun.dyj.pojo.RoleQueryVO;
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
	public int showByRid(int[] idlist){
		int selectByRid = mapper.selectByRid(idlist);
		return selectByRid;
	}
	public List<Users> showByRids(RoleQueryVO vo){
		List<Users> selectByRIds = mapper.selectByRIds(vo);
		return selectByRIds;
	}
	public int rolecount(RoleQueryVO vo){
		int ridcount = mapper.ridcount(vo);
		return ridcount;
	}
	public List<Users> showByDeptid(DeptQuerVO vo){
		List<Users> selectByDeptIds = mapper.selectByDeptIds(vo);
		return selectByDeptIds;
	}
	public int deptcount(DeptQuerVO vo){
		int deptidcount = mapper.deptidcount(vo);
		return deptidcount;
	}
}
