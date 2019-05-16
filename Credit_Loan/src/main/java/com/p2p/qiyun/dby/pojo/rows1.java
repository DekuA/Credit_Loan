package com.p2p.qiyun.dby.pojo;

public class rows1 {
	private int a;
	private int rows;
	public rows1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public rows1(int a, int rows) {
		super();
		this.a = a;
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "rows1 [a=" + a + ", rows=" + rows + "]";
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
}
