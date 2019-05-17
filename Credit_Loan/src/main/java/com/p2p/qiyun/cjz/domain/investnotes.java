package com.p2p.qiyun.cjz.domain;

public class investnotes {
	private int iid;
	private String iMoney;
	private String idate;
	private String userid;
	private String pid;
	private int ptrans;
	private double ptransmoney;
	private String username;
	private String pname;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public investnotes(int iid, String iMoney, String idate, String username, String pname, int page, int rows) {
		super();
		this.iid = iid;
		this.iMoney = iMoney;
		this.idate = idate;
		this.username = username;
		this.pname = pname;
		this.page = page;
		this.rows = rows;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	private int page;
	private int rows;
	public investnotes(int page, int rows) {
		super();
		this.iid = iid;
		this.iMoney = iMoney;
		this.idate = idate;
		this.username = username;
		this.pname = pname;
		this.page = page;
		this.rows = rows;
	}
	public investnotes(int page, int rows,String username,String pname) {
		super();
		
		this.page = page;
		this.rows = rows;
		this.username = username;
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getiMoney() {
		return iMoney;
	}
	public void setiMoney(String iMoney) {
		this.iMoney = iMoney;
	}
	public String getIdate() {
		return idate;
	}
	public void setIdate(String idate) {
		this.idate = idate;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public int getPtrans() {
		return ptrans;
	}
	public void setPtrans(int ptrans) {
		this.ptrans = ptrans;
	}
	public investnotes(int iid, String iMoney, String idate, String userid, String pid, int ptrans, double ptransmoney,int page, int rows) {
		super();
		this.iid = iid;
		this.iMoney = iMoney;
		this.idate = idate;
		this.userid = userid;
		this.pid = pid;
		this.ptrans = ptrans;
		this.ptransmoney = ptransmoney;
		this.page = page;
		this.rows = rows;
	}
	public double getPtransmoney() {
		return ptransmoney;
	}
	public void setPtransmoney(double ptransmoney) {
		this.ptransmoney = ptransmoney;
	}
	@Override
	public String toString() {
		return "investnotes [username=" + username + ", pname=" + pname + ", page=" + page + ", rows=" + rows + "]";
	}
	public investnotes() {}
	public investnotes(int iid, String iMoney, String idate, String userid, String pid, int ptrans,double ptransmoney) {
		super();
		this.iid = iid;
		this.iMoney = iMoney;
		this.idate = idate;
		this.userid = userid;
		this.pid = pid;
		this.ptrans = ptrans;
		this.ptransmoney=ptransmoney;
	}

}
