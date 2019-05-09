package com.p2p.qiyun.lsx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.lsx.dao.LoanMapper2;
import com.p2p.qiyun.lsx.entity.Loan;

@Service
public class LoanServiceImpol2 implements LoanService2 {

	@Autowired
	private LoanMapper2 loan;
	
	

	@Override
	public int addLoans(Loan one) {
		
		return loan.addLoans(one);
	}

}
