package com.p2p.qiyun.cjz.service;

import java.util.List;

import com.p2p.qiyun.cjz.domain.customer;
import com.p2p.qiyun.cjz.domain.userinfo;

public interface kahaoxxService {
	List<customer> seluser(customer c);
	int ccount();
}
