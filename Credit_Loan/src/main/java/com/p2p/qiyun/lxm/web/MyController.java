package com.p2p.qiyun.lxm.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.cjz.domain.customer;
import com.p2p.qiyun.cjz.service.kahaoxxService;
import com.p2p.qiyun.lsx.entity.Loan2;
import com.p2p.qiyun.lsx.service.LoanService2;
import com.p2p.qiyun.lxm.domain.Project;
import com.p2p.qiyun.lxm.domain.ddd;
import com.p2p.qiyun.lxm.service.ProjectService;
import com.p2p.qiyun.lxm.service.dddService;
import com.p2p.qiyun.wzr.domain.Userinfo;

@RestController
public class MyController {
	@Autowired
	private kahaoxxService kahaoser;
	
	@Autowired
	private LoanService2 loanser;
	
	@Autowired
	private ProjectService proser;
	
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
