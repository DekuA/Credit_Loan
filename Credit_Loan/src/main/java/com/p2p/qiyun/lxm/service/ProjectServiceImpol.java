package com.p2p.qiyun.lxm.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
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
import com.p2p.qiyun.xsr.domain.xiaoxi;
import com.p2p.qiyun.xsr.service.CreditService_xsr;

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
	
	@Autowired
	private CreditService_xsr im;
	
	public Project selProjectByLoanid(int loanid) {
		Project project = promap.selProjectByLoanid(loanid);
		return project;
	}
	
	@Transactional
	public int touzishouyi(int pid) {
		List<Investnotes> list = inmap.selByPid(pid);
		Project project = promap.selectByPrimaryKey(pid);
		Loan2 loan = loanmap.selLoansById(project.getLenderid());
		int j = promap.selYihuanqishu(project.getLenderid());
		int i=0;
		for (Investnotes inves : list) {
			if(inves.getPtrans()!=2) {
				Balancelxm balancelxm1 = bamap.selectBalanceByUid(inves.getUserid());
				System.out.println("dq余额："+balancelxm1.getBalance());
				Map map = counters((int)loan.getRepaymentperiod(),inves.getImoney(),project.getPlcure(),project.getPinfo(),j);
				Balancelxm bbb = new Balancelxm();
				double benxi = (double) map.get("benxi");
				double xinxifei = (double) map.get("xinxifei");
				bbb.setBalance(benxi-xinxifei);
				bbb.setUserid(inves.getUserid());
				i += bamap.upBalanceByUidjia(bbb);
				System.out.println(inves.getUserid()+"投资 "+inves.getImoney()+"元 的 "+project.getPname()+project.getPnumber()+"项目第"
				+j+"期收益了 "+benxi+"元,扣去信息服务费"+xinxifei+"元，还剩"+(benxi-xinxifei)+"元");
				xiaoxi xo = new xiaoxi(0, inves.getUserid(),"投资 "+inves.getImoney()+"元 的 "+project.getPname()+project.getPnumber()+"项目第"+j+"期收益了 "+benxi+"元,扣去信息服务费"+xinxifei+"元，总收益"+(benxi-xinxifei)+"元", null);
				im.charuxiaoxi(xo);
				Balancelxm balancelxm = bamap.selectBalanceByUid(inves.getUserid());
				System.out.println("余额："+balancelxm.getBalance());
			}
		}
		return i;
	}
	
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
	public int upBalanceByUidjia (Balancelxm record) {
		int i = bamap.upBalanceByUidjia(record);
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
	
	@Test
	public Map counters(int repaymentperiod,double loanamount,double plcure,double pinfo,int dangqi){
		Map map=new HashMap();
		int dkqs=repaymentperiod;
		double dkbj=loanamount;
		double cksyl=plcure;
		//年收益率/百分比/总年数=月收益
		double qs = ((cksyl/100)/12)+1; //月利率+1
		double  bj = Math.pow(qs,dkqs);//（1+月利率）
		double bj2 = bj*((cksyl/100)/12);
		//应收本息
		double ysbx = (dkbj*bj2)/(Math.pow(qs,dkqs)-1);		
		double ResidualPrincipal = dkbj;
		String double5="0.0";
		for(int i=1;i<=dkqs;i++){
			double lixi = ResidualPrincipal*(cksyl/100)/12;
			ResidualPrincipal = ResidualPrincipal-ysbx+lixi;
			if(i==dkqs){
				ResidualPrincipal = 0.00;
			}
			double bqysbj=(ysbx-lixi)*1;
			double bqsybj=ResidualPrincipal*1;
			//System.out.println(formatDouble5(ysbx-lixi)+","+formatDouble5(lixi)+","+formatDouble5(ResidualPrincipal)+",");
			double benxi = Double.parseDouble(formatDouble5(ysbx));
			if(i==dangqi) {
				double5 = formatDouble5(benxi-(bqysbj+bqsybj)*(pinfo/100));
				map.put("benxi", benxi);
				map.put("xinxifei",(bqysbj+bqsybj)*(pinfo/100));
			}
			
		}
		return map;
	}
	
	
	public String formatDouble5(double d) {
        return String.format("%.2f", d);
    }
}
