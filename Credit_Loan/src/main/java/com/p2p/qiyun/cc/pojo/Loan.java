package com.p2p.qiyun.cc.pojo;

public class Loan {
	private int loanid;
	private Integer userid;
	private double loanrate;
	private String applicationdate;
	private double loanamount;
	private double repaymentperiod;
	private int approvalstatus;
	private int approver;
	private Userinfo u;
	private Users uu;
	private Usersfz uuu;
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Loan(int loanid, Integer userid, double loanrate, String applicationdate, double loanamount,
			double repaymentperiod, int approvalstatus, int approver, Userinfo u, Users uu, Usersfz uuu) {
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
		this.uu = uu;
		this.uuu = uuu;
	}
	public int getLoanid() {
		return loanid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
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
	public int getApprovalstatus() {
		return approvalstatus;
	}
	public void setApprovalstatus(int approvalstatus) {
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
	public Users getUu() {
		return uu;
	}
	public void setUu(Users uu) {
		this.uu = uu;
	}
	public Usersfz getUuu() {
		return uuu;
	}
	public void setUuu(Usersfz uuu) {
		this.uuu = uuu;
	}
	@Override
	public String toString() {
		return "Loan [loanid=" + loanid + ", userid=" + userid + ", loanrate=" + loanrate + ", applicationdate="
				+ applicationdate + ", loanamount=" + loanamount + ", repaymentperiod=" + repaymentperiod
				+ ", approvalstatus=" + approvalstatus + ", approver=" + approver + ", u=" + u + ", uu=" + uu + ", uuu="
				+ uuu + "]";
	}
	
	
	
	
	
	
}
