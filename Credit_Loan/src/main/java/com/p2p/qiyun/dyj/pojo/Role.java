package com.p2p.qiyun.dyj.pojo;

public class Role {
    private Integer roleid;

    private String rolename;

    private String rolecreatedate;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRolecreatedate() {
        return rolecreatedate;
    }

    public void setRolecreatedate(String rolecreatedate) {
        this.rolecreatedate = rolecreatedate == null ? null : rolecreatedate.trim();
    }

	public Role(Integer roleid, String rolename, String rolecreatedate) {
		super();
		this.roleid = roleid;
		this.rolename = rolename;
		this.rolecreatedate = rolecreatedate;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Role [roleid=" + roleid + ", rolename=" + rolename + ", rolecreatedate=" + rolecreatedate + "]";
	}
    
}