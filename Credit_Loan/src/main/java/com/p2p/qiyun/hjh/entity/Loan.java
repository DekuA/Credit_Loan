package com.p2p.qiyun.hjh.entity;

import java.util.Date;

public class Loan {
    private Integer loanid;

    private Integer userid;

    private Double loanrate;

    private Date applicationdate;

    private Double loanamount;

    private Double repaymentperiod;

    private String approvalstatus;
public Loan() {
	// TODO Auto-generated constructor stub
}
    public Loan(Integer approver) {
		super();
		this.approver = approver;
	}

	@Override
	public String toString() {
		return "Loan [loanid=" + loanid + ", userid=" + userid + ", loanrate=" + loanrate + ", applicationdate="
				+ applicationdate + ", loanamount=" + loanamount + ", repaymentperiod=" + repaymentperiod
				+ ", approvalstatus=" + approvalstatus + ", approver=" + approver + ", userinfo=" + userinfo + "]";
	}

	private Integer approver;

   private Userinfo userinfo;

public Integer getLoanid() {
	return loanid;
}

public void setLoanid(Integer loanid) {
	this.loanid = loanid;
}

public Integer getUserid() {
	return userid;
}

public void setUserid(Integer userid) {
	this.userid = userid;
}

public Double getLoanrate() {
	return loanrate;
}

public void setLoanrate(Double loanrate) {
	this.loanrate = loanrate;
}

public Date getApplicationdate() {
	return applicationdate;
}

public void setApplicationdate(Date applicationdate) {
	this.applicationdate = applicationdate;
}

public Double getLoanamount() {
	return loanamount;
}

public void setLoanamount(Double loanamount) {
	this.loanamount = loanamount;
}

public Double getRepaymentperiod() {
	return repaymentperiod;
}

public void setRepaymentperiod(Double repaymentperiod) {
	this.repaymentperiod = repaymentperiod;
}

public String getApprovalstatus() {
	return approvalstatus;
}

public void setApprovalstatus(String approvalstatus) {
	this.approvalstatus = approvalstatus;
}

public Integer getApprover() {
	return approver;
}

public void setApprover(Integer approver) {
	this.approver = approver;
}

public Userinfo getUserinfo() {
	return userinfo;
}

public void setUserinfo(Userinfo userinfo) {
	this.userinfo = userinfo;
}
}