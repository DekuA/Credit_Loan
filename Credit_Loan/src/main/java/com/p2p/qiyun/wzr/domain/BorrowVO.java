package com.p2p.qiyun.wzr.domain;

public class BorrowVO {

	private int page;
	private int rows;
	private Loan l;
	private Userinfo u;
	private Repayment r;
	private Paymenthistory p;
	private String date1;
	private String date2;
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
	public Loan getL() {
		return l;
	}
	public void setL(Loan l) {
		this.l = l;
	}
	public Userinfo getU() {
		return u;
	}
	public void setU(Userinfo u) {
		this.u = u;
	}
	public Repayment getR() {
		return r;
	}
	public void setR(Repayment r) {
		this.r = r;
	}
	public Paymenthistory getP() {
		return p;
	}
	public void setP(Paymenthistory p) {
		this.p = p;
	}
	public String getDate1() {
		return date1;
	}
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	public String getDate2() {
		return date2;
	}
	public void setDate2(String date2) {
		this.date2 = date2;
	}
	public BorrowVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BorrowVO(int page, int rows, Loan l, Userinfo u, Repayment r, Paymenthistory p, String date1, String date2) {
		super();
		this.page = page;
		this.rows = rows;
		this.l = l;
		this.u = u;
		this.r = r;
		this.p = p;
		this.date1 = date1;
		this.date2 = date2;
	}
	@Override
	public String toString() {
		return "BorrowVO [page=" + page + ", rows=" + rows + ", l=" + l + ", u=" + u + ", r=" + r + ", p=" + p
				+ ", date1=" + date1 + ", date2=" + date2 + "]";
	}
}
