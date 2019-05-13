package com.p2p.qiyun.lsx.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.p2p.qiyun.lsx.entity.Loan2;
import com.p2p.qiyun.lsx.entity.Paymenthistory2;
import com.p2p.qiyun.lsx.entity.Repayment2;
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
	
	@RequestMapping("loansMoney")
	public List<Paymenthistory2> selectloansm(String userids) {
		int uid = Integer.parseInt(userids);
		System.out.println(uid+"ssss");
		List<Paymenthistory2> list = loans.getDates(uid);
		System.out.println(list);
		return list;
	}
	
	@RequestMapping("getDatetoday")
	public Paymenthistory2 getDatetoday(String userid2s) {
		int uid = Integer.parseInt(userid2s);
		
			try {
				Paymenthistory2 datetoday = loans.getDatetoday(uid);
				System.out.println(datetoday+"qqq");
				
				return datetoday;
			} catch (Exception e) {
				// TODO: handle exception
			}
			return null;
		
	}
	@RequestMapping("getDatenextmonth")
	public Paymenthistory2 getDatenextmonth(String userid1s) {
		int uid = Integer.parseInt(userid1s);
		
		Paymenthistory2 datetoday = null;
	
		try {
			datetoday = loans.getDatenextmonth(uid);
			 if(datetoday==null) {
					return null;
				 }
		} catch (Exception e) {
			
		}
		
		
		return datetoday;
	}
	//当月已还金额
	@RequestMapping("Hasalso")
	public double Hasalso(String uid1s,String lidss) {
		
		double monney=0;
		int uid = Integer.parseInt(uid1s);
		try {
			Repayment2 selctRepayment = loans.selctRepayment(uid);
			
			if(selctRepayment!=null) {
				monney=selctRepayment.getModmoney();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//}
		return monney;
	}
	//次月已还金额
		@RequestMapping("HasalsoNext")
		public double HasalsoNext(String uid2s) {
			double monney=0;
			
			int uid = Integer.parseInt(uid2s);

			try {
				Repayment2 selctRepayment = loans.selctRepaymentNext(uid);
				if(selctRepayment==null) {
					return 0;
				}else {
					monney=selctRepayment.getModmoney();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			return monney;
		}
}
