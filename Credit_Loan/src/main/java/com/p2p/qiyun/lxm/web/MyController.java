package com.p2p.qiyun.lxm.web;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.joda.time.DateTime;
import org.joda.time.Months;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.cjz.domain.customer;
import com.p2p.qiyun.cjz.service.kahaoxxService;
import com.p2p.qiyun.lsx.entity.Loan2;
import com.p2p.qiyun.lsx.entity.Paymenthistory2;
import com.p2p.qiyun.lsx.entity.Repayment2;
import com.p2p.qiyun.lsx.service.LoanService2;
import com.p2p.qiyun.lxm.domain.Balancelxm;
import com.p2p.qiyun.lxm.domain.Investnotes;
import com.p2p.qiyun.lxm.domain.Project;
import com.p2p.qiyun.lxm.domain.SelZhaiQuan;
import com.p2p.qiyun.lxm.domain.ddd;
import com.p2p.qiyun.lxm.service.ProjectService;
import com.p2p.qiyun.lxm.service.dddService;
import com.p2p.qiyun.wzr.domain.Userinfo;
import com.p2p.qiyun.wzr.service.UserinfoService;

@Controller
@RestController
public class MyController {
	@Autowired
	private kahaoxxService kahaoser;
	
	@Autowired
	private LoanService2 loanser;
	
	@Autowired
	private ProjectService proser;
	
	@Autowired
	private UserinfoService user;
	
	@RequestMapping("lxm/selzhaiqzr")
	public Map selzhaiqzr(SelZhaiQuan selzq) {
		Map map = new HashMap();
		List<Investnotes> inves = proser.selZhaiqzr(selzq);
		List<Project> projects = new ArrayList<Project>();
		List<Loan2> loans = new ArrayList<Loan2>();
		List list = new ArrayList();
		for (Investnotes investnotes : inves) {
			Project project = proser.selProjectById(investnotes.getPid());
			Loan2 loan = loanser.selLoansById(project.getLenderid());
			double repaymentperiod = loan.getRepaymentperiod();
			String idate = investnotes.getIdate();
			Date d = new Date();   
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
	        String dateNowStr = sdf.format(d); 
	        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
	        DateTime start = formatter.parseDateTime(idate);
	        DateTime end = formatter.parseDateTime(dateNowStr);
	        int qixian = (int) Math.round(repaymentperiod);
	        int months = Months.monthsBetween(start, end).getMonths();
	        int month1 = selzq.getMonth1();
	        int month2 = selzq.getMonth2();
	        if(month1==0&&month2==0) {
	        	loan.setRepaymentperiod(repaymentperiod-months);
			    projects.add(project);
			    loans.add(loan);
	        }else if(month2==0&&month1!=0&&month1>=repaymentperiod-months) {
	        	loan.setRepaymentperiod(repaymentperiod-months);
			    projects.add(project);
			    loans.add(loan);
			}else if(month1!=0&&month2!=0&&month1>=repaymentperiod-months&&month2<=repaymentperiod-months) {
				loan.setRepaymentperiod(repaymentperiod-months); 
				projects.add(project);
				loans.add(loan); 
			}else if(month1==0&&month2!=0&&month2<=repaymentperiod-months) {
	        	loan.setRepaymentperiod(repaymentperiod-months);
			    projects.add(project);
			    loans.add(loan);
	        }
	        
	        SelZhaiQuan zq = new SelZhaiQuan();
	        zq.setMonth1(loan.getLoanid());
	        zq.setMonth2(Integer.parseInt(selzq.getSfyq()));
		    int yuqicishu = proser.selYuqicishu(zq);
		    if(zq.getMonth2()==3) {
		    	list.add(3);
		    }else if(yuqicishu>0&&zq.getMonth2()==2){
		    	list.add(2);
		    }else{
		    	list.add(1);
		    }
		    
		}
		map.put("projectlist", projects);
		map.put("loanlist",loans);
		map.put("inves", inves);
		map.put("list",list);
		return map;
	}
	
