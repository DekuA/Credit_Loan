package com.p2p.qiyun.lsx.entity;

public class Loan2 {

	private int loanid;  //申请编号
	private int userid; //用户id
	private double loanrate;//贷款月利息
	private String applicationdate; //申请日期（默认当前时间）
	private double loanamount; //借款期望金额
	private double repaymentperiod; //借款期望期数（月）
	private String approvalstatus; //审批状态
	private int approver;  //(外键)审批人
	
	public Loan2() {
		// TODO Auto-generated constructor stub
	}
	public Loan2(int userid,  double loanrate,
			 double loanamount, double repaymentperiod) {
		super();
		this.userid = userid;
		this.loanrate = loanrate;
		this.loanamount = loanamount;
		this.repaymentperiod = repaymentperiod;
		
	}
	public Loan2(int loanid, int userid, double loanrate,
			String applicationdate, double loanamount, double repaymentperiod, String approvalstatus, int approver) {
		super();
		this.loanid = loanid;
		this.userid = userid;
		this.loanrate = loanrate;
		this.applicationdate = applicationdate;
		this.loanamount = loanamount;
		this.repaymentperiod = repaymentperiod;
		this.approvalstatus = approvalstatus;
		this.approver = approver;
	}
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
	@Override
	public String toString() {
		return "Loan2 [loanid=" + loanid + ", userid=" + userid + ", loanrate=" + loanrate + ", applicationdate="
				+ applicationdate + ", loanamount=" + loanamount + ", repaymentperiod=" + repaymentperiod
				+ ", approvalstatus=" + approvalstatus + ", approver=" + approver + "]";
	}
	
}
