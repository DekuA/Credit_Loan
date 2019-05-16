package com.p2p.qiyun.cc.pojo;

public class Usersfz {
	private int sfztu;
	private int userid;
	private String usersrcz;
	private String usersrcf;
	private int yesno;
	public Usersfz() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usersfz(int sfztu, int userid, String usersrcz, String usersrcf, int yesno) {
		super();
		this.sfztu = sfztu;
		this.userid = userid;
		this.usersrcz = usersrcz;
		this.usersrcf = usersrcf;
		this.yesno = yesno;
	}
	public int getSfztu() {
		return sfztu;
	}
	public void setSfztu(int sfztu) {
		this.sfztu = sfztu;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsersrcz() {
		return usersrcz;
	}
	public void setUsersrcz(String usersrcz) {
		this.usersrcz = usersrcz;
	}
	public String getUsersrcf() {
		return usersrcf;
	}
	public void setUsersrcf(String usersrcf) {
		this.usersrcf = usersrcf;
	}
	public int getYesno() {
		return yesno;
	}
	public void setYesno(int yesno) {
		this.yesno = yesno;
	}
	@Override
	public String toString() {
		return "Usersfz [sfztu=" + sfztu + ", userid=" + userid + ", usersrcz=" + usersrcz + ", usersrcf=" + usersrcf
				+ ", yesno=" + yesno + "]";
	}
	
	
	
}
