package com.p2p.qiyun.cjz.service;

import java.util.List;

import com.p2p.qiyun.cjz.domain.customer;
import com.p2p.qiyun.cjz.domain.investnotes;
import com.p2p.qiyun.cjz.domain.news;
import com.p2p.qiyun.cjz.domain.userinfo;

public interface touziService {
	List<investnotes> listtouzi(investnotes e);
	int counttouzi();
	/*
	 * int deletenews(int[] idlist); int newsadd(news s); int updatenews(news s);
	 * news selid(news id);
	 */
	
}
