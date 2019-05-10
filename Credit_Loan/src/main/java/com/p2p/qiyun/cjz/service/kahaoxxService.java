package com.p2p.qiyun.cjz.service;

import java.util.List;

import com.p2p.qiyun.cjz.domain.customer;
import com.p2p.qiyun.cjz.domain.userinfo;

public interface kahaoxxService {
	List<customer> seluser(customer cu);
	int ccount(String username);
	/* List<customer> mohu(customer c); */
	List<customer> selkahao(int userid);
	
}
