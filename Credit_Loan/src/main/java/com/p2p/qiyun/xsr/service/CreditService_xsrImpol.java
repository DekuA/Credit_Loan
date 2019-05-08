package com.p2p.qiyun.xsr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.xsr.dao.CreditMapper_xsr;
import com.p2p.qiyun.xsr.domain.customer;
import com.p2p.qiyun.xsr.domain.userinfo;

@Service
public class CreditService_xsrImpol implements CreditService_xsr {
	@Autowired
	private CreditMapper_xsr dao;
		
	@Override
	public List<customer> kehuxinxi(int userid) {
		List<customer> kehuxinxi = dao.kehuxinxi(userid);
		return kehuxinxi;
	}

	@Override
	public String scdenglu(String phone) {
		List<String> scdenglu = dao.scdenglu(phone);
		String string = "";
		if(scdenglu.size()==1) {
			 string = "第1次登录";
		}else {
			 string = scdenglu.get(1);
		}		
		return string;
	}

	@Override
	public int shimingrz(userinfo info) {
		int shimingrz = dao.shimingrz(info);
		return shimingrz;
	}

	@Override
	public userinfo phonechaxinxi(String phone) {
		userinfo phonechaxinxi = dao.phonechaxinxi(phone);
		return phonechaxinxi;
	}

	@Override
	public int delecus(int id) {
		int delecus = dao.delecus(id);
		return delecus;
	}

	@Override
	public int bangyou(customer cus) {
		int bangyou = dao.bangyou(cus);
		return bangyou;
	}

	@Override
	public int xiumi(userinfo info) {
		int xiumi = dao.xiumi(info);
		return xiumi;
	}

	@Override
	public customer kehuxinxi22(int id) {
		customer kehuxinxi22 = dao.kehuxinxi22(id);
		return kehuxinxi22;
	}

	@Override
	public int bangyin(customer cus) {
		int bangyin = dao.bangyin(cus);
		return bangyin;
	}

	@Override
	public int xiuxinyongfen(customer cus) {
		int xiuxinyongfen = dao.xiuxinyongfen(cus);
		return xiuxinyongfen;
	}

}
