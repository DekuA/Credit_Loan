package com.p2p.qiyun.lsx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.lsx.dao.Loan2Mapper;
import com.p2p.qiyun.lsx.entity.Loan2;

@Service
public class LoanServiceImpol2 implements LoanService2 {

	@Autowired
	private Loan2Mapper loan;

	@Override
	public int AddLoans(Loan2 one) {
		int loans = loan.AddLoans(one);
		return loans;
	}
	

}
