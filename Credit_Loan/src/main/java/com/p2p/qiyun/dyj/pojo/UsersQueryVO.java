package com.p2p.qiyun.dyj.pojo;

public class UsersQueryVO {
	private int pageNum;
	private int maxPage;
	private Users u;
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
	public Users getU() {
		return u;
	}
	public void setU(Users u) {
		this.u = u;
	}
	public UsersQueryVO(int pageNum, int maxPage, Users u) {
		super();
		this.pageNum = pageNum;
		this.maxPage = maxPage;
		this.u = u;
	}
	public UsersQueryVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
