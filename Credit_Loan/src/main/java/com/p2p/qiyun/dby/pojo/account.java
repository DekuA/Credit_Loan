package com.p2p.qiyun.dby.pojo;

public class account {

	@Override
	public String toString() {
		return "account [accountid=" + accountid + ", userid=" + userid + ", username=" + username + ", record="
				+ record + ", recordtime=" + recordtime + ", startTime=" + startTime + ", endTime=" + endTime + "]";
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


	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public account(int accountid, int userid, String username, String record, String recordtime, String startTime,
			String endTime) {
		super();
		this.accountid = accountid;
		this.userid = userid;
		this.username = username;
		this.record = record;
		this.recordtime = recordtime;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getAccountid() {
		return accountid;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	private int accountid;
	private int userid;
	private String username;
	private String record;
	private String recordtime;
	private String startTime;
	private String endTime;
}
