package com.p2p.qiyun.hjh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.hjh.entity.Loan;
import com.p2p.qiyun.hjh.entity.Query;
import com.p2p.qiyun.hjh.entity.Auditing;
import com.p2p.qiyun.hjh.service.LoanService;
import com.p2p.qiyun.xsr.domain.xiaoxi;

@RestController
public class LoanController {
	@Autowired
	private LoanService loanservice;

	@RequestMapping("selStatus")
	public List<Loan> selStatus(HttpSession session, int page) {
		int pag = (page - 1) * 3;

		List<Loan> selStatus = loanservice.selStatus(session, pag);

		return selStatus;
	}

	@RequestMapping("selectByPrimary")
	public int Auditing(Integer userid, HttpSession request) {

		
		return loanservice.selectByPrimaryKeys(userid, request);

	}

	@RequestMapping("auditingtos")
	public Map<String, Object> auditingtos(Integer page, String name) {
		
		
		int pag = (page - 1) * 5;
		Query q = new Query(name, pag, 5);

		List<Auditing> selauditing = loanservice.selauditing(q);
		int suditingcount = loanservice.suditingcount(q);
		int rows = suditingcount % 5 == 0 ? suditingcount / 5 : (suditingcount / 5) + 1;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", selauditing);
		map.put("sum", rows);

		return map;

	}

	@RequestMapping("count")
	public int count(HttpSession session) {
		int count = loanservice.count(session);

		int rows = count % 3 == 0 ? (count / 3) : (count / 3) + 1;

		return rows;
	}
}
