package com.p2p.qiyun.lsx.entity;
/**
  * 第一申请借款实体类
 * @author 喜哥
 *
 */
public class LoanOne {

	private int loanid;  //申请编号
	private int userid; //用户id
	private String loanname; //姓名
	private String identity;//身份证号
	private String lphone; //电话号
	private int amount; //借款期望金额
	private int amperiods; //借款期望期数（月）
	
	public LoanOne() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "LoanOne [loanid=" + loanid + ", userid=" + userid + ", loanname=" + loanname + ", identity=" + identity
				+ ", lphone=" + lphone + ", amount=" + amount + ", amperiods=" + amperiods + "]";
	}

	public LoanOne( int userid, String loanname, String identity, String lphone, int amount, int amperiods) {
		super();
		this.userid = userid;
		this.loanname = loanname;
		this.identity = identity;
		this.lphone = lphone;
		this.amount = amount;
		this.amperiods = amperiods;
	}
	public int getLoanid() {
		return loanid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getLoanname() {
		return loanname;
	}
	public void setLoanname(String loanname) {
		this.loanname = loanname;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getLphone() {
		return lphone;
	}
	public void setLphone(String lphone) {
		this.lphone = lphone;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getAmperiods() {
		return amperiods;
	}
	public void setAmperiods(int amperiods) {
		this.amperiods = amperiods;
	}
	
	
}
