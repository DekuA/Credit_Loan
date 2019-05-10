package com.p2p.qiyun.lsx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.lsx.dao.IdVerificationMapper;
import com.p2p.qiyun.wzr.domain.Userinfo;


@Service
public class VerificationServiceImpol implements VerificationService {

	@Autowired
	private IdVerificationMapper Idsver;
	
	@Override
	public Userinfo useridVerification(int uid) {
		
		return Idsver.useridVerification(uid);
	}

}
