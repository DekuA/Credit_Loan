package com.p2p.qiyun.xsr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.dyj.pojo.Users;
import com.p2p.qiyun.lsx.entity.Loan;
import com.p2p.qiyun.xsr.dao.CreditMapper_xsr;

import com.p2p.qiyun.xsr.domain.customer;
import com.p2p.qiyun.xsr.domain.kefuinfo;
import com.p2p.qiyun.xsr.domain.paymenthistory;
import com.p2p.qiyun.xsr.domain.touxiang;
import com.p2p.qiyun.xsr.domain.userinfo;
import com.p2p.qiyun.xsr.domain.xiaoxi;

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

	@Override
	public List<xiaoxi> xioxichaxun(int id) {
		List<xiaoxi> xioxichaxun = dao.xioxichaxun(id);
		return xioxichaxun;
	}

	@Override
	public List<Loan> chajiekuan(int userid) {
		List<Loan> chajiekuan = dao.chajiekuan(userid);
		return chajiekuan;
	}

	@Override
	public List<paymenthistory> chahuankuan(int userid) {
		List<paymenthistory> chahuankuan = dao.chahuankuan(userid);
		return chahuankuan;
	}

	@Override
	public int chaduihuatext(kefuinfo kf) {
		int chaduihuatext = dao.chaduihuatext(kf);
		return chaduihuatext;
	}

	@Override
	public List<kefuinfo> chatextuser(int userid) {
		List<kefuinfo> chatextuser = dao.chatextuser(userid);
		return chatextuser;
	}

	@Override
	public Users chakfu(int uid) {
		Users chakfu = dao.chakfu(uid);
		return chakfu;
	}

	@Override
	public String setousrc(int userid) {
		String setousrc = dao.setousrc(userid);
		return setousrc;
	}

	@Override
	public int updasrc(touxiang tou) {
		int updasrc = dao.updasrc(tou);
		return updasrc;
	}

	@Override
	public int xiunicheng(userinfo us) {
		int xiunicheng = dao.xiunicheng(us);
		return xiunicheng;
	}

	

}
