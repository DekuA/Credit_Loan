package com.p2p.qiyun.dyj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.dyj.dao.UsersMapper;
import com.p2p.qiyun.dyj.pojo.DeptQuerVO;
import com.p2p.qiyun.dyj.pojo.RoleQueryVO;
import com.p2p.qiyun.dyj.pojo.Users;
import com.p2p.qiyun.dyj.pojo.UsersQueryVO;

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
	public List<Users> findUsers1(UsersQueryVO vo){
		List<Users> list = mapper.findUsers1(vo);
		return list;
	}
	public int userscount(UsersQueryVO vo){
		int userscount = mapper.userscount(vo);
		return userscount;
	}
	public int updateRid(Users u){
		int updateRid = mapper.updateRid(u);
		return updateRid;
	}
	public int updatePwd(Users u){
		int updatePwd = mapper.updatePwd(u);
		return updatePwd;
	}
	public int insertusers(Users u){
		int insertUsers = mapper.insertUsers(u);
		return insertUsers;
	}
	public Users showByUid(int uid){
		Users selectByPrimaryKey = mapper.selectByPrimaryKey(uid);
		return selectByPrimaryKey;
	}
	public int updateUsers(Users u){
		int updateByPrimaryKey = mapper.updateByPrimaryKey(u);
		return updateByPrimaryKey;
	}
	public int  deleteUsers(int[] idlist){
		int deleteUsers = mapper.deleteUsers(idlist);
		return deleteUsers;
	}
}
