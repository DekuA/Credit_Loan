package com.p2p.qiyun.cjz.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.p2p.qiyun.cjz.domain.customer;
import com.p2p.qiyun.cjz.domain.userinfo;
@Mapper
public interface kahaoxxMapper {
	int ccount(String username);
	List<customer> seluser(customer c);
	/* List<customer> mohu(customer c); */
	List<customer> selkahao(int userid);
}
 