package com.p2p.qiyun.dyj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.dyj.pojo.Tandr;
import com.p2p.qiyun.dyj.service.TandrService;

@RestController
public class TandRController {
	@Autowired
	private TandrService ts;
	@RequestMapping("/addTandR")
	public String addTandR(int id,int[] idlist){
		for (int i : idlist) {
			Tandr t=new Tandr(id, i);
			ts.addTandR(t);
		}
		return "1";
	}
}
