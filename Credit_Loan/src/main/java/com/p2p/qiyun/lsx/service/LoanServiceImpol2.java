package com.p2p.qiyun.lsx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.lsx.dao.Loan2Mapper;
import com.p2p.qiyun.lsx.entity.Balance2;
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
	public Loan2 selctloan(int uid) {
		
		Loan2 selctloan = loan.selctloan(uid);
		
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
	
	public Loan2 selLoansById(int loadid) {
		Loan2 loan2 = loan.selLoansById(loadid);
		return loan2;
	}

	@Override
	public Loan2 SelectAge(int uid) {
		Loan2 age = loan.SelectAge(uid);
		return age;
	}

	@Override
	public int Upbalace(Balance2 balance2) {
		int upbalace = loan.Upbalace(balance2);
		return upbalace;
	}

	@Override
	public int upRepayment(Repayment2 repay) {
		int i = loan.upRepayment(repay);
		return i;
	}

	@Override
	public int upthis(Paymenthistory2 paymenthistory) {
		int upthis = loan.upthis(paymenthistory);
		if(upthis>0) {
			Paymenthistory2 findJine = loan.findJine(paymenthistory.getUserid(), paymenthistory.getRecordid());
			System.out.println(findJine.getCurrentrepayment()+"该还");
			System.out.println(findJine.getTodayMoneys());
			
			if(findJine.getCurrentrepayment()==findJine.getTodayMoneys()) {
				//如果应还金额等于已还金额 那么显示已还
				int upPaymentstatus = loan.upPaymentstatus(paymenthistory.getUserid(), paymenthistory.getRecordid());
				int upReturnperiod = loan.upReturnperiod(paymenthistory.getUserid());
				System.out.println("修改期限"+upReturnperiod);
				System.out.println("还款成功"+upPaymentstatus);
			}
		}
		
		return upthis;
	}

	@Override
	public int upPaymentstatus(int uid, int recordid) {
		// TODO Auto-generated method stub
		return loan.upPaymentstatus(uid, recordid);
	}

	@Override
	public Paymenthistory2 findJine(int uid, int recordid) {
		
		Paymenthistory2 findJine = loan.findJine(uid, recordid);
		return findJine;
	}

}
