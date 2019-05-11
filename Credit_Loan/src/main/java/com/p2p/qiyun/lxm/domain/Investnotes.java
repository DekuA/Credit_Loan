package com.p2p.qiyun.lxm.domain;

public class Investnotes {
    private Integer iid;

    private Double imoney;

    private String idate;

    private Integer userid;

    private Integer pid;

    private Integer ptrans;

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Double getImoney() {
        return imoney;
    }

    public void setImoney(Double imoney) {
        this.imoney = imoney;
    }

    public String getIdate() {
        return idate;
    }

    public void setIdate(String idate) {
        this.idate = idate == null ? null : idate.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPtrans() {
        return ptrans;
    }

    public void setPtrans(Integer ptrans) {
        this.ptrans = ptrans;
    }
}