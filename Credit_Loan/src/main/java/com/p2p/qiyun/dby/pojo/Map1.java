package com.p2p.qiyun.dby.pojo;

import java.util.List;

public class Map1 {
	private List<account> rows;
 	private int total;
	public List<account> getRows() {
		return rows;
	}
	public void setRows(List<account> rows) {
		this.rows = rows;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Map1 [rows=" + rows + ", total=" + total + "]";
	}
	public Map1(List<account> rows, int total) {
		super();
		this.rows = rows;
		this.total = total;
	}
	public Map1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
 	
}
