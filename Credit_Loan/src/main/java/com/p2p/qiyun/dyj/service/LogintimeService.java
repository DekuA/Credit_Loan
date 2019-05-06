package com.p2p.qiyun.dyj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.dyj.dao.LogintimeMapper;
import com.p2p.qiyun.dyj.pojo.Logintime;
import com.p2p.qiyun.lsx.dao.LoanOneMapper;

@Service
public class LogintimeService {
	@Autowired
	private LogintimeMapper mapper;
	public Logintime findLT(String username){
		Logintime findLT = mapper.findLT(username);
		return findLT;
	}
	public int addLT(String username){
		int count = mapper.insert(username);
		return count;
	}
}
