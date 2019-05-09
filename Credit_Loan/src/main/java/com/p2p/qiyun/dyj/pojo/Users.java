package com.p2p.qiyun.dyj.pojo;

public class Users {
    private Integer uid;

    private String loginname;

    private String pwd;

    private String username;

    private String sex;

    private String datebirth;

    private String xueli;

    private String job;

    private Integer did;
    private Dept d;
    private Integer rid;
    private Role r;
    public Dept getD() {
		return d;
	}

	public void setD(Dept d) {
		this.d = d;
	}

	public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getDatebirth() {
        return datebirth;
    }

    public void setDatebirth(String datebirth) {
        this.datebirth = datebirth == null ? null : datebirth.trim();
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli == null ? null : xueli.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

	public Users(Integer uid, String loginname, String pwd, String username, String sex, String datebirth, String xueli,
			String job, Integer did, Dept d, Integer rid) {
		super();
		this.uid = uid;
		this.loginname = loginname;
		this.pwd = pwd;
		this.username = username;
		this.sex = sex;
		this.datebirth = datebirth;
		this.xueli = xueli;
		this.job = job;
		this.did = did;
		this.d = d;
		this.rid = rid;
	}

	public Users(Integer uid, String loginname, String pwd, String username, String sex, String datebirth, String xueli,
			String job, Integer did, Integer rid) {
		super();
		this.uid = uid;
		this.loginname = loginname;
		this.pwd = pwd;
		this.username = username;
		this.sex = sex;
		this.datebirth = datebirth;
		this.xueli = xueli;
		this.job = job;
		this.did = did;
		this.rid = rid;
	}

	public Role getR() {
		return r;
	}

	public void setR(Role r) {
		this.r = r;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Users [uid=" + uid + ", loginname=" + loginname + ", pwd=" + pwd + ", username=" + username + ", sex="
				+ sex + ", datebirth=" + datebirth + ", xueli=" + xueli + ", job=" + job + ", did=" + did + ", d=" + d
				+ ", rid=" + rid + ", r=" + r + "]";
	}

    
	
}