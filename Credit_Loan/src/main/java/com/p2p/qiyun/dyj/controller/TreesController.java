package com.p2p.qiyun.dyj.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.dyj.pojo.Trees;
import com.p2p.qiyun.dyj.pojo.Users;
import com.p2p.qiyun.dyj.service.TandrService;
import com.p2p.qiyun.dyj.service.TreesService;

@RestController
public class TreesController {
	@Autowired
	private TreesService ts;
	@Autowired
	private TandrService trs;
	@RequestMapping("hostree")
	public List<Trees> hostree(HttpSession session){
		Users u=(Users)session.getAttribute("user");
		List<Trees> list=null;
		if(u!=null){
			List<Integer> all = trs.selectId(u.getRid());
			 list = ts.find(all);
		}
		
		return list;
	}
	@RequestMapping("hostreee")
	public List<Trees> hostree(int id){
		List<Trees> treehoss =ts.select(id);
		return treehoss; 
	}
}
