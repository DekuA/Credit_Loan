package com.p2p.qiyun.cc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.p2p.qiyun.cc.pojo.Userinfo;
import com.p2p.qiyun.cc.pojo.UserinfoQueryVO;
import com.p2p.qiyun.cc.service.UserinfoerService;



@RestController
public class UserinfoerController {
	@Autowired
	private UserinfoerService service;
	
	@RequestMapping("find")
	public Map<String, Object> userinfo(UserinfoQueryVO v,Userinfo u,HttpSession session,Integer page,Integer rows) {
		
		v.setU(u);
		v.setPageNum((page-1)*rows);
		v.setMaxPage(rows);
		List<Userinfo> userinfo = service.userinfo(v);
		Map<String, Object> map=new HashMap<>();
		map.put("rows", userinfo);
		map.put("total", service.count(v));
		return map;
		
	}
	
}
