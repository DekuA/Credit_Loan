package com.p2p.qiyun.dyj.pojo;

public class Logintime {
    private Integer ltid;

    private String ltname;

    private String ltdate;

    public Integer getLtid() {
        return ltid;
    }

    public void setLtid(Integer ltid) {
        this.ltid = ltid;
    }

    public String getLtname() {
        return ltname;
    }

    public void setLtname(String ltname) {
        this.ltname = ltname == null ? null : ltname.trim();
    }

    public String getLtdate() {
        return ltdate;
    }

    public void setLtdate(String ltdate) {
        this.ltdate = ltdate == null ? null : ltdate.trim();
    }
}