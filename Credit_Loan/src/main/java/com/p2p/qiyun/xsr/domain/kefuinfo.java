package com.p2p.qiyun.xsr.domain;

public class kefuinfo {
	private int kfxxid;
	private int userid;
	private int uid;
	private String kfnr;
	private int  qiuid;
	private String fasongdate;
	@Override
	public String toString() {
		return "kefuinfo [kfxxid=" + kfxxid + ", userid=" + userid + ", uid=" + uid + ", kfnr=" + kfnr + ", qiuid="
				+ qiuid + "]";
	}
	public kefuinfo() {
		super();
	}
	public kefuinfo(int kfxxid, int userid, int uid, String kfnr, int qiuid,String fasongdate) {
		super();
		this.kfxxid = kfxxid;
		this.userid = userid;
		this.uid = uid;
		this.kfnr = kfnr;
		this.qiuid = qiuid;
		this.fasongdate = fasongdate;
	}
	public String getFasongdate() {
		return fasongdate;
	}
	public void setFasongdate(String fasongdate) {
		this.fasongdate = fasongdate;
	}
	public int getKfxxid() {
		return kfxxid;
	}
	public void setKfxxid(int kfxxid) {
		this.kfxxid = kfxxid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getKfnr() {
		return kfnr;
	}
	public void setKfnr(String kfnr) {
		this.kfnr = kfnr;
	}
	public int getQiuid() {
		return qiuid;
	}
	public void setQiuid(int qiuid) {
		this.qiuid = qiuid;
	}
}
