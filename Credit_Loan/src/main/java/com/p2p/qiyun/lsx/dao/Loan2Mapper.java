package com.p2p.qiyun.lsx.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.p2p.qiyun.lsx.entity.Balance2;
import com.p2p.qiyun.lsx.entity.Loan2;
import com.p2p.qiyun.lsx.entity.Paymenthistory2;
import com.p2p.qiyun.lsx.entity.Repayment2;

@Mapper
public interface Loan2Mapper {

	int AddLoans(Loan2 one);

	int AddRepayment2(Repayment2 repayment2); //新增还款
	
	int AddPaymenthistory2(Paymenthistory2 paymenthistory2);
	
	int upReturnperiod(@Param("userid")int uid);
	
	//修改成已还款
	int upPaymentstatus(@Param("userid")int uid,@Param("recordid")int recordid);
	
	//查询金额
	Paymenthistory2 findJine(@Param("userid")int uid,@Param("recordid")int recordid);
	
	//还款扣余额
	int Upbalace(Balance2 balance2);
	
	//还款表
	int upRepayment(Repayment2 repay);
	
	//还款记录
	int upthis(Paymenthistory2 paymenthistory);
	
	
	 Loan2 selLoansById(int loadid);

	 Loan2 selctloan(@Param("userid")int uid);
	
	 Loan2 SelectAge (@Param("userid")int uid);
	 
	//Loan2 selctloan(@Param("userid")int uid,@Param("loanid")int lid);
	
	//根据当月时间查询
	Paymenthistory2 getDatetoday(@Param("userid")int uid);
	//根据下个月
	Paymenthistory2 getDatenextmonth(@Param("userid")int uids);
	
	//根据id查询所有
	List<Paymenthistory2> getDates(@Param("userid")int uid);
	
	//查询还款
	Repayment2 selctRepayment(@Param("userid")int userid);
	
	Repayment2 selctRepaymentNext(@Param("userid")int userid);
	
}
