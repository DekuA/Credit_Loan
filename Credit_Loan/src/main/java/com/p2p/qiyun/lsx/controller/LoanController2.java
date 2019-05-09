package com.p2p.qiyun.lsx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.p2p.qiyun.lsx.entity.Loan;
import com.p2p.qiyun.lsx.service.LoanService2;

@RestController
public class LoanController2 {

	@Autowired
	private LoanService2 loans;
	
	
	@RequestMapping("loansAdd")
	public int addLoans(String uid,String lixi,String amo,String aper,String lixis) {
	
	 	 int userid=Integer.parseInt(uid);
		 double loanamount = Double.parseDouble(amo);
		 double amperiods=Double.parseDouble(aper); 
	     double loanrate=Double.parseDouble(lixis);   
		 Loan one=new Loan(userid,  loanrate, loanamount, amperiods);
		 int addLoans = loans.addLoans(one);
		 System.out.println(addLoans);
		
		return addLoans;
	}
	
	
}
