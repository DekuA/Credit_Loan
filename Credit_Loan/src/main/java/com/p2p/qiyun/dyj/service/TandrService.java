package com.p2p.qiyun.dyj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.dyj.dao.TandrMapper;

@Service
public class TandrService {
	@Autowired
	private TandrMapper mapper;
	public List<Integer> selectId(int rid){
		List<Integer> list = mapper.selectId(rid);
		return list;
	}
}
