package com.p2p.qiyun.xsr.domain;

public class xiaoxi {
	private int xiaoxiid;
	private int userid;
	private String  msgcontext;
	private String  sendtime;
	@Override
	public String toString() {
		return "xiaoxi [xiaoxiid=" + xiaoxiid + ", userid=" + userid + ", msgcontext=" + msgcontext + ", sendtime="
				+ sendtime + "]";
	}
	public xiaoxi() {
		super();
	}
	public xiaoxi(int xiaoxiid, int userid, String msgcontext, String sendtime) {
		super();
		this.xiaoxiid = xiaoxiid;
		this.userid = userid;
		this.msgcontext = msgcontext;
		this.sendtime = sendtime;
	}
	public int getXiaoxiid() {
		return xiaoxiid;
	}
	public void setXiaoxiid(int xiaoxiid) {
		this.xiaoxiid = xiaoxiid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getMsgcontext() {
		return msgcontext;
	}
	public void setMsgcontext(String msgcontext) {
		this.msgcontext = msgcontext;
	}
	public String getSendtime() {
		return sendtime;
	}
	public void setSendtime(String sendtime) {
		this.sendtime = sendtime;
	}
}
