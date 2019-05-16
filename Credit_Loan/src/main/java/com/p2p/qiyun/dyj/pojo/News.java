package com.p2p.qiyun.dyj.pojo;

public class News {
    private Integer newsid;

    private String ntitle;

    private String ncontent;

    private String ncreatedate;

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle == null ? null : ntitle.trim();
    }

    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent == null ? null : ncontent.trim();
    }

    public String getNcreatedate() {
        return ncreatedate;
    }

    public void setNcreatedate(String ncreatedate) {
        this.ncreatedate = ncreatedate == null ? null : ncreatedate.trim();
    }
}