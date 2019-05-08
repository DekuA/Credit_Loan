package com.p2p.qiyun.cc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.cc.dao.UserinfoMapper;
import com.p2p.qiyun.cc.pojo.Userinfo;

@Service
public class UserinfoService {
	@Autowired
	private UserinfoMapper mapper;
	
	public List<Userinfo> userinfo() {
		List<Userinfo> userinfo = mapper.userinfo();
		return userinfo;
		
	}
}
