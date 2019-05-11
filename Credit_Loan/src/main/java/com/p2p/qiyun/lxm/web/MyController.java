package com.p2p.qiyun.lxm.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.cjz.domain.customer;
import com.p2p.qiyun.cjz.service.kahaoxxService;
import com.p2p.qiyun.lxm.domain.ddd;
import com.p2p.qiyun.lxm.service.dddService;
import com.p2p.qiyun.wzr.domain.Userinfo;

@RestController
public class MyController {
	
	@Autowired
	private kahaoxxService kahaoser;
	
	@RequestMapping("lxm/selsfbk")
	public String selsfbk(int userid) {
		List<customer> list = kahaoser.selkahao(userid);
		int num=0;
		for (customer customer : list) {
			String bankid = customer.getBankid();
			if(bankid!=null) {
				num++;
			}
		}
		return num+"";
	}
	
}
