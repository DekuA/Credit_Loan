package com.p2p.qiyun.lsx.dao;

import org.apache.ibatis.annotations.Mapper;
import com.p2p.qiyun.lsx.entity.Loan2;

@Mapper
public interface Loan2Mapper {

	int AddLoans(Loan2 one);
	
	Loan2 selLoansById(int loadid);
}
