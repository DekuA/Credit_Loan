package com.p2p.qiyun.wzr.service;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import com.p2p.qiyun.wzr.domain.Userinfo;
import com.p2p.qiyun.wzr.domain.Usersms;

public interface UserinfoService {
	Userinfo seluserById(int uid);
	
	int smsinsert(Usersms sms);
	Usersms smsselect(String mobile);
	Usersms smsselect2(String mobile);
	
	Userinfo UserEntry(String phone);
	List<Userinfo> userlogin(Userinfo user);
	
	int UserEnroll(Userinfo user);
	
	int UserCode(Userinfo user);
	
	int UserTime(String phone);
	int charukuhuxinxi(int userid);
	int forgetupdate(Userinfo user);
}
