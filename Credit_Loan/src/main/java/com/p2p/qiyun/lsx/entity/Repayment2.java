package com.p2p.qiyun.lsx.entity;

import java.sql.Timestamp;

public class Repayment2 {

	private int repaymentid;
	private int loanid;
	private int userid;
    private double rterest;
    private double returnallmoney;
    private Timestamp rdate;
    private int returnperiod;
    private int returnperiodp;
    private double modmoney;
    private double todayMoney;
    
    public Repayment2(int repaymentid, int loanid, int userid, double rterest, double returnallmoney, Timestamp rdate,
			int returnperiod, int returnperiodp, double modmoney, double todayMoney) {
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
		this.todayMoney = todayMoney;
	}

	public double getTodayMoney() {
		return todayMoney;
	}

	public void setTodayMoney(double todayMoney) {
		this.todayMoney = todayMoney;
	}

	public Repayment2() {}
    
	@Override
	public String toString() {
		return "Repayment2 [repaymentid=" + repaymentid + ", loanid=" + loanid + ", userid=" + userid + ", rterest="
				+ rterest + ", returnallmoney=" + returnallmoney + ", rdate=" + rdate + ", returnperiod=" + returnperiod
				+ ", returnperiodp=" + returnperiodp + ", modmoney=" + modmoney + "]";
	}

	public Repayment2(Timestamp rdate,Double modmoney,int userid) {
		this.modmoney = modmoney;
		this.userid = userid;
		this.rdate = rdate;
	}
	public Repayment2(int repaymentid, int loanid, int userid, double rterest, double returnallmoney, Timestamp rdate,
			int returnperiod, int returnperiodp, double modmoney) {
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
	}
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
	public Timestamp getRdate() {
		return rdate;
	}
	public void setRdate(Timestamp rdate) {
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
    
}

