package com.p2p.qiyun.xsr.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.xsr.dao.liclass_usercoupon;
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
	
	@RequestMapping("xiumima_xsr")
	public String xiumima_xsr(String password1,String password2,HttpSession session) {
		String attribute = (String) session.getAttribute("user");
		ByteSource bytes = ByteSource.Util.bytes(attribute);
		SimpleHash hash = new SimpleHash("MD5",password1,bytes,1234);
		userinfo phonechaxinxi = im.phonechaxinxi(attribute);		
		if(hash.toString().equals(phonechaxinxi.getPassword())) {
			SimpleHash hash2 = new SimpleHash("MD5",password2,bytes,1234);
			userinfo info = new userinfo(0, null, null, null, attribute, hash2.toString());
			int xiumi = im.xiumi(info);
			return 1+"";
		}else {
			return 0+"";	
		}		
	}
	
	
	@RequestMapping("chayin_xsr")
	public customer chayin_xsr(HttpSession session) {
		int attribute = (int) session.getAttribute("Customerid_xsr");
		customer keh = im.kehuxinxi22(attribute);
		return keh;
	}
	
	@RequestMapping("bangyin_xsr")
	public String bangyin_xsr(customer cus,HttpSession session) {
		int attribute = (int) session.getAttribute("Customerid_xsr");
		cus.setCustomerid(attribute);
		int bangyin = im.bangyin(cus);
		return bangyin+"";
	}
	
	@RequestMapping("panduan_xsr")
	public String panduan_xsr(HttpSession session) {
		String attribute = (String) session.getAttribute("user");
		userinfo us = im.phonechaxinxi(attribute);
		if(us.getIdnumber()!=null) {
			return "1";
		}else {
			return "0";
		}	
	}
	
	@RequestMapping("shuaping_xsr")
	public String shuaping_xsr(HttpSession session) {
		String attribute = (String) session.getAttribute("user");
		userinfo us= im.phonechaxinxi(attribute);
		int cid = (int) session.getAttribute("Customerid_xsr");
		customer kehu = im.kehuxinxi22(cid);		
		String num="400";
		if(us.getIdnumber()!=null && kehu.getBankid()==null) {
			num="500";
		}
		if(us.getIdnumber()!=null && kehu.getBankid()!=null) {
			num="580";
		}
		kehu.setCreditrate(num);
		int xiuxinyongfen = im.xiuxinyongfen(kehu);
		return num+"分";
	}
	@RequestMapping("panlogin_xsr")
	public String panlogin_xsr(HttpSession session) {
		if(session.getAttribute("user")!=null) {
			return "1";
		}
		return "0";
			
	}
	
	/*
	 * @RequestMapping("xiaoxi_xsr") public List<liclass_usercoupon>
	 * xiaoxi_xsr(HttpSession session) { String attribute = (String)
	 * session.getAttribute("user"); userinfo us= im.phonechaxinxi(attribute);
	 * List<liclass_usercoupon> xiaoxizhongxin = im.xiaoxizhongxin(us.getUserid());
	 * return xiaoxizhongxin;
	 * 
	 * }
	 */
}
