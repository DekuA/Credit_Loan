package com.p2p.qiyun.cjz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.cjz.dao.kahaoxxMapper;
import com.p2p.qiyun.cjz.domain.customer;
import com.p2p.qiyun.cjz.domain.userinfo;
import com.p2p.qiyun.cjz.service.kahaoxxService;
@Service
public class kahaoxxServiceImpol implements kahaoxxService{
	@Autowired
	private kahaoxxMapper dao;

	

	@Override
	public int ccount() {
		int ccount = dao.ccount();
		return ccount;
	}



	@Override
	public List<customer> seluser(customer c) {
		List<customer> seluser = dao.seluser(c);
		return seluser;
	}
}
