package com.p2p.qiyun.wzr.service;

import java.util.List;

import com.p2p.qiyun.wzr.domain.userinfo;

public interface UserinfoService {

	userinfo UserEntry(String phone);
	
	int UserEnroll(userinfo user);
	
	int UserCode(userinfo user);
	
	int UserTime(String phone);
	
	int charukuhuxinxi(int userid);
}
