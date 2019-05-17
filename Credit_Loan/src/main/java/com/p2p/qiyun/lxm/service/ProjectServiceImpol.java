package com.p2p.qiyun.lxm.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.qiyun.lsx.dao.Loan2Mapper;
import com.p2p.qiyun.lsx.entity.Loan2;
import com.p2p.qiyun.lxm.dao.BalanceMapperlxm;
import com.p2p.qiyun.lxm.dao.InvestnotesMapper;
import com.p2p.qiyun.lxm.dao.ProjectMapper;
import com.p2p.qiyun.lxm.domain.Balancelxm;
import com.p2p.qiyun.lxm.domain.Investnotes;
import com.p2p.qiyun.lxm.domain.Project;
import com.p2p.qiyun.lxm.domain.ProjectExample;
import com.p2p.qiyun.lxm.domain.SelZhaiQuan;

@Service
public class ProjectServiceImpol implements ProjectService {
	@Autowired
	private ProjectMapper promap;
	
	@Autowired
	private BalanceMapperlxm bamap;
	
	@Autowired
	private InvestnotesMapper inmap;
	
	@Autowired
	private Loan2Mapper loanmap;
	
	public int insertBysp(Project pro) {
		Loan2 loan2 = loanmap.selLoansById(pro.getLenderid());
		Date d = new Date();   
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMddHHmmss"); 
        pro.setPclosing(sdf.format(d));
        if(loan2.getRepaymentperiod()==3) {
        	pro.setPlcure(6.60);
        }else if(loan2.getRepaymentperiod()==6) {
        	pro.setPlcure(7.84);
        }else {
        	pro.setPlcure(8.40);
        }
        pro.setPnumber("88"+sdf2.format(d));
        pro.setPestimate(5);
        pro.setPstarttime(sdf1.format(d));
        
		int i = promap.insertBysp(pro);
		return i;
	}
	
	@Transactional
	public int upInvesptrans(Investnotes inves) {
		int i = inmap.upInvesptrans(inves);
		return i;
	}
	
	@Transactional
	public int upBalanceByUid(Balancelxm balance) {
		int i = bamap.upBalanceByUid(balance);
		return i;
	}
	
	@Transactional
	public int updatePschedule(int pschedule,String pid) {
		int i = promap.updatePschedule(pschedule, pid);
		return i;
	}
	
	@Transactional
	public int insertInves(Investnotes inves) {
		int i = inmap.insertInves(inves);
		return i;
	}
	
	public Investnotes selInvesById(int invesid) {
		Investnotes inves = inmap.selectByPrimaryKey(invesid);
		return inves;
	}
	
	public int selYuqicishu(SelZhaiQuan zq) {
		int selYuqicishu = promap.selYuqicishu(zq);
		return selYuqicishu;
	}
	
	public Balancelxm selBalance(int uid) {
		Balancelxm balance = bamap.selectBalanceByUid(uid);
		return balance;
	}
	
	public List<Investnotes> selZhaiqzr(SelZhaiQuan selzq){
		List<Investnotes> list = inmap.selZhaiqzr(selzq);
		return list;
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

	@Override
	public String selsumloan(int userid) {
		String selsumloan = promap.selsumloan(userid);
		return selsumloan;
	}

	@Override
	public String selPayMoney(int userid) {
		String money = promap.selPayMoney(userid);
		return money;
	}

	@Override
	public List<Investnotes> selByPid(int pid) {
		List<Investnotes> list = inmap.selByPid(pid);
		return list;
	}
	
	
}
