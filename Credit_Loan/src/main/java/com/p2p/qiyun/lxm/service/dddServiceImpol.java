package com.p2p.qiyun.lxm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.lxm.dao.dddMapper;
import com.p2p.qiyun.lxm.domain.ddd;

@Service
public class dddServiceImpol implements dddService {
	@Autowired
	private dddMapper ddd1;
	
	public List<ddd> selDDD() {
		List<ddd> list = ddd1.selDDD();
		return list;
	}

}
