package com.p2p.qiyun.lsx.dao;

import org.apache.ibatis.annotations.Mapper;

import com.p2p.qiyun.lsx.entity.LoanOne;

@Mapper
public interface LoanOneMapper {

	int addLoanOne(LoanOne one);
	
}
