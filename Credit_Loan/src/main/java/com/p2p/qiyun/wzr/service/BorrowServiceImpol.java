package com.p2p.qiyun.wzr.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.wzr.dao.BorrowMapper;
import com.p2p.qiyun.wzr.domain.BorrowVO;
import com.p2p.qiyun.wzr.domain.Loan;
import com.p2p.qiyun.wzr.domain.Paymenthistory;
import com.p2p.qiyun.wzr.domain.Repayment;
import com.p2p.qiyun.wzr.domain.Userinfo;

@Service
public class BorrowServiceImpol implements BorrowService {

	@Autowired
	private BorrowMapper Mapper;
	@Override
	public Map borrowall(BorrowVO vo) {
		Map map = new HashMap<>();
		List<Loan> list = Mapper.borrowall(vo);
		for(int a = 0;a<list.size();a++){
			if(list.get(a).getApprovalstatus().equals("0")){
				list.get(a).setApprovalstatus("待审批");
			}else if(list.get(a).getApprovalstatus().equals("1")){
				list.get(a).setApprovalstatus("通过");
			}else if(list.get(a).getApprovalstatus().equals("2")){
				list.get(a).setApprovalstatus("驳回");
			}
		}
		int i = Mapper.borrowallcount(vo);
		map.put("rows", list);
		map.put("total", i);
		return map;
	}
	@Override
	public Map storyall(BorrowVO vo) {
		Map map = new HashMap<>();
		List<Paymenthistory> list = Mapper.storyall(vo);
		for(int a = 0;a<list.size();a++){
			if(list.get(a).getPaymentstatus().equals("0")){
				list.get(a).setPaymentstatus("待还款");
			}else if(list.get(a).getPaymentstatus().equals("1")){
				list.get(a).setPaymentstatus("已还款");
			}else if(list.get(a).getPaymentstatus().equals("2")){
				list.get(a).setPaymentstatus("逾期");
			}
		}
		int i = Mapper.storyallcount(vo);
		map.put("rows", list);
		map.put("total", i);
		return map;
	}
	@Override
	public Repayment loanidselect(int loanid) {
		Repayment repayment = Mapper.loanidselect(loanid);
		return repayment;
	}
	@Override
	public String loanstatus(int loanid) {
		String string = Mapper.loanstatus(loanid);
		return string;
	}
}
