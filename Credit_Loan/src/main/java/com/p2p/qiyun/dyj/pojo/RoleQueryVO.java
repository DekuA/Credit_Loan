package com.p2p.qiyun.dyj.pojo;

public class RoleQueryVO {
	private int pageNum;
	private int maxPage;
	private Role r;
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
	public Role getR() {
		return r;
	}
	public void setR(Role r) {
		this.r = r;
	}
	@Override
	public String toString() {
		return "RoleQueryVO [pageNum=" + pageNum + ", maxPage=" + maxPage + ", r=" + r + "]";
	}
	public RoleQueryVO(int pageNum, int maxPage, Role r) {
		super();
		this.pageNum = pageNum;
		this.maxPage = maxPage;
		this.r = r;
	}
	public RoleQueryVO(int pageNum, int maxPage) {
		super();
		this.pageNum = pageNum;
		this.maxPage = maxPage;
	}
	public RoleQueryVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
