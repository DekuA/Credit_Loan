package com.p2p.qiyun.wzr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.p2p.qiyun.wzr.domain.Userinfo;
import com.p2p.qiyun.wzr.domain.Usersms;
@Mapper
public interface UserinfoMapper {
	Userinfo seluserById(int userid);
	//添加验证码
	int smsinsert(Usersms sms);
	Usersms smsselect(String mobile);
	//用户登录
	Userinfo UserEntry(String user);
	List<Userinfo> userlogin(Userinfo user);
	//用户注册
	int UserEnroll(Userinfo user);
	//验证手机号是否存在
	int UserCode(Userinfo user);
	//登录成功之后添加当前时间
	int UserTime(String phone);
	//注册成功插入客户信息表
	int charukuhuxinxi(int userid);
	//忘记密码
	Usersms smsselect2(String mobile);
	Userinfo forgetphone(String Phone);
	int forgetupdate(Userinfo user);
}
