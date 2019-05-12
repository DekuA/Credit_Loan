package com.p2p.qiyun.dby.pojo;

public class account {
	public account(int accountid, int userid, String username, String record, String recordtime) {
		super();
		this.accountid = accountid;
		this.userid = userid;
		this.username = username;
		this.record = record;
		this.recordtime = recordtime;
	}
	@Override
	public String toString() {
		return "account [accountid=" + accountid + ", userid=" + userid + ", username=" + username + ", record="
				+ record + ", recordtime=" + recordtime + "]";
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public String getRecordtime() {
		return recordtime;
	}
	public void setRecordtime(String recordtime) {
		this.recordtime = recordtime;
	}
	
	public account() {};
	private int accountid;
	private int userid;
	private String username;
	private String record;
	private String recordtime;
}
