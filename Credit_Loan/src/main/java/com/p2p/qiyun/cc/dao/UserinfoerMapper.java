package com.p2p.qiyun.cc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import com.p2p.qiyun.cc.pojo.Userinfo;
import com.p2p.qiyun.cc.pojo.UserinfoQueryVO;

@Mapper
public interface UserinfoerMapper {
	//查询所有
	List<Userinfo> userinfo(UserinfoQueryVO vo);
	//总数
	Integer count(UserinfoQueryVO v);
	
}
