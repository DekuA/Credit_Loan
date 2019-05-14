package com.p2p.qiyun.xsr.domain;

public class touxiang {
	private int touid;
	private int userid;
	private String user_src;
	public int getTouid() {
		return touid;
	}
	public void setTouid(int touid) {
		this.touid = touid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUser_src() {
		return user_src;
	}
	public void setUser_src(String user_src) {
		this.user_src = user_src;
	}
	public touxiang(int touid, int userid, String user_src) {
		super();
		this.touid = touid;
		this.userid = userid;
		this.user_src = user_src;
	}
	public touxiang() {
		super();
	}
	
}
