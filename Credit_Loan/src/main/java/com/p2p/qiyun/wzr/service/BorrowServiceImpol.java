package com.p2p.qiyun.wzr.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.wzr.dao.BorrowMapper;
import com.p2p.qiyun.wzr.domain.BorrowVO;
import com.p2p.qiyun.wzr.domain.Userinfo;

@Service
public class BorrowServiceImpol implements BorrowService {

	@Autowired
	private BorrowMapper Mapper;
	@Override
	public Map borrowall(BorrowVO vo) {
		Map map = new HashMap<>();
		List<Userinfo> list = Mapper.borrowall(vo);
		int i = Mapper.borrowallcount(vo);
		map.put("rows", list);
		map.put("total", i);
		return map;
	}
}
