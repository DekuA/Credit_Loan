package com.p2p.qiyun.wzr.service;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import com.p2p.qiyun.wzr.domain.userinfo;

public interface UserinfoService {

	userinfo UserEntry(String phone);
	List<userinfo> userlogin(userinfo user);
	
	int UserEnroll(userinfo user);
	
	int UserCode(userinfo user);
	
	int UserTime(String phone);
	int charukuhuxinxi(int userid);
}
