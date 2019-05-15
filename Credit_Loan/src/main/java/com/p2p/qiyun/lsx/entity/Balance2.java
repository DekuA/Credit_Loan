package com.p2p.qiyun.lsx.entity;

public class Balance2 {

	private int yueId;
	private int userid;
	private double balance;
	public Balance2() {}
	
	@Override
	public String toString() {
		return "Balance2 [yueId=" + yueId + ", userid=" + userid + ", balance=" + balance + "]";
	}

	public Balance2(int yueId, int userid, double balance) {
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
