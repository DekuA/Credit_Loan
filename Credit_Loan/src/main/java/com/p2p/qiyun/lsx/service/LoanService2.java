package com.p2p.qiyun.lsx.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.p2p.qiyun.lsx.entity.Loan2;
import com.p2p.qiyun.lsx.entity.Paymenthistory2;
import com.p2p.qiyun.lsx.entity.Repayment2;

public interface LoanService2 {

	    //借款新增
	    int AddLoans(Loan2 one);
	 
	    //查询当月应还金额
	    //Loan2 selctloan(int uid,int lid);
    	Loan2 selctloan(int uid);
	
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
