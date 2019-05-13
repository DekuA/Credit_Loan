package com.p2p.qiyun.cjz.domain;

public class userinfo {
	private int userid;
	private String nickname;
	private String username;
	private String idnumber;
	private String Phone;
	private String password;
	public int getUserid() {
		return userid;
	}
	public userinfo() {}
	public userinfo(int userid, String nickname, String username, String idnumber, String phone, String password) {
		super();
		this.userid = userid;
		this.nickname = nickname;
		this.username = username;
		this.idnumber = idnumber;
		Phone = phone;
		this.password = password;
	}
	@Override
	public String toString() {
		return "userinfo [userid=" + userid + ", nickname=" + nickname + ", username=" + username + ", idnumber="
				+ idnumber + ", Phone=" + Phone + ", password=" + password + "]";
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
}
