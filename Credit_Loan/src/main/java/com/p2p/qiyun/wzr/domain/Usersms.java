package com.p2p.qiyun.wzr.domain;

public class Usersms {

	private int smsid;
	private String mobile;
	private String smscode;
	private String expiredtime;
	private int smstype;
	public int getSmsid() {
		return smsid;
	}
	public void setSmsid(int smsid) {
		this.smsid = smsid;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getSmscode() {
		return smscode;
	}
	public void setSmscode(String smscode) {
		this.smscode = smscode;
	}
	public String getExpiredtime() {
		return expiredtime;
	}
	public void setExpiredtime(String expiredtime) {
		this.expiredtime = expiredtime;
	}
	public int getSmstype() {
		return smstype;
	}
	public void setSmstype(int smstype) {
		this.smstype = smstype;
	}
	public Usersms(int smsid, String mobile, String smscode, String expiredtime, int smstype) {
		super();
		this.smsid = smsid;
		this.mobile = mobile;
		this.smscode = smscode;
		this.expiredtime = expiredtime;
		this.smstype = smstype;
	}
	public Usersms() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Usersms [smsid=" + smsid + ", mobile=" + mobile + ", smscode=" + smscode + ", expiredtime="
				+ expiredtime + ", smstype=" + smstype + "]";
	}
}
