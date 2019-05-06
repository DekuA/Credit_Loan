package com.p2p.qiyun.wzr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.p2p.qiyun.wzr.domain.userinfo;
@Mapper
public interface UserinfoMapper {

	//用户登录
	userinfo UserEntry(String phone);
	//用户注册
	int UserEnroll(userinfo user);
	//验证手机号是否存在
	int UserCode(userinfo user);
	//登录成功之后添加当前时间
	int UserTime(String phone);
	//注册成功插入客户信息表
	int charukuhuxinxi(int userid);
}
