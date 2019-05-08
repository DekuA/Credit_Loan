package com.p2p.qiyun.cc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.cc.dao.UserinfoerMapper;
import com.p2p.qiyun.cc.pojo.Userinfo;

@Service
public class UserinfoerService {
	@Autowired
	private UserinfoerMapper mapper;
	
	public List<Userinfo> userinfo() {
		List<Userinfo> userinfo = mapper.userinfo();
		return userinfo;
		
	}
}
