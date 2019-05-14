package com.p2p.qiyun.lxm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.lxm.dao.BalanceMapperlxm;
import com.p2p.qiyun.lxm.dao.InvestnotesMapper;
import com.p2p.qiyun.lxm.dao.ProjectMapper;
import com.p2p.qiyun.lxm.domain.Balancelxm;
import com.p2p.qiyun.lxm.domain.Investnotes;
import com.p2p.qiyun.lxm.domain.Project;
import com.p2p.qiyun.lxm.domain.ProjectExample;

@Service
public class ProjectServiceImpol implements ProjectService {
	@Autowired
	private ProjectMapper promap;
	
	@Autowired
	private BalanceMapperlxm bamap;
	
	@Autowired
	private InvestnotesMapper inmap;
	
	public Balancelxm selBalance(int uid) {
		Balancelxm balance = bamap.selectBalanceByUid(uid);
		return balance;
	}
	
	
	
	public List<Project> selProject(){
		List<Project> list = promap.selectByExample(new ProjectExample());
		return list;
	}
	
	public Project selProjectById(int pid) {
		Project project = promap.selectByPrimaryKey(pid);
		return project;
	}



	@Override
	public int selCountloanPay(int userid) {
		int i = promap.selCountloanPay(userid);
		return i;
	}



	@Override
	public int selcountloan(int userid) {
		int i = promap.selcountloan(userid);
		return i;
	}

	public List<Investnotes> selByPid(int pid){
		List<Investnotes> list = inmap.selByPid(pid);
		return list;
	}

	@Override
	public String selsumloan(int userid) {
		String d = promap.selsumloan(userid);
		return d;
	}
	
	public String selPayMoney(int userid) {
		String d = promap.selPayMoney(userid);
		return d;
	}
}
