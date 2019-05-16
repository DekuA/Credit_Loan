package com.p2p.qiyun.hjh.entity;

public class Query {
	private String name;
 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
private int pag;
 private int rows;
public int getPag() {
	return pag;
}
public void setPag(int pag) {
	this.pag = pag;
}
public int getRows() {
	return rows;
}
public Query() {
	// TODO Auto-generated constructor stub
}

public Query(String name, int pag, int rows) {
	super();
	this.name = name;
	this.pag = pag;
	this.rows = rows;
}
public Query( int pag, int rows) {
	super();
	
	this.pag = pag;
	this.rows = rows;
}
public void setRows(int rows) {
	this.rows = rows;
}

}
