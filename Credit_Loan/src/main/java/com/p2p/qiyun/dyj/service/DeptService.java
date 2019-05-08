package com.p2p.qiyun.dyj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.dyj.dao.DeptMapper;
import com.p2p.qiyun.dyj.pojo.Dept;
import com.p2p.qiyun.dyj.pojo.DeptExample;
import com.p2p.qiyun.dyj.pojo.DeptQuerVO;

@Service
public class DeptService {
	@Autowired
	private DeptMapper mapper;
	public List<Dept> findDept(DeptQuerVO vo){
		List<Dept> find = mapper.selectByExample(vo);
		return find;
	}
	public int count(DeptQuerVO vo){
		int count = mapper.countByExample(vo);
		return count;
	}
	public int addDept(String deptname){
		int addDept = mapper.addDept(deptname);
		return addDept;
	}
	public Dept showByDid(int deptid){
		Dept dept = mapper.selectByPrimaryKey(deptid);
		return dept;
	}
	public int updateDept(Dept d){
		int updateByPrimaryKey = mapper.updateByPrimaryKey(d);
		return updateByPrimaryKey;
	}
	public int deleteDept(int[] idlist){
		int count = mapper.deleteDept(idlist);
		return count;
	}
}
