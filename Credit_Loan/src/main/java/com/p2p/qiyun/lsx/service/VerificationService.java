package com.p2p.qiyun.lsx.service;

import org.apache.ibatis.annotations.Param;

import com.p2p.qiyun.lsx.entity.Balance2;
import com.p2p.qiyun.wzr.domain.Userinfo;

public interface VerificationService {


	Userinfo useridVerification(int uid);
	
	Balance2 findBalance(int uid);
}
