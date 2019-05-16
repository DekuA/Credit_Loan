package com.p2p.qiyun.lsx.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.p2p.qiyun.lsx.entity.Balance2;
import com.p2p.qiyun.lsx.entity.Loan2;
import com.p2p.qiyun.lsx.entity.Paymenthistory2;
import com.p2p.qiyun.lsx.entity.Repayment2;

public interface LoanService2 {

	    //借款新增
	    int AddLoans(Loan2 one);
	   //还款扣余额
	    int Upbalace(Balance2 balance2);
	    
	    
	    int upRepayment(Repayment2 repay);
		
	    //还款
		int upthis(Paymenthistory2 paymenthistory);
		
		//修改成已还款
		int upPaymentstatus(@Param("userid")int uid,@Param("recordid")int recordid);
		
		//查询金额
		Paymenthistory2 findJine(@Param("userid")int uid,@Param("recordid")int recordid);
		
	    //查询当月应还金额
	    //Loan2 selctloan(int uid,int lid);
    	Loan2 selctloan(int uid);
	
    	Loan2 SelectAge (int uid);
    	
	    Loan2 selLoansById(int loadid);

	    //根据当月时间查询
		Paymenthistory2 getDatetoday(int uid);
		//根据下个月
		Paymenthistory2 getDatenextmonth(int uids);
		
		//根据id查询所有
		List<Paymenthistory2> getDates(int uid);
		
		Repayment2 selctRepayment(int userid);
		
		Repayment2 selctRepaymentNext(int userid);
}
