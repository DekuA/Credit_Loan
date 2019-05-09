package com.p2p.qiyun.cc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.p2p.qiyun.cc.pojo.Userinfo;

@Mapper
public interface UserinfoerMapper {
	//查询所有
	List<Userinfo> userinfo();
}
