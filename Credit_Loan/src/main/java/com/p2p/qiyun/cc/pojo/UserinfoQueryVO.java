package com.p2p.qiyun.cc.pojo;

public class UserinfoQueryVO {
	private int pageNum;
	private int maxPage;
	private Userinfo u;
	public UserinfoQueryVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserinfoQueryVO(int pageNum, int maxPage, Userinfo u) {
		super();
		this.pageNum = pageNum;
		this.maxPage = maxPage;
		this.u = u;
	}
	public UserinfoQueryVO(int pageNum, int maxPage) {
		super();
		this.pageNum = pageNum;
		this.maxPage = maxPage;
		
	}
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
	public Userinfo getU() {
		return u;
	}
	public void setU(Userinfo u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "UserinfoQueryVO [pageNum=" + pageNum + ", maxPage=" + maxPage + ", u=" + u + "]";
	}
	
}
