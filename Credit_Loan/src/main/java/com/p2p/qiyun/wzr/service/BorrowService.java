package com.p2p.qiyun.wzr.service;

import java.util.List;
import java.util.Map;

import com.p2p.qiyun.wzr.domain.BorrowVO;
import com.p2p.qiyun.wzr.domain.Repayment;

public interface BorrowService {

	Map borrowall(BorrowVO vo);
	
	Map storyall(BorrowVO vo);
	
	String loanstatus(int loanid);
	Repayment loanidselect(int loanid);
}
