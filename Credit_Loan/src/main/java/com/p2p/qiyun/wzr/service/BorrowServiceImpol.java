package com.p2p.qiyun.wzr.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.wzr.dao.BorrowMapper;
import com.p2p.qiyun.wzr.domain.BorrowVO;
import com.p2p.qiyun.wzr.domain.Loan;
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
}
