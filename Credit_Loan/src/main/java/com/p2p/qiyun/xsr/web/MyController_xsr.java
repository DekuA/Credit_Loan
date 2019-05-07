package com.p2p.qiyun.xsr.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.xsr.domain.customer;
import com.p2p.qiyun.xsr.domain.userinfo;
import com.p2p.qiyun.xsr.service.CreditService_xsr;


@RestController
public class MyController_xsr {
	@Autowired
	private CreditService_xsr im;
	
	@RequestMapping("zhanghu_xsr")
	public Map kehuxx(HttpSession session) {
		String attribute = (String) session.getAttribute("user");
		userinfo us= im.phonechaxinxi(attribute);
		List<customer> kehuxinxi = im.kehuxinxi(us.getUserid());
		for (int i = 1; i < kehuxinxi.size(); i++) {
			im.delecus(kehuxinxi.get(i).getCustomerid());			
		}
		session.setAttribute("Customerid_xsr", kehuxinxi.get(0).getCustomerid());
		String scdenglu = im.scdenglu(us.getPhone());
		Map map = new HashMap();
		map.put("userinfo_xsr",us);
		map.put("customer_xsr",kehuxinxi.get(0));
		map.put("logintime_xsr",scdenglu);
		return map;
	}
	
	@RequestMapping("shimingname_xsr")
	public String shimingname(userinfo info,HttpSession session) {
		info.setPhone((String) session.getAttribute("user"));
		int shimingrz = im.shimingrz(info);		
		return shimingrz+"";
	}
	

	@RequestMapping("bangyou_xsr")
	public String bangyou_xsr(customer cus,HttpSession session) {
		int attribute = (int) session.getAttribute("Customerid_xsr");
		cus.setCustomerid(attribute);
		int bangyou = im.bangyou(cus);
		return bangyou+"";
	}
}
