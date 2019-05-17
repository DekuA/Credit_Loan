package com.p2p.qiyun.cc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.cc.pojo.Loan;
import com.p2p.qiyun.cc.service.LoanerService;

@RestController
public class LoanerController {
	@Autowired
	private LoanerService service;
	
	/* String a=null; */
	@RequestMapping("findloan")
	public List<Loan> selectLoan(Integer id){
		System.out.println(id);
		List<Loan> list = service.selectLoan(id);
		System.out.println(list);
		
		/*
		 * for (int i = 0; i < list.size(); i++) { Loan loan = list.get(i); a =
		 * loan.getU().getIdnumber(); System.out.println(a); } String substring =
		 * a.substring(a.length()-2, a.length()-1); System.out.println(substring);
		 */
		
		return list;
		
	}
	/*
	 * public static void main(String[] args) { String a="430421199805198216";
	 * String substring = a.substring(a.length()-2, a.length()-1);
	 * System.out.println(substring);
	 * 
	 * }
	 */
	 
}
