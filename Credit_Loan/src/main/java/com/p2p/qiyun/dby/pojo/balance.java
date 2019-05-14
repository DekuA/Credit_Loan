package com.p2p.qiyun.dby.pojo;

public class balance {

	@Override
	public String toString() {
		return "balance [userid=" + userid + ", balance=" + balance + ", payPwd=" + payPwd + "]";
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public balance() {}
	public balance(int userid, int balance, String payPwd) {
		super();
		this.userid = userid;
		this.balance = balance;
		this.payPwd = payPwd;
	}
	public String getPayPwd() {
		return payPwd;
	}
	public void setPayPwd(String payPwd) {
		this.payPwd = payPwd;
	}
	private int userid;
	private int balance;
	private String payPwd;
}
