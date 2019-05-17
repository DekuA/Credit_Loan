package com.p2p.qiyun.wzr.domain;

import java.util.List;

public class VoluntarilyVo {

	private Integer userid;
	private Double balance;
	private List<Integer> userids;
	private List<Double> balances;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public List<Integer> getUserids() {
		return userids;
	}
	public void setUserids(List<Integer> userids) {
		this.userids = userids;
	}
	public List<Double> getBalances() {
		return balances;
	}
	public void setBalances(List<Double> balances) {
		this.balances = balances;
	}
	public VoluntarilyVo(Integer userid, Double balance) {
		super();
		this.userid = userid;
		this.balance = balance;
	}
	public VoluntarilyVo(List<Integer> userids, List<Double> balances) {
		super();
		this.userids = userids;
		this.balances = balances;
	}
	public VoluntarilyVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "VoluntarilyVo [userid=" + userid + ", balance=" + balance + ", userids=" + userids + ", balances="
				+ balances + "]";
	}
}
