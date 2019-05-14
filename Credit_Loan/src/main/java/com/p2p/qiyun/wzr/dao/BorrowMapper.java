package com.p2p.qiyun.wzr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.p2p.qiyun.wzr.domain.BorrowVO;
import com.p2p.qiyun.wzr.domain.Loan;
import com.p2p.qiyun.wzr.domain.Paymenthistory;
import com.p2p.qiyun.wzr.domain.Repayment;
import com.p2p.qiyun.wzr.domain.Userinfo;
import com.p2p.qiyun.wzr.domain.Usersms;
@Mapper
public interface BorrowMapper {
	
	List<Loan> borrowall(BorrowVO vo);
	int borrowallcount(BorrowVO vo);
	
	List<Paymenthistory> storyall(BorrowVO vo);
	int storyallcount(BorrowVO vo);
	
	String loanstatus(int loanid);
	Repayment loanidselect(int loanid);
}
