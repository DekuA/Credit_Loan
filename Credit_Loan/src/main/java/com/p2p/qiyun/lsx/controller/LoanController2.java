package com.p2p.qiyun.lsx.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.p2p.qiyun.lsx.entity.Loan2;
import com.p2p.qiyun.lsx.service.LoanService2;
import com.p2p.qiyun.lsx.service.VerificationService;
import com.p2p.qiyun.wzr.domain.Userinfo;



@RestController
public class LoanController2 {

	@Autowired
	private LoanService2 loans;
	@Autowired
	private VerificationService ser;
	
	@RequestMapping("loansAdd")
	public int addLoans(String uid,String amo,String aper,String lixis) {
	
	 	 int userid=Integer.parseInt(uid);
		 double loanamount = Double.parseDouble(amo);
		 double amperiods=Double.parseDouble(aper); 
	     double loanrate=Double.parseDouble(lixis);   
		 Loan2 one=new Loan2(userid,  loanrate, loanamount, amperiods);
		int i = loans.AddLoans(one);
		System.out.println(i);
		return i;
	}
	
	@RequestMapping("panlog")
	public int panlog(HttpSession session) {
		Object attribute2 = session.getAttribute("useridss");
		int attribute=0;
		if(attribute2!=null) {
			attribute =  (int) attribute2;
		}
	
	System.out.println("斤斤计较军"+attribute);
	 	if(attribute>0) {
	 		return attribute;
	 	}
		return 0;
	}
	@RequestMapping("panname")
	public int panname(String uid) {
	      int parseInt = Integer.parseInt(uid);
	      if(parseInt>0) {
	    	  Userinfo userinfo = ser.useridVerification(parseInt);
			     if(userinfo.getUsername()!=null && userinfo.getIdnumber()!=null) {
				   return 1;
			      }  
	      }
	       
		return 0;
	}
}
