package com.p2p.qiyun.cjz.domain;

public class customer {
	private int  customerid;
	private int userid;
	private String custometype;
	private String email;
	private String bankname;
	private String bankid;
	private String creditrate;
	private String username;
	private String idnumber;
	private String Phone;
	private int page;
	private int rows;
	public customer(int customerid, int userid, String custometype, String email, String bankname, String bankid,
			String creditrate, String username, String idnumber, String phone, int page, int rows) {
		super();
		this.customerid = customerid;
		this.userid = userid;
		this.custometype = custometype;
		this.email = email;
		this.bankname = bankname;
		this.bankid = bankid;
		this.creditrate = creditrate;
		this.username = username;
		this.idnumber = idnumber;
		Phone = phone;
		this.page = page;
		this.rows = rows;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public customer() {}
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	@Override
	public String toString() {
		return "customer [customerid=" + customerid + ", userid=" + userid + ", custometype=" + custometype + ", email="
				+ email + ", bankname=" + bankname + ", bankid=" + bankid + ", creditrate=" + creditrate + ", username="
				+ username + ", idnumber=" + idnumber + ", Phone=" + Phone + ", page=" + page + ", rows=" + rows + "]";
	}
	public customer(int customerid, int userid, String custometype, String email, String bankname, String bankid,
			String creditrate, String username, String idnumber, String phone) {
		super();
		this.customerid = customerid;
		this.userid = userid;
		this.custometype = custometype;
		this.email = email;
		this.bankname = bankname;
		this.bankid = bankid;
		this.creditrate = creditrate;
		this.username = username;
		this.idnumber = idnumber;
		Phone = phone;
	}
	public customer(int page,int rows) {
		super();
		this.page = page;
		this.rows = rows;
	}
	
}
