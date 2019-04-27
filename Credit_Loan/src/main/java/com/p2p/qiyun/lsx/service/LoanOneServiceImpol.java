package com.p2p.qiyun.lsx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.lsx.dao.LoanOneMapper;
import com.p2p.qiyun.lsx.entity.LoanOne;

@Service
public class LoanOneServiceImpol implements LoanOneService {

	@Autowired
	private LoanOneMapper loan;
	
	@Override
	public int addLoanOne(LoanOne one) {
		
		return loan.addLoanOne(one);
	}

}
