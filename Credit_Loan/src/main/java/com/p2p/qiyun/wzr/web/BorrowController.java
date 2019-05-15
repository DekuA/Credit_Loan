package com.p2p.qiyun.wzr.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.wzr.domain.BorrowVO;
import com.p2p.qiyun.wzr.domain.Loan;
import com.p2p.qiyun.wzr.domain.Paymenthistory;
import com.p2p.qiyun.wzr.domain.Repayment;
import com.p2p.qiyun.wzr.domain.Userinfo;
import com.p2p.qiyun.wzr.service.BorrowService;

@RestController
public class BorrowController {

	@Autowired
	private BorrowService service;
	
	@RequestMapping("borrowall")
	public Map borrowall(String Phone,int page,int rows,String pay,String date1,String date2){
		BorrowVO vo = new BorrowVO();
		int falst = rows*(page-1);
		vo.setPage(falst);
		vo.setRows(rows);
		Loan loan = new Loan();
		loan.setApprovalstatus(pay);
		vo.setL(loan);
		vo.setDate1(date1);
		vo.setDate2(date2);
		Userinfo user = new Userinfo();
		user.setPhone(Phone);
		vo.setU(user);
		Map map = service.borrowall(vo);
		return map;
	}
	
	@RequestMapping("storyall")
	public Map storyall(int page,int rows,Userinfo user,Paymenthistory pay){
		BorrowVO vo = new BorrowVO();
		vo.setPage(rows*(page-1));
		vo.setRows(rows);
		vo.setU(user);
		vo.setP(pay);
		Map map = service.storyall(vo);
		return map;
	}
	
	@RequestMapping("loanstatus")
	public int loanstatus(int loanid){
		String string = service.loanstatus(loanid);
		if(string.equals("2")){
			return 2;
		}else if(string.equals("1")){
			return 1;
		}
		return 0;
	}
	
	@RequestMapping("borrowdetail")
	public Repayment borrowdetail(int loanid){
		Repayment repayment = service.loanidselect(loanid);
		System.out.println(repayment);
		return repayment;
	}
}
