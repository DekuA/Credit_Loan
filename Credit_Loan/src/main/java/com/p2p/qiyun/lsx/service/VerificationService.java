package com.p2p.qiyun.lsx.service;

import com.p2p.qiyun.hjh.entity.Customer;
import com.p2p.qiyun.lsx.entity.Balance2;
import com.p2p.qiyun.wzr.domain.Userinfo;

public interface VerificationService {


	Userinfo useridVerification(int uid);
	
	Balance2 findBalance(int uid);
	
	Customer findCustomer(int uid);
}
