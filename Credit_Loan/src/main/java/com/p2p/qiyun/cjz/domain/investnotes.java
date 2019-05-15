package com.p2p.qiyun.cjz.domain;

public class investnotes {
	private int iid;
	private String iMoney;
	private String idate;
	private String userid;
	private String pid;
	private int ptrans;
	private double ptransmoney;
	private int page;
	private int rows;
	public investnotes(int page, int rows) {
		super();
		this.page = page;
		this.rows = rows;
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
	@Override
	public String toString() {
		return "investnotes [iid=" + iid + ", iMoney=" + iMoney + ", idate=" + idate + ", userid=" + userid + ", pid="
				+ pid + ", ptrans=" + ptrans + ", page=" + page + ", rows=" + rows + "]";
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
