package com.p2p.qiyun.dyj.pojo;

public class Info {
    private Integer infoid;

    private String infoname;

    public Integer getInfoid() {
        return infoid;
    }

    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }

    public String getInfoname() {
        return infoname;
    }

    public void setInfoname(String infoname) {
        this.infoname = infoname == null ? null : infoname.trim();
    }
}