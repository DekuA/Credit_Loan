package com.p2p.qiyun.hjh.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.p2p.qiyun.hjh.entity.Auditing;
import com.p2p.qiyun.hjh.entity.Loan;
import com.p2p.qiyun.hjh.entity.Query;

public interface LoanService {
	List<Loan> selStatus(HttpSession session,Integer page);
	
	int selectByPrimaryKeys(Integer id, HttpSession session);
	List<Auditing> selauditing(Query q);
	 int suditingcount(Query q);
	 int count(HttpSession session);
}
