package com.p2p.qiyun.xsr.domain;

public class paymenthistory {
		private int recordid;
		private int repaymentid;
		private int userid;
		private String loanid;
		private String currentrepayment;
		private String storydate;
		private String storydatep;
		private String paymentstatus;
		
		public int getRecordid() {
			return recordid;
		}
		public void setRecordid(int recordid) {
			this.recordid = recordid;
		}
		public int getRepaymentid() {
			return repaymentid;
		}
		public void setRepaymentid(int repaymentid) {
			this.repaymentid = repaymentid;
		}
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		public String getLoanid() {
			return loanid;
		}
		public void setLoanid(String loanid) {
			this.loanid = loanid;
		}
		public String getCurrentrepayment() {
			return currentrepayment;
		}
		public void setCurrentrepayment(String currentrepayment) {
			this.currentrepayment = currentrepayment;
		}
		public String getStorydate() {
			return storydate;
		}
		public void setStorydate(String storydate) {
			this.storydate = storydate;
		}
		public String getStorydatep() {
			return storydatep;
		}
		public void setStorydatep(String storydatep) {
			this.storydatep = storydatep;
		}
		public String getPaymentstatus() {
			return paymentstatus;
		}
		public void setPaymentstatus(String paymentstatus) {
			this.paymentstatus = paymentstatus;
		}
		public paymenthistory(int recordid, int repaymentid, int userid, String loanid, String currentrepayment,
				String storydate, String storydatep, String paymentstatus) {
			super();
			this.recordid = recordid;
			this.repaymentid = repaymentid;
			this.userid = userid;
			this.loanid = loanid;
			this.currentrepayment = currentrepayment;
			this.storydate = storydate;
			this.storydatep = storydatep;
			this.paymentstatus = paymentstatus;
		}
		public paymenthistory() {
			super();
		}
		@Override
		public String toString() {
			return "repayment [recordid=" + recordid + ", repaymentid=" + repaymentid + ", userid=" + userid
					+ ", loanid=" + loanid + ", currentrepayment=" + currentrepayment + ", storydate=" + storydate
					+ ", storydatep=" + storydatep + ", paymentstatus=" + paymentstatus + "]";
		}
		
		
}
		 