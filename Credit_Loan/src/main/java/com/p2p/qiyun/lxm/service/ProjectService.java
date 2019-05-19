package com.p2p.qiyun.lxm.service;

import java.util.List;

import com.p2p.qiyun.lxm.domain.Balancelxm;
import com.p2p.qiyun.lxm.domain.Investnotes;
import com.p2p.qiyun.lxm.domain.Project;
import com.p2p.qiyun.lxm.domain.SelZhaiQuan;

public interface ProjectService {
	int upBalanceByUidjia (Balancelxm record);
	
	int insertBysp(Project pro);
	
	int upInvesptrans(Investnotes inves);
	
	Investnotes selInvesById(int invesid);
	
	List<Investnotes> selZhaiqzr(SelZhaiQuan selzq);
	
	int upBalanceByUid(Balancelxm balance);
	
	int updatePschedule(int pschedule,String pid);
	
	int insertInves(Investnotes inves);
	
	List<Project> selProject();
	Project selProjectById(int pid);
	Balancelxm selBalance(int uid);
	int selCountloanPay(int userid);
	
	int selcountloan(int userid);
	
	String selsumloan(int userid);
	
	String selPayMoney(int userid);
	
	List<Investnotes> selByPid(int pid);
	
	int selYuqicishu(SelZhaiQuan zq);
}
