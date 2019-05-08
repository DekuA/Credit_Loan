package com.p2p.qiyun.hjh.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;



import com.p2p.qiyun.hjh.entity.Loan;

public interface LoanService {
	List<Loan> selStatus();
	
	int selectByPrimaryKeys(Integer id, HttpServletRequest request);
}
