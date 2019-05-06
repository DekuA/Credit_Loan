package com.p2p.qiyun.dyj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.dyj.dao.TreesMapper;
import com.p2p.qiyun.dyj.pojo.Trees;

@Service
public class TreesService {
	@Autowired
	private TreesMapper mapper;
	public List<Trees> find(List<Integer> tid){
		List<Trees> find = mapper.find(tid);
		return find;
	}
	public List<Trees> select(int id){
		List<Trees> list = mapper.select(id);
		return list;
	}
}
