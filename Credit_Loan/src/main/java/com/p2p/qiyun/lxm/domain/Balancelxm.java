package com.p2p.qiyun.lxm.domain;

public class Balancelxm {
    private Integer yueid;

    private Integer userid;

    private Double balance;

    private String paypwd;
public Balancelxm() {
	// TODO Auto-generated constructor stub
}
    public Integer getYueid() {
        return yueid;
    }

    public void setYueid(Integer yueid) {
        this.yueid = yueid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getPaypwd() {
        return paypwd;
    }

    public void setPaypwd(String paypwd) {
        this.paypwd = paypwd == null ? null : paypwd.trim();
    }
}