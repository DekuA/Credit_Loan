package com.p2p.qiyun.xsr.domain;

public class usersfz {
		private int sfztu;
		private int userid;
		private String  user_srcz;
		private String user_srcf;
		@Override
		public String toString() {
			return "usersfz [sfztu=" + sfztu + ", userid=" + userid + ", user_srcz=" + user_srcz + ", user_srcf="
					+ user_srcf + "]";
		}
		public usersfz() {
			super();
		}
		public usersfz(int sfztu, int userid, String user_srcz, String user_srcf) {
			super();
			this.sfztu = sfztu;
			this.userid = userid;
			this.user_srcz = user_srcz;
			this.user_srcf = user_srcf;
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
		public String getUser_srcz() {
			return user_srcz;
		}
		public void setUser_srcz(String user_srcz) {
			this.user_srcz = user_srcz;
		}
		public String getUser_srcf() {
			return user_srcf;
		}
		public void setUser_srcf(String user_srcf) {
			this.user_srcf = user_srcf;
		}
}