	@RequestMapping("lxm/selBalancepwd")
	public String selBalancepwd(String pwd,String userid,String userbalance,String pid,String loanid){
		Balancelxm balance = proser.selBalance(Integer.parseInt(userid));
		if(balance.getPaypwd().equals(pwd)) {
			Investnotes inves = new Investnotes();
			inves.setImoney(Double.parseDouble(userbalance));
			inves.setPid(Integer.parseInt(pid));
			inves.setUserid(Integer.parseInt(userid));
			Date d = new Date();   
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
	        String dateNowStr = sdf.format(d); 
	        inves.setIdate(dateNowStr);
			Balancelxm bbb = new Balancelxm();
			bbb.setUserid(Integer.parseInt(userid));
			bbb.setBalance(Double.parseDouble(userbalance));
			Loan2 loan = loanser.selLoansById(Integer.parseInt(loanid));
			int i = (int) ((Double.parseDouble(userbalance)/loan.getLoanamount())*100);
			int i1 = proser.updatePschedule(i, pid); int i2 = proser.insertInves(inves);
			int i3 = proser.upBalanceByUid(bbb); 
			if(i1==1&&i2==1&&i3==1) { 
				return "1";
			}else { 
				return "2"; 
			}
		}else {
			return "0";
		}
	}
	
	@RequestMapping("lxm/selInvestnotes")
	public Map selInvestnotes(String pid){
		Map map = new HashMap();
		List<Investnotes> list = proser.selByPid(Integer.parseInt(pid));
		List u = new ArrayList();
		for (Investnotes investnotes : list) {
			Userinfo userinfo = user.seluserById(investnotes.getUserid());
			u.add(userinfo.getNickname());
		}
		map.put("inves", list);
		map.put("uname", u);
		return map;
	}
	
	@RequestMapping("lxm/selCountLoan")
	public Map selCountLoan(String userid) {
		//System.out.println(userid);
		Map map=new HashMap();
		map.put("countloan", proser.selcountloan(Integer.parseInt(userid)));
		map.put("countloanpay", proser.selCountloanPay(Integer.parseInt(userid)));
		//System.out.println(map);
		String sumloanmoney=proser.selsumloan(Integer.parseInt(userid));
		String sumpaymoney=proser.selPayMoney(Integer.parseInt(userid));
		sumloanmoney=sumloanmoney==null?"0.00":sumloanmoney;
		sumpaymoney=sumpaymoney==null?"0.00":sumpaymoney;
		map.put("sumloanmoney",sumloanmoney);
		map.put("sumpaymoney",sumpaymoney);
		//System.out.println(map);
		return map;
	}
	
	@RequestMapping("lxm/seluserById")
	public Userinfo seluserById(String userid) {
		Userinfo userinfo = user.seluserById(Integer.parseInt(userid));
		return userinfo;
	}
	
	@RequestMapping("lxm/seluserbalance")
	public String selUserBalance(String userid) {
		Balancelxm balance = proser.selBalance(Integer.parseInt(userid));
		//System.out.println(balance.getBalance());
		return balance.getBalance()+"";
	}
	
	@RequestMapping("lxm/xmxiangqingxs")
	public Map selProjectxqs(HttpSession session) {
		Userinfo userinfo = (Userinfo)session.getAttribute("UserInfo");
		Map map = new HashMap();
		Project project = (Project)session.getAttribute("projectxq");
		if(project!=null) {
			String balance = selUserBalance(userinfo.getUserid()+"");
			map.put("userinfo", userinfo);
			Loan2 loan2 = loanser.selLoansById(project.getLenderid());
			map.put("project",project);
			map.put("loan2",loan2);
			map.put("balance",balance);
			return map;
		}
		return null;
	}
	
	@RequestMapping("xmxiangqing.lxm")
	public void selProjectxq(int xmid,HttpSession session,HttpServletResponse response){
		Project project = proser.selProjectById(xmid);
		session.setAttribute("projectxq", project);
		try {
			response.sendRedirect("xmxiangqing.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("lxm/selProject")
	public Map selProject(){
		List<Project> projectlist = proser.selProject();
		List<Project> projectll = new ArrayList<Project>(); 
		List<Loan2> loanlist = new ArrayList<Loan2>(); 
		for (Project project : projectlist) {
			Loan2 loan2 = loanser.selLoansById(project.getLenderid());
			if(loan2.getApprovalstatus().equals("1")) {
				loanlist.add(loan2);
				projectll.add(project);
			}
		}
		Map map = new HashMap();
		map.put("projectlist",projectll);
		map.put("loanlist", loanlist);
		return map;
	}
	
	@RequestMapping("lxm/selsfbk")
	public String selsfbk(int userid) {
		List<customer> list = kahaoser.selkahao(userid);
		int num=0;
		for (customer customer : list) {
			String bankid = customer.getBankid();
			if(bankid!=null) {
				num++;
			}
		}
		return num+"";
	}
	
}
