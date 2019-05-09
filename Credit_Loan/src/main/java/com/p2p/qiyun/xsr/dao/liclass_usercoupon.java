package com.p2p.qiyun.xsr.dao;

public class liclass_usercoupon {
	
	private int cpId;
	private int userid;
	private int  couponId;
	private int couponNum;
	private String  cptime;
	private String couponmoney;
	private String couponType;
	public liclass_usercoupon() {
		super();
	}
	public liclass_usercoupon(int cpId, int userid, int couponId, int couponNum, String cptime, String couponmoney,
			String couponType) {
		super();
		this.cpId = cpId;
		this.userid = userid;
		this.couponId = couponId;
		this.couponNum = couponNum;
		this.cptime = cptime;
		this.couponmoney = couponmoney;
		this.couponType = couponType;
	}
	public int getCpId() {
		return cpId;
	}
	public void setCpId(int cpId) {
		this.cpId = cpId;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getCouponId() {
		return couponId;
	}
	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}
	public int getCouponNum() {
		return couponNum;
	}
	public void setCouponNum(int couponNum) {
		this.couponNum = couponNum;
	}
	public String getCptime() {
		return cptime;
	}
	public void setCptime(String cptime) {
		this.cptime = cptime;
	}
	public String getCouponmoney() {
		return couponmoney;
	}
	public void setCouponmoney(String couponmoney) {
		this.couponmoney = couponmoney;
	}
	public String getCouponType() {
		return couponType;
	}
	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}
	@Override
	public String toString() {
		return "liclass_usercoupon [cpId=" + cpId + ", userid=" + userid + ", couponId=" + couponId + ", couponNum="
				+ couponNum + ", cptime=" + cptime + ", couponmoney=" + couponmoney + ", couponType=" + couponType
				+ "]";
	}
}
