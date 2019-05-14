package com.p2p.qiyun.wzr.domain;

public class Loan {

	private int loanid;
	private int userid;
	private double loanrate;
	private String applicationdate;
	private double loanamount;
	private double repaymentperiod;
	private String approvalstatus;
	private int approver;
	private Userinfo u;
	public int getLoanid() {
		return loanid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public double getLoanrate() {
		return loanrate;
	}
	public void setLoanrate(double loanrate) {
		this.loanrate = loanrate;
	}
	public String getApplicationdate() {
		return applicationdate;
	}
	public void setApplicationdate(String applicationdate) {
		this.applicationdate = applicationdate;
	}
	public double getLoanamount() {
		return loanamount;
	}
	public void setLoanamount(double loanamount) {
		this.loanamount = loanamount;
	}
	public double getRepaymentperiod() {
		return repaymentperiod;
	}
	public void setRepaymentperiod(double repaymentperiod) {
		this.repaymentperiod = repaymentperiod;
	}
	public String getApprovalstatus() {
		return approvalstatus;
	}
	public void setApprovalstatus(String approvalstatus) {
		this.approvalstatus = approvalstatus;
	}
	public int getApprover() {
		return approver;
	}
	public void setApprover(int approver) {
		this.approver = approver;
	}
	public Userinfo getU() {
		return u;
	}
	public void setU(Userinfo u) {
		this.u = u;
	}
	public Loan(int loanid, int userid, double loanrate, String applicationdate, double loanamount,
			double repaymentperiod, String approvalstatus, int approver, Userinfo u) {
		super();
		this.loanid = loanid;
		this.userid = userid;
		this.loanrate = loanrate;
		this.applicationdate = applicationdate;
		this.loanamount = loanamount;
		this.repaymentperiod = repaymentperiod;
		this.approvalstatus = approvalstatus;
		this.approver = approver;
		this.u = u;
	}
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Loan [loanid=" + loanid + ", userid=" + userid + ", loanrate=" + loanrate + ", applicationdate="
				+ applicationdate + ", loanamount=" + loanamount + ", repaymentperiod=" + repaymentperiod
				+ ", approvalstatus=" + approvalstatus + ", approver=" + approver + ", u=" + u + "]";
	}
}
