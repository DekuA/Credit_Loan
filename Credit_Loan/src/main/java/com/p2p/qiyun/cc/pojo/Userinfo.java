package com.p2p.qiyun.cc.pojo;

public class Userinfo {
	private int userid;
	private String nickname;
	private String username;
	private String idnumber;
	private String Phone;
	private String password;
	public Userinfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Userinfo(int userid, String nickname, String username, String idnumber, String phone, String password) {
		super();
		this.userid = userid;
		this.nickname = nickname;
		this.username = username;
		this.idnumber = idnumber;
		this.Phone = phone;
		this.password = password;
	}
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
		this.nickname = nickname == null ? null : nickname.trim();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber == null ? null : idnumber.trim();
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		this.Phone = phone == null ? null : phone.trim();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}
	@Override
	public String toString() {
		return "Userinfo [userid=" + userid + ", nickname=" + nickname + ", username=" + username + ", idnumber="
				+ idnumber + ", Phone=" + Phone + ", password=" + password + "]";
	}
	
}
