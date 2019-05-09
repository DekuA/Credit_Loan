package com.p2p.qiyun.hjh.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.p2p.qiyun.hjh.entity.Loan;
import com.p2p.qiyun.hjh.service.LoanService;

@RestController
public class LoanController {
	@Autowired
	private LoanService loanservice;

	@RequestMapping("selStatus")
	public List<Loan> selStatus() {

		List<Loan> selStatus = loanservice.selStatus();

		return selStatus;
	}

	@RequestMapping("selectByPrimary")
	public int Auditing(Integer userid, HttpServletRequest request) {

		return loanservice.selectByPrimaryKeys(userid, request);

	}
}
