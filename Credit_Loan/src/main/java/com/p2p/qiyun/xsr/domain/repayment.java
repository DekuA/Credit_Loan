package com.p2p.qiyun.xsr.domain;

public class repayment {
		private int repaymentid;
		private int loanid;
		private int userid;
		private String modmoney;
		private String rdate;
		private String paymentstatus;
		private String repaymonney;
		@Override
		public String toString() {
			return "repayment [repaymentid=" + repaymentid + ", loanid=" + loanid + ", userid=" + userid + ", modmoney="
					+ modmoney + ", rdate=" + rdate + ", paymentstatus=" + paymentstatus + ", repaymonney="
					+ repaymonney + "]";
		}
		public repayment() {
			super();
		}
		public repayment(int repaymentid, int loanid, int userid, String modmoney, String rdate, String paymentstatus,
				String repaymonney) {
			super();
			this.repaymentid = repaymentid;
			this.loanid = loanid;
			this.userid = userid;
			this.modmoney = modmoney;
			this.rdate = rdate;
			this.paymentstatus = paymentstatus;
			this.repaymonney = repaymonney;
		}
		public int getRepaymentid() {
			return repaymentid;
		}
		public void setRepaymentid(int repaymentid) {
			this.repaymentid = repaymentid;
		}
		public int getLoanid() {
			return loanid;
		}
		public void setLoanid(int loanid) {
			this.loanid = loanid;
		}
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		public String getModmoney() {
			return modmoney;
		}
		public void setModmoney(String modmoney) {
			this.modmoney = modmoney;
		}
		public String getRdate() {
			return rdate;
		}
		public void setRdate(String rdate) {
			this.rdate = rdate;
		}
		public String getPaymentstatus() {
			return paymentstatus;
		}
		public void setPaymentstatus(String paymentstatus) {
			this.paymentstatus = paymentstatus;
		}
		public String getRepaymonney() {
			return repaymonney;
		}
		public void setRepaymonney(String repaymonney) {
			this.repaymonney = repaymonney;
		}
}
