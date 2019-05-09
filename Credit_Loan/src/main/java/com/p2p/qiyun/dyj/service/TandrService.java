package com.p2p.qiyun.dyj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.dyj.dao.TandrMapper;
import com.p2p.qiyun.dyj.pojo.Tandr;

@Service
public class TandrService {
	@Autowired
	private TandrMapper mapper;
	public List<Integer> selectId(int rid){
		List<Integer> list = mapper.selectId(rid);
		return list;
	}
	public int addTandR(Tandr t){
		int insert = mapper.insert(t);
		return insert;
	}
	public int deleteTandR(int[] idlist){
		int deleteTandR = mapper.deleteTandR(idlist);
		return deleteTandR;
	}
}
