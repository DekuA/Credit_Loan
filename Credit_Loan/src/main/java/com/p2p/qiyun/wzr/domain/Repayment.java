package com.p2p.qiyun.wzr.domain;

public class Repayment {

	private int repaymentid;
	private int loanid;
	private int userid;
	private double rterest;
	private double returnallmoney;
	private String rdate;
	private int returnperiod;
	private int returnperiodp;
	private double modmoney;
	private String username;
	public int getRepaymentid() {
		return repaymentid;
	}
	public void setRepaymentid(int repaymentid) {
		this.repaymentid = repaymentid;
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
	public double getRterest() {
		return rterest;
	}
	public void setRterest(double rterest) {
		this.rterest = rterest;
	}
	public double getReturnallmoney() {
		return returnallmoney;
	}
	public void setReturnallmoney(double returnallmoney) {
		this.returnallmoney = returnallmoney;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public int getReturnperiod() {
		return returnperiod;
	}
	public void setReturnperiod(int returnperiod) {
		this.returnperiod = returnperiod;
	}
	public int getReturnperiodp() {
		return returnperiodp;
	}
	public void setReturnperiodp(int returnperiodp) {
		this.returnperiodp = returnperiodp;
	}
	public double getModmoney() {
		return modmoney;
	}
	public void setModmoney(double modmoney) {
		this.modmoney = modmoney;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Repayment(int repaymentid, int loanid, int userid, double rterest, double returnallmoney, String rdate,
			int returnperiod, int returnperiodp, double modmoney, String username) {
		super();
		this.repaymentid = repaymentid;
		this.loanid = loanid;
		this.userid = userid;
		this.rterest = rterest;
		this.returnallmoney = returnallmoney;
		this.rdate = rdate;
		this.returnperiod = returnperiod;
		this.returnperiodp = returnperiodp;
		this.modmoney = modmoney;
		this.username = username;
	}
	public Repayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Repayment [repaymentid=" + repaymentid + ", loanid=" + loanid + ", userid=" + userid + ", rterest="
				+ rterest + ", returnallmoney=" + returnallmoney + ", rdate=" + rdate + ", returnperiod=" + returnperiod
				+ ", returnperiodp=" + returnperiodp + ", modmoney=" + modmoney + ", username=" + username + "]";
	}
}
