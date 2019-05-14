package com.p2p.qiyun.dyj.pojo;

public class NewsQueryVO {
	private int pageNum;
	private int maxPage;
	private News n;
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
	public News getN() {
		return n;
	}
	public void setN(News n) {
		this.n = n;
	}
	public NewsQueryVO(int pageNum, int maxPage, News n) {
		super();
		this.pageNum = pageNum;
		this.maxPage = maxPage;
		this.n = n;
	}
	public NewsQueryVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
