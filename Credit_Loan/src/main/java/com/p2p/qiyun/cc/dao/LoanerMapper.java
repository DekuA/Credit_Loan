package com.p2p.qiyun.cc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.p2p.qiyun.cc.pojo.Loan;



@Mapper
public interface LoanerMapper {
	//根据用户id查询借款
	List<Loan> selectLoan(int userid);
}
