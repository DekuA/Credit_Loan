package com.p2p.qiyun.hjh.entity;

public class Balance {

	private int yueId;
	private int userid;
	private double balance;
	public Balance() {}
	
	@Override
	public String toString() {
		return "Balance2 [yueId=" + yueId + ", userid=" + userid + ", balance=" + balance + "]";
	}

	public Balance(int yueId, int userid, double balance) {
		super();
		this.yueId = yueId;
		this.userid = userid;
		this.balance = balance;
	}
	public int getYueId() {
		return yueId;
	}
	public void setYueId(int yueId) {
		this.yueId = yueId;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
