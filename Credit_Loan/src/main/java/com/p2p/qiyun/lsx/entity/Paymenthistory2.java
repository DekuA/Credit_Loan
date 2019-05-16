package com.p2p.qiyun.lsx.entity;

import java.sql.Timestamp;

public class Paymenthistory2 {

	
	private int recordid;
	private int repaymentid;
	private int userid;
	private int loanid;
	private double currentrepayment;
	private String storydate;
	private String  storydatep;
	private String paymentstatus;
	private double todayMoneys;
	
	
	public Paymenthistory2(int repaymentid, int userid, int loanid, double currentrepayment,
			String storydate) {
		super();
		this.repaymentid = repaymentid;
		this.userid = userid;
		this.loanid = loanid;
		this.currentrepayment = currentrepayment;
		this.storydate = storydate;
	}

	public Paymenthistory2(int recordid, int repaymentid, int userid, int loanid, double currentrepayment,
			String storydate, String storydatep, String paymentstatus, double todayMoneys) {
		super();
		this.recordid = recordid;
		this.repaymentid = repaymentid;
		this.userid = userid;
		this.loanid = loanid;
		this.currentrepayment = currentrepayment;
		this.storydate = storydate;
		this.storydatep = storydatep;
		this.paymentstatus = paymentstatus;
		this.todayMoneys = todayMoneys;
	}

	public double getTodayMoneys() {
		return todayMoneys;
	}

	public void setTodayMoneys(double todayMoneys) {
		this.todayMoneys = todayMoneys;
	}

	public Paymenthistory2() {}
	
	@Override
	public String toString() {
		return "Paymenthistory2 [recordid=" + recordid + ", repaymentid=" + repaymentid + ", userid=" + userid
				+ ", loanid=" + loanid + ", currentrepayment=" + currentrepayment + ", storydate=" + storydate
				+ ", storydatep=" + storydatep + ", paymentstatus=" + paymentstatus + "]";
	}
    public Paymenthistory2(String storydatep,int userid,double todayMoneys,int recordid) {
    	this.userid = userid;
    	this.storydatep = storydatep;
    	this.recordid = recordid;
    	this.todayMoneys = todayMoneys;
    }
    
	public Paymenthistory2(int recordid, int repaymentid, int userid, int loanid, double currentrepayment,
			String storydate, String storydatep, String paymentstatus) {
		super();
		this.recordid = recordid;
		this.repaymentid = repaymentid;
		this.userid = userid;
		this.loanid = loanid;
		this.currentrepayment = currentrepayment;
		this.storydate = storydate;
		this.storydatep = storydatep;
		this.paymentstatus = paymentstatus;
	}
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
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getLoanid() {
		return loanid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
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
	
	
}
