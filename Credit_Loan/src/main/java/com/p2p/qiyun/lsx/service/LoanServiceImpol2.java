package com.p2p.qiyun.lsx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.lsx.dao.Loan2Mapper;
import com.p2p.qiyun.lsx.entity.Loan2;
import com.p2p.qiyun.lsx.entity.Paymenthistory2;
import com.p2p.qiyun.lsx.entity.Repayment2;

@Service
public class LoanServiceImpol2 implements LoanService2 {

	@Autowired
	private Loan2Mapper loan;

	@Override
	public int AddLoans(Loan2 one) {
		int loans = loan.AddLoans(one);
		return loans;
	}

	@Override
	public List<Loan2> selctloan(int uid) {
		
		List<Loan2> selctloan = loan.selctloan(uid);
		
		return selctloan;
	}

	@Override
	public Paymenthistory2 getDatetoday(int uid) {
		Paymenthistory2 datetoday = loan.getDatetoday(uid);
		
		return  datetoday;
	}

	@Override
	public Paymenthistory2 getDatenextmonth(int uids) {
		Paymenthistory2 datenextmonth = loan.getDatenextmonth(uids);
		return datenextmonth;
	}

	@Override
	public List<Paymenthistory2> getDates(int uid) {
		
		List<Paymenthistory2> date = loan.getDates(uid);
		
		return date;
	}

	@Override
	public Repayment2 selctRepayment(int userid) {
		 Repayment2 selctRepayment = loan.selctRepayment(userid);
		return selctRepayment;
	}

	@Override
	public Repayment2 selctRepaymentNext(int userid) {
		Repayment2 next = loan.selctRepaymentNext(userid);
		return next;
	}
	

}
