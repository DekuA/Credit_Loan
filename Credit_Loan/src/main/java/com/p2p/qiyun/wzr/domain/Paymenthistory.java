package com.p2p.qiyun.wzr.domain;

public class Paymenthistory {

	private int recordid;
	private int repaymentid;
	private int loanid;
	private int userid;
	private double currentrepayment;
	private String storydate;
	private String storydatep;
	private String paymentstatus;
	private Userinfo u;
	private Repayment r;
	private Loan l;
	public int getRecordid() {
		return recordid;
	}
	public void setRecordid(int recordid) {
		this.recordid = recordid;
	}
	public int getRepaymentid() {
		return repaymentid;
	}
	public void setRepaymentid(int repaymentid) {
		this.repaymentid = repaymentid;
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
	public double getCurrentrepayment() {
		return currentrepayment;
	}
	public void setCurrentrepayment(double currentrepayment) {
		this.currentrepayment = currentrepayment;
	}
	public String getStorydate() {
		return storydate;
	}
	public void setStorydate(String storydate) {
		this.storydate = storydate;
	}
	public String getStorydatep() {
		return storydatep;
	}
	public void setStorydatep(String storydatep) {
		this.storydatep = storydatep;
	}
	public String getPaymentstatus() {
		return paymentstatus;
	}
	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	public Userinfo getU() {
		return u;
	}
	public void setU(Userinfo u) {
		this.u = u;
	}
	public Repayment getR() {
		return r;
	}
	public void setR(Repayment r) {
		this.r = r;
	}
	public Loan getL() {
		return l;
	}
	public void setL(Loan l) {
		this.l = l;
	}
	@Override
	public String toString() {
		return "Paymenthistory [recordid=" + recordid + ", repaymentid=" + repaymentid + ", loanid=" + loanid
				+ ", userid=" + userid + ", currentrepayment=" + currentrepayment + ", storydate=" + storydate
				+ ", storydatep=" + storydatep + ", paymentstatus=" + paymentstatus + ", u=" + u + ", r=" + r + ", l="
				+ l + "]";
	}
	public Paymenthistory(int recordid, int repaymentid, int loanid, int userid, double currentrepayment,
			String storydate, String storydatep, String paymentstatus, Userinfo u, Repayment r, Loan l) {
		super();
		this.recordid = recordid;
		this.repaymentid = repaymentid;
		this.loanid = loanid;
		this.userid = userid;
		this.currentrepayment = currentrepayment;
		this.storydate = storydate;
		this.storydatep = storydatep;
		this.paymentstatus = paymentstatus;
		this.u = u;
		this.r = r;
		this.l = l;
	}
	public Paymenthistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
