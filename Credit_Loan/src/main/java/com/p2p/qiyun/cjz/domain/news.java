package com.p2p.qiyun.cjz.domain;

public class news {
	private int newsid;
	private String ntitle;
	private String ncontent;
	private String ncreatedate;
	private int page;
	private int rows;
	public news() {}
	public news(int newsid, String ntitle, String ncontent, String ncreatedate) {
		super();
		this.newsid = newsid;
		this.ntitle = ntitle;
		this.ncontent = ncontent;
		this.ncreatedate = ncreatedate;
	}
	public news(int newsid, String ntitle, String ncontent, String ncreatedate, int page, int rows) {
		super();
		this.newsid = newsid;
		this.ntitle = ntitle;
		this.ncontent = ncontent;
		this.ncreatedate = ncreatedate;
		this.page = page;
		this.rows = rows;
	}
	public news(int page, int rows) {
		super();
		this.page = page;
		this.rows = rows;
	}
	public String getNcreatedate() {
		return ncreatedate;
	}
	public void setNcreatedate(String ncreatedate) {
		this.ncreatedate = ncreatedate;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "news [newsid=" + newsid + ", ntitle=" + ntitle + ", ncontent=" + ncontent + ", ncreatedate="
				+ ncreatedate + ", page=" + page + ", rows=" + rows + "]";
	}
	public int getNewsid() {
		return newsid;
	}
	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}
	public String getNtitle() {
		return ntitle;
	}
	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}
	public String getNcontent() {
		return ncontent;
	}
	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}
}
