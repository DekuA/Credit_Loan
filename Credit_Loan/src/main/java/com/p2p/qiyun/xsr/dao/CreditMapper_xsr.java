package com.p2p.qiyun.xsr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.p2p.qiyun.xsr.domain.customer;
import com.p2p.qiyun.xsr.domain.userinfo;

@Mapper
public interface CreditMapper_xsr {
	userinfo phonechaxinxi(String phone);
	List<customer> kehuxinxi(int userid);
	List<String> scdenglu(String phone);
	int shimingrz(userinfo info);
	int delecus(int id);
	int bangyou(customer cus);
	int xiumi(userinfo info);
	customer kehuxinxi22(int id);
	int bangyin(customer cus);
	int xiuxinyongfen(customer cus);
}
