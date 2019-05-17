package com.p2p.qiyun.lxm.domain;

public class Investnotes {
    private Integer iid;

    private Double imoney;

    private String idate;

    private Integer userid;

    private Integer pid;

    private Integer ptrans;
    
    private Double ptransmoney;
    
    private String ptransdate;
    
    

	public String getPtransdate() {
		return ptransdate;
	}

	public void setPtransdate(String ptransdate) {
		this.ptransdate = ptransdate;
	}

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
		this.idate = idate;
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

	public Double getPtransmoney() {
		return ptransmoney;
	}

	public void setPtransmoney(Double ptransmoney) {
		this.ptransmoney = ptransmoney;
	}

	public Investnotes(Integer iid, Double imoney, String idate, Integer userid, Integer pid, Integer ptrans,
			Double ptransmoney,String ptransdate) {
		super();
		this.iid = iid;
		this.imoney = imoney;
		this.idate = idate;
		this.userid = userid;
		this.pid = pid;
		this.ptrans = ptrans;
		this.ptransmoney = ptransmoney;
		this.ptransdate=ptransdate;
	}

	public Investnotes() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Investnotes [iid=" + iid + ", imoney=" + imoney + ", idate=" + idate + ", userid=" + userid + ", pid="
				+ pid + ", ptrans=" + ptrans + ", ptransmoney=" + ptransmoney + ",ptransdate" +ptransdate+"]";
	}

    
}