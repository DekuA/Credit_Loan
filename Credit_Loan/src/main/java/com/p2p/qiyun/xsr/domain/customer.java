package com.p2p.qiyun.xsr.domain;

public class customer {
		
	private int customerid;
	private int userid;
	private String custometype;
	private String email;
	private String bankname;
	private String bankid;
	private String creditrate;
	@Override
	public String toString() {
		return "customer [customerid=" + customerid + ", userid=" + userid + ", custometype=" + custometype + ", email="
				+ email + ", bankname=" + bankname + ", bankid=" + bankid + ", creditrate=" + creditrate + "]";
	}
	public customer() {
		super();
	}
	public customer(int customerid, int userid, String custometype, String email, String bankname, String bankid,
			String creditrate) {
		super();
		this.customerid = customerid;
		this.userid = userid;
		this.custometype = custometype;
		this.email = email;
		this.bankname = bankname;
		this.bankid = bankid;
		this.creditrate = creditrate;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getCustometype() {
		return custometype;
	}
	public void setCustometype(String custometype) {
		this.custometype = custometype;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBankid() {
		return bankid;
	}
	public void setBankid(String bankid) {
		this.bankid = bankid;
	}
	public String getCreditrate() {
		return creditrate;
	}
	public void setCreditrate(String creditrate) {
		this.creditrate = creditrate;
	}
}
