package com.p2p.qiyun.hjh.entity;

public class Customer {
    private Integer customerid;

    private Integer userid;

    private String custometype;

    private String email;

    private String bankname;

    @Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", userid=" + userid + ", custometype=" + custometype + ", email="
				+ email + ", bankname=" + bankname + ", bankid=" + bankid + ", creditrate=" + creditrate + "]";
	}

	private String bankid;

    private String creditrate;

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getCustometype() {
        return custometype;
    }

    public void setCustometype(String custometype) {
        this.custometype = custometype == null ? null : custometype.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }

    public String getCreditrate() {
        return creditrate;
    }

    public void setCreditrate(String creditrate) {
        this.creditrate = creditrate == null ? null : creditrate.trim();
    }
}