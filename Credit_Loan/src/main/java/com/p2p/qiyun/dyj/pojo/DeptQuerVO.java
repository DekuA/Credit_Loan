package com.p2p.qiyun.dyj.pojo;

public class DeptQuerVO {
	private int pageNum;
	private int maxPage;
	private Dept d;
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getMaxPage() {
		return maxPage;
	}
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}
	public Dept getD() {
		return d;
	}
	public void setD(Dept d) {
		this.d = d;
	}
	public DeptQuerVO(int pageNum, int maxPage, Dept d) {
		super();
		this.pageNum = pageNum;
		this.maxPage = maxPage;
		this.d = d;
	}
	public DeptQuerVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DeptQuerVO [pageNum=" + pageNum + ", maxPage=" + maxPage + ", d=" + d + "]";
	}
	public DeptQuerVO(int pageNum, int maxPage) {
		super();
		this.pageNum = pageNum;
		this.maxPage = maxPage;
	}
	
}
