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
	public int ccount(String username) {
		int ccount = dao.ccount(username);
		return ccount;
	}



	@Override
	public List<customer> seluser(customer cu) {
		List<customer> seluser = dao.seluser(cu);
		return seluser;
	}



	@Override
	public List<customer> selkahao(int userid) {
		// TODO Auto-generated method stub
		List<customer> selkahao = dao.selkahao(userid);
		return selkahao;
	}


	/*
	 * @Override public List<customer> mohu(customer c) { // TODO Auto-generated
	 * method stub List<customer> mohu = dao.mohu(c); return mohu; }
	 */
}
