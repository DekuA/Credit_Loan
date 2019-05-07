package com.p2p.qiyun.xsr.service;

import java.util.List;

import com.p2p.qiyun.xsr.domain.customer;
import com.p2p.qiyun.xsr.domain.userinfo;

public interface CreditService_xsr {
	userinfo phonechaxinxi(String phone);
	List<customer> kehuxinxi(int userid);
	String scdenglu(String phone);
	int shimingrz(userinfo info);
	int delecus(int id);
	int bangyou(customer cus);
	int xiumi(userinfo info);
	customer kehuxinxi22(int id);
	int bangyin(customer cus);
	int xiuxinyongfen(customer cus);
}
