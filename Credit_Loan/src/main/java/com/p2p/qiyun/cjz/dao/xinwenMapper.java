package com.p2p.qiyun.cjz.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.p2p.qiyun.cjz.domain.customer;
import com.p2p.qiyun.cjz.domain.news;
import com.p2p.qiyun.cjz.domain.userinfo;
@Mapper
public interface xinwenMapper {
	List<news> listnews(news e);
	int countnews();
	int deletenews(int[] idlist);
	int newsadd(news s);
	int updatenews(news s);
	news selid(int id);
}
 