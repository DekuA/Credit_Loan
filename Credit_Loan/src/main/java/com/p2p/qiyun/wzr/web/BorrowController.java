package com.p2p.qiyun.wzr.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.wzr.domain.BorrowVO;
import com.p2p.qiyun.wzr.domain.Loan;
import com.p2p.qiyun.wzr.domain.Userinfo;
import com.p2p.qiyun.wzr.service.BorrowService;

@RestController
public class BorrowController {

	@Autowired
	private BorrowService service;
	
	@RequestMapping("borrowall")
	public Map borrowall(String Phone,int page,int rows){
		BorrowVO vo = new BorrowVO();
		int falst = rows*(page-1);
		vo.setPage(falst);
		vo.setRows(rows);
		Userinfo user = new Userinfo();
		user.setPhone(Phone);
		vo.setU(user);
		Map map = service.borrowall(vo);
		return map;
	}
}
