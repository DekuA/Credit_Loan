package com.p2p.qiyun.lsx.dao;

import org.apache.ibatis.annotations.Mapper;

import com.p2p.qiyun.lsx.entity.Loan;

@Mapper
public interface LoanMapper2 {

	int addLoans(Loan one);
	
}
