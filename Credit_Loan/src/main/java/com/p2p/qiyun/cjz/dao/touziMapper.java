package com.p2p.qiyun.cjz.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.p2p.qiyun.cjz.domain.customer;
import com.p2p.qiyun.cjz.domain.investnotes;
import com.p2p.qiyun.cjz.domain.news;
import com.p2p.qiyun.cjz.domain.userinfo;
@Mapper
public interface touziMapper {
	List<investnotes> listtouzi(investnotes e);
	int counttouzi(investnotes i);
	/*
	 * int deletenews(int[] idlist); int newsadd(news s); int updatenews(news s);
	 * news selid(news id)
	 */;
}
 