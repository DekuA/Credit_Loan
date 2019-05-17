package com.p2p.qiyun.cjz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.cjz.dao.xinwenMapper;
import com.p2p.qiyun.cjz.dao.kahaoxxMapper;
import com.p2p.qiyun.cjz.dao.touziMapper;
import com.p2p.qiyun.cjz.domain.customer;
import com.p2p.qiyun.cjz.domain.investnotes;
import com.p2p.qiyun.cjz.domain.news;
import com.p2p.qiyun.cjz.domain.userinfo;
import com.p2p.qiyun.cjz.service.kahaoxxService;
@Service
public class touziServiceImpol implements touziService{
	@Autowired
	private touziMapper dao;

	@Override
	public List<investnotes> listtouzi(investnotes e) {
		// TODO Auto-generated method stub
		List<investnotes> list = dao.listtouzi(e);
		return list;
	}

	@Override
	public int counttouzi(investnotes i) {
		int counttouzi = dao.counttouzi(i);
		return counttouzi;
	}

	

	
}
