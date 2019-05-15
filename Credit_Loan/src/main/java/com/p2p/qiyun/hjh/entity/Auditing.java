package com.p2p.qiyun.hjh.entity;



public class Auditing {
	private Integer aid;

	private Integer aname;

	private String adate;

	private String amoney;

	private Integer astatus;
	public Userinfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	private Userinfo  userinfo;

	public Auditing() {
		// TODO Auto-generated constructor stub
	}

	public Auditing(Integer aname, String adate, String amoney, Integer astatus) {
		super();
		this.aname = aname;
		this.adate = adate;
		this.amoney = amoney;
		this.astatus = astatus;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public Integer getAname() {
		return aname;
	}

	public void setAname(Integer aname) {
		this.aname = aname;
	}

	public String getAdate() {
		return adate;
	}

	public void setAdate(String adate) {
		this.adate = adate == null ? null : adate.trim();
	}

	public String getAmoney() {
		return amoney;
	}

	public void setAmoney(String amoney) {
		this.amoney = amoney == null ? null : amoney.trim();
	}

	public Integer getAstatus() {
		return astatus;
	}

	@Override
	public String toString() {
		return "Auditing [aid=" + aid + ", aname=" + aname + ", adate=" + adate + ", amoney=" + amoney + ", astatus="
				+ astatus + ", userinfo=" + userinfo + "]";
	}

	public void setAstatus(Integer astatus) {
		this.astatus = astatus;
	}
}