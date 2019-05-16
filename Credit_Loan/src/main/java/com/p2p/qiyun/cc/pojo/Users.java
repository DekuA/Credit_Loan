package com.p2p.qiyun.cc.pojo;

public class Users {
	private int uid;
	private String loginname;
	private String pwd;
	private String username;
	private String sex;
	private String datebirth;
	private String xueli;
	private String job;
	private int did;
	private int rid;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int uid, String loginname, String pwd, String username, String sex, String datebirth, String xueli,
			String job, int did, int rid) {
		super();
		this.uid = uid;
		this.loginname = loginname;
		this.pwd = pwd;
		this.username = username;
		this.sex = sex;
		this.datebirth = datebirth;
		this.xueli = xueli;
		this.job = job;
		this.did = did;
		this.rid = rid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDatebirth() {
		return datebirth;
	}
	public void setDatebirth(String datebirth) {
		this.datebirth = datebirth;
	}
	public String getXueli() {
		return xueli;
	}
	public void setXueli(String xueli) {
		this.xueli = xueli;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	@Override
	public String toString() {
		return "Users [uid=" + uid + ", loginname=" + loginname + ", pwd=" + pwd + ", username=" + username + ", sex="
				+ sex + ", datebirth=" + datebirth + ", xueli=" + xueli + ", job=" + job + ", did=" + did + ", rid="
				+ rid + "]";
	}
	
	
}
