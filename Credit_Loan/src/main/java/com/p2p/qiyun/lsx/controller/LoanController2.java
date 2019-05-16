package com.p2p.qiyun.lsx.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.dby.pojo.balance;
import com.p2p.qiyun.lsx.entity.Balance2;
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
	
	@RequestMapping("gjloan")
	public int getloancount(String uid) {
		int uids=Integer.parseInt(uid);
		Loan2 selctloan = loans.selctloan(uids);
		if(selctloan==null) {
			return 0;
		}
		return 1;
	}
	//判断年龄
	@RequestMapping("pdAge")
	public int gjAge(String uid) {
		int uids=Integer.parseInt(uid);
		Loan2 selctloan = loans.SelectAge(uids);
		if(selctloan==null) {
			return 0;
		}
		return 1;
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
		//System.out.println(uid+"ssss");
		List<Paymenthistory2> list = loans.getDates(uid);
		System.out.println(list);
		return list;
	}
	
	@RequestMapping("getDatetoday")
	public Paymenthistory2 getDatetoday(String userid2s) {
		int uid = Integer.parseInt(userid2s);
		
			try {
				Paymenthistory2 datetoday = loans.getDatetoday(uid);
			//	System.out.println(datetoday+"qqq");
				
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
				monney=selctRepayment.getTodayMoney();
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
					monney=selctRepayment.getTodayMoney();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			return monney;
		}
		
		@RequestMapping("findsBalance")
		public Balance2 findbalance(String uids22) {
		    	
		     	int uid = Integer.parseInt(uids22);
			
			    Balance2 findBalance = ser.findBalance(uid);
				//System.out.println(findBalance+"余额");
				
			return findBalance;
		}
		
		@RequestMapping("upbalance")
		public int upbalace(String uids,String mima,String modmoney,String storydate,String   jlid){
			int bnum = Integer.parseInt(mima);
			int uid=Integer.parseInt(uids);
			Balance2 balance2=new Balance2(1, uid, bnum);
			int jiluid=Integer.parseInt(jlid);
			Balance2 ba = ser.findBalance(uid);
			double money2 = ba.getBalance()-Double.parseDouble(modmoney);
			balance2.setBalance(money2);
			int upbalace = loans.Upbalace(balance2);
			System.out.println(upbalace+"删除");
			
			Timestamp times=new java.sql.Timestamp(System.currentTimeMillis());
			System.out.println(times);
			if(upbalace>0) {
				double moneys = Double.parseDouble(modmoney);
				System.out.println(modmoney+"momomomo");
				Paymenthistory2 paymenthistory=new Paymenthistory2(times.toString(), uid,jiluid);
				Repayment2 repay=new Repayment2(times, moneys, uid);
				//int upthis = loans.upthis(paymenthistory);
			//	if(upthis>0) {
					int upRepayment = loans.upRepayment(repay);
					System.out.println("还款表"+upRepayment);
					if(upRepayment>0) {
						int upthis = loans.upthis(paymenthistory);
						System.out.println("修还记录表"+upthis);
					}
				//}
			
				//System.out.println("修还记录表"+upthis);
				
				
			}
			return upbalace;
		}		
		
		
}
