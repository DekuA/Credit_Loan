package com.p2p.qiyun.wzr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.wzr.dao.UserinfoMapper;
import com.p2p.qiyun.wzr.domain.userinfo;
@Service
public class UserinfoServiceImpol implements UserinfoService {

	@Autowired
	private UserinfoMapper Mapper;
	@Override
	public userinfo UserEntry(String phone) {
		userinfo entry = Mapper.UserEntry(phone);
		return entry;
	}

	@Override
	public int UserEnroll(userinfo user) {
		int enroll = Mapper.UserEnroll(user);
		return enroll;
	}

	@Override
	public int UserCode(userinfo user) {
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

}
