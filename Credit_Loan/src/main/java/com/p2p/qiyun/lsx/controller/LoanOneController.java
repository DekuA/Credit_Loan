package com.p2p.qiyun.lsx.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.lsx.entity.LoanOne;
import com.p2p.qiyun.lsx.service.LoanOneService;

@RestController
public class LoanOneController {

	@Autowired
	private LoanOneService loan;
	
	@RequestMapping("addLoanOne")
	public int addLoanOne(String uid,String loanname,String identity,String phone,String amo,String aper) {
		
		 int userid = Integer.parseInt(uid);
		
		 int amount = Integer.parseInt(amo); 
		 int amperiods=Integer.parseInt(aper); 
		 LoanOne  one1=new LoanOne(userid, loanname, identity, phone, amount, amperiods);
		 
		
		int addLoanOne = loan.addLoanOne(one1);
		return addLoanOne;
	}
	
	
	
}
