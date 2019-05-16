package com.p2p.qiyun.cc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.cc.dao.LoanerMapper;
import com.p2p.qiyun.cc.pojo.Loan;

@Service
public class LoanerService {
	@Autowired
	private LoanerMapper mapper;
	
	public List<Loan> selectLoan(int userid){
		List<Loan> list = mapper.selectLoan(userid);
		return list;
		
	}
}
