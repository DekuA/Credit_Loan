package com.p2p.qiyun.wzr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.wzr.dao.UserinfoMapper;
import com.p2p.qiyun.wzr.domain.Userinfo;

@Service
public class UserinfoServiceImpol implements UserinfoService {

	@Autowired
	private UserinfoMapper Mapper;

	@Override
	public Userinfo UserEntry(String phone) {
		Userinfo entry = Mapper.UserEntry(phone);
		return entry;
	}

	@Override
	public int UserEnroll(Userinfo user) {
		int enroll = Mapper.UserEnroll(user);
		return enroll;
	}

	@Override
	public int UserCode(Userinfo user) {
		int userCode = Mapper.UserCode(user);
		return userCode;
	}

	@Override
	public int UserTime(String phone) {
		int time = Mapper.UserTime(phone);
		return time;
	}
	
	@Override
	public int charukuhuxinxi(int userid) {
		int charukuhuxinxi = Mapper.charukuhuxinxi(userid);
		return charukuhuxinxi;
	}

	@Override
	public List<Userinfo> userlogin(Userinfo user) {
		List<Userinfo> list = Mapper.userlogin(user);
		return list;
	}
}
