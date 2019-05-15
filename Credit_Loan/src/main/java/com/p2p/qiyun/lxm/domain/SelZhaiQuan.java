package com.p2p.qiyun.lxm.domain;

public class SelZhaiQuan {
	private double money1;
	private double money2;
	private int month1;
	private int month2;
	private String sfyq;
	public double getMoney1() {
		return money1;
	}
	public void setMoney1(double money1) {
		this.money1 = money1;
	}
	public double getMoney2() {
		return money2;
	}
	public void setMoney2(double money2) {
		this.money2 = money2;
	}
	public int getMonth1() {
		return month1;
	}
	public void setMonth1(int month1) {
		this.month1 = month1;
	}
	public int getMonth2() {
		return month2;
	}
	public void setMonth2(int month2) {
		this.month2 = month2;
	}
	public String getSfyq() {
		return sfyq;
	}
	public void setSfyq(String sfyq) {
		this.sfyq = sfyq;
	}
	public SelZhaiQuan(double money1, double money2, int month1, int month2, String sfyq) {
		super();
		this.money1 = money1;
		this.money2 = money2;
		this.month1 = month1;
		this.month2 = month2;
		this.sfyq = sfyq;
	}
	public SelZhaiQuan() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SelZhaiQuan [money1=" + money1 + ", money2=" + money2 + ", month1=" + month1 + ", month2=" + month2
				+ ", sfyq=" + sfyq + "]";
	}
	
}
