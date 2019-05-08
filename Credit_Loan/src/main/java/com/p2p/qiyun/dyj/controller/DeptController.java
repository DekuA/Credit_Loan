package com.p2p.qiyun.dyj.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.dyj.pojo.Dept;
import com.p2p.qiyun.dyj.pojo.DeptQuerVO;
import com.p2p.qiyun.dyj.service.DeptService;

@RestController
public class DeptController {
	@Autowired
	private DeptService ds;
	@RequestMapping("/findDepartment")
	public Map<String, Object> findDept(int page,int rows){
		DeptQuerVO p=new DeptQuerVO(rows*(page-1), rows);
		List<Dept> list = ds.findDept(p);
		Map<String, Object> map=new HashMap();
		map.put("rows", list);
		map.put("total", ds.count(p));
		return map;
	}
	@RequestMapping("/addDept")
	public int addDept(String deptname){
		int addDept = ds.addDept(deptname);
		return addDept;
	}
	@RequestMapping("/showByDid")
	public Dept showByDid(int deptid){
		Dept dept = ds.showByDid(deptid);
		return dept;
	}
	@RequestMapping("/updatedept")
	public int updateDept(Dept d){
		int dept = ds.updateDept(d);
		return dept;
	}
	@RequestMapping("/deleteDept")
	public int deleteDept(int[] idlist){
		int count = ds.deleteDept(idlist);
		return count;
	}
	
}
