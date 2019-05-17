package com.p2p.qiyun.cjz.service;

import java.util.List;

import com.p2p.qiyun.cjz.domain.customer;
import com.p2p.qiyun.cjz.domain.news;
import com.p2p.qiyun.cjz.domain.userinfo;

public interface xinwenService {
	List<news> listnews(news e);
	int countnews(String ntitle);
	/* int countnews(); */
	int deletenews(int[] idlist);
	int newsadd(news s);
	int updatenews(news s);
	news selid(int id);
	
}
