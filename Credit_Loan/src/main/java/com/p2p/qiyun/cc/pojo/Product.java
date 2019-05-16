package com.p2p.qiyun.cc.pojo;

public class Product {
	 private Integer pid;
	 private String pimageyi;
	 private String pimageer;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer pid, String pimageyi, String pimageer) {
		super();
		this.pid = pid;
		this.pimageyi = pimageyi;
		this.pimageer = pimageer;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPimageyi() {
		return pimageyi;
	}
	public void setPimageyi(String pimageyi) {
		this.pimageyi = pimageyi;
	}
	public String getPimageer() {
		return pimageer;
	}
	public void setPimageer(String pimageer) {
		this.pimageer = pimageer;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pimageyi=" + pimageyi + ", pimageer=" + pimageer + "]";
	}
	 
	 
}
