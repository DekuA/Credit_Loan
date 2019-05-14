package com.p2p.qiyun.lxm.service;

import java.util.List;

import com.p2p.qiyun.lxm.domain.Balancelxm;
import com.p2p.qiyun.lxm.domain.Investnotes;
import com.p2p.qiyun.lxm.domain.Project;

public interface ProjectService {
	List<Project> selProject();
	Project selProjectById(int pid);
	Balancelxm selBalance(int uid);
	int selCountloanPay(int userid);
	
	int selcountloan(int userid);
	
	String selsumloan(int userid);
	
	String selPayMoney(int userid);
	
	List<Investnotes> selByPid(int pid);
}
