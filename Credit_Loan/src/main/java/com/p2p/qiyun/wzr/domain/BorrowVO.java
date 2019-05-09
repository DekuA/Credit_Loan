package com.p2p.qiyun.wzr.domain;

public class BorrowVO {

	private int page;
	private int rows;
	private Loan l;
	private Userinfo u;
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
	public BorrowVO(int page, int rows, Loan l, Userinfo u) {
		super();
		this.page = page;
		this.rows = rows;
		this.l = l;
		this.u = u;
	}
	public BorrowVO() {
		super();
	}
	@Override
	public String toString() {
		return "borrowVO [page=" + page + ", rows=" + rows + ", l=" + l + ", u=" + u + "]";
	}
}
