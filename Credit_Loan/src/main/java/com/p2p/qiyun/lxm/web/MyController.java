package com.p2p.qiyun.lxm.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.cjz.domain.customer;
import com.p2p.qiyun.cjz.service.kahaoxxService;
import com.p2p.qiyun.lsx.entity.Loan2;
import com.p2p.qiyun.lsx.service.LoanService2;
import com.p2p.qiyun.lxm.domain.Balancelxm;
import com.p2p.qiyun.lxm.domain.Investnotes;
import com.p2p.qiyun.lxm.domain.Project;
import com.p2p.qiyun.lxm.domain.ddd;
import com.p2p.qiyun.lxm.service.ProjectService;
import com.p2p.qiyun.lxm.service.dddService;
import com.p2p.qiyun.wzr.domain.Userinfo;
import com.p2p.qiyun.wzr.service.UserinfoService;

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
		return balance.getBalance()+"";
	}
	
	@RequestMapping("lxm/xmxiangqingxs")
	public Map selProjectxqs(HttpSession session) {
		Userinfo userinfo = (Userinfo)session.getAttribute("UserInfo");
		Map map = new HashMap();
		Project project = (Project)session.getAttribute("projectxq");
		if(project!=null) {
			Balancelxm balance = proser.selBalance(userinfo.getUserid());
			map.put("userinfo", userinfo);
			Loan2 loan2 = loanser.selLoansById(project.getLenderid());
			map.put("project",project);
			map.put("loan2",loan2);
			map.put("usermoney",balance.getBalance());
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
		List<Loan2> loanlist = new ArrayList<Loan2>(); 
		for (Project project : projectlist) {
			Loan2 loan2 = loanser.selLoansById(project.getLenderid());
			loanlist.add(loan2);
		}
		Map map = new HashMap();
		map.put("projectlist",projectlist);
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
