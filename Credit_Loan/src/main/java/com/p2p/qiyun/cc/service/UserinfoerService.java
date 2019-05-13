package com.p2p.qiyun.cc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.cc.dao.UserinfoerMapper;
import com.p2p.qiyun.cc.pojo.Userinfo;
import com.p2p.qiyun.cc.pojo.UserinfoQueryVO;


@Service
public class UserinfoerService {
	@Autowired
	private UserinfoerMapper mapper;
	
	public List<Userinfo> userinfo(UserinfoQueryVO vo) {
		List<Userinfo> userinfo = mapper.userinfo(vo);
		return userinfo;
		
	}
	public int count(UserinfoQueryVO vo) {
		int count = mapper.count(vo);
		return count;
	}
	
}
