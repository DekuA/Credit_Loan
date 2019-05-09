package com.p2p.qiyun.dyj.pojo;

public class Tandr {
    private Integer trid;

    private Integer rid;

    private Integer tid;

    public Integer getTrid() {
        return trid;
    }

    public void setTrid(Integer trid) {
        this.trid = trid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

	public Tandr(Integer rid, Integer tid) {
		super();
		this.rid = rid;
		this.tid = tid;
	}

	public Tandr() {
		super();
		// TODO Auto-generated constructor stub
	}
     
}