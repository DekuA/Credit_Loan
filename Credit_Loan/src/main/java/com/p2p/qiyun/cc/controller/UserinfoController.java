package com.p2p.qiyun.cc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.cc.pojo.Userinfo;
import com.p2p.qiyun.cc.service.UserinfoService;

@RestController
public class UserinfoController {
	@Autowired
	private UserinfoService service;
	
	@RequestMapping("find")
	public List<Userinfo> userinfo() {
		List<Userinfo> userinfo = service.userinfo();
		System.out.println(userinfo);
		return userinfo;
		
	}
}
