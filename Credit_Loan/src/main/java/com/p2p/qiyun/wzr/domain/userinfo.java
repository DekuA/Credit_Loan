package com.p2p.qiyun.wzr.domain;

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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public userinfo(int userid, String nickname, String username, String idnumber, String phone, String password) {
		super();
		this.userid = userid;
		this.nickname = nickname;
		this.username = username;
		this.idnumber = idnumber;
		Phone = phone;
		this.password = password;
	}
	public userinfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "userinfo [userid=" + userid + ", nickname=" + nickname + ", username=" + username + ", idnumber="
				+ idnumber + ", Phone=" + Phone + ", password=" + password + "]";
	}
}
