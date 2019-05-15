package com.p2p.qiyun.dby.controller;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.p2p.qiyun.dby.pojo.account;
import com.p2p.qiyun.dby.pojo.balance;
import com.p2p.qiyun.dby.service.accountService;
import com.p2p.qiyun.xsr.domain.userinfo;
import com.p2p.qiyun.xsr.service.CreditService_xsr;


@RestController
public class accountController {

	@Autowired
	private accountService as;
	@Autowired
	private CreditService_xsr xs;

	balance b=new balance();


	//获取用户充值与提现记录
	@RequestMapping("getRecord_dby")
	public Map addRecrod(int yeshu,HttpSession hs,account ac) {
		String attribute = (String) hs.getAttribute("user");
		userinfo us= xs.phonechaxinxi(attribute);
		PageHelper.startPage(yeshu, 5);
		int dd = (int) hs.getAttribute("useridss");
		ac.setUserid(dd);
		List<account> record = as.getRecord(ac);
		System.out.println(yeshu);
		PageInfo<account> info=new PageInfo<>(record);
		int zonghang = (int) info.getTotal();
		int num = 0;
		if(zonghang%5==0){
			num=zonghang/5;
		}else{
			num=zonghang/5+1;
		}
		Map map = new HashMap();
		map.put("total",num);//存页数
		map.put("rows",record);//把集合存入map
		map.put("nicheng",us.getNickname());//把集合存入map
		return map;
	}

	//获取充值记录
	@RequestMapping("getchongzhi_dby")
	public  Map getRecordChongzhi(int yeshu,HttpSession hs,account ac) {
		String attribute = (String) hs.getAttribute("user");
		userinfo us= xs.phonechaxinxi(attribute);
		PageHelper.startPage(yeshu, 5);
		int dd = (int) hs.getAttribute("useridss");
		ac.setUserid(dd);
		ac.setRecord("充值");
		List<account> record = as.getRecordChongzhi(ac);
		PageInfo<account> info=new PageInfo<>(record);
		int zonghang = (int) info.getTotal();
		int num = 0;
		if(zonghang%5==0){
			num=zonghang/5;
		}else{
			num=zonghang/5+1;
		}
		Map map = new HashMap();
		map.put("total",num);//存页数
		map.put("rows",record);//把集合存入map
		map.put("nicheng",us.getNickname());//把集合存入map
		return map;			
	}

	//获取提现记录
	@RequestMapping("gettixian_dby")
	public Map getRecordTixian(int yeshu,HttpSession hs,account ac) {
		String attribute = (String) hs.getAttribute("user");
		userinfo us= xs.phonechaxinxi(attribute);
		PageHelper.startPage(yeshu, 5);
		int dd = (int) hs.getAttribute("useridss");
		ac.setUserid(dd);
		ac.setRecord("提现");
		List<account> record = as.getRecordTixian(ac);
		PageInfo<account> info=new PageInfo<>(record);
		int zonghang = (int) info.getTotal();
		int num = 0;
		if(zonghang%5==0){
			num=zonghang/5;
		}else{
			num=zonghang/5+1;
		}
		Map map = new HashMap();
		map.put("total",num);//存页数
		map.put("rows",record);//把集合存入map
		map.put("nicheng",us.getNickname());//把集合存入map
		return map;
	}



	//用户充值
	@RequestMapping("chongzhi_dby")
	public int ceshi(HttpSession hs,account ac,HttpServletRequest request,HttpServletResponse response) {
		String payPwd=request.getParameter("pwd");
		System.out.println(payPwd);
		int yue=(Integer.parseInt(ac.getRecord()));
		//获取id
		int dd = (int) hs.getAttribute("useridss");
		ac.setUserid(dd);
		b.setUserid(dd);
		b=as.getPayPwd(b);
		//判断实名验证
		account acc = as.getUserName(ac);
		String username = acc.getUsername();
		if(username==null) {
			return 2;
		}else if(b.getPayPwd().equals(payPwd)) {
			//添加充值记录
			System.out.println("密码正确");
			
			ac.setUsername(username);
			String rrr="充值"+ac.getRecord()+"元";
			ac.setRecord(rrr);
			System.out.println(ac);
			int record = as.recordChongzhi(ac);
			//添加余额
			balance ba=new balance();
			ba.setUserid(ac.getUserid());
			ba.setBalance(yue);
			int i = as.tianjiayue(ba);
			if(record!=1||i!=1) {
				return 0;
			}else {
				return record;
			}
		}else {
			System.out.println("密码错误");
			return 3;
		}
	}


	//用户提现
	@RequestMapping("tixian_dby")
	public int tixian(HttpSession hs,account ac,HttpServletRequest request,HttpServletResponse response) {
		String payPwd=request.getParameter("pwd");
		System.out.println(payPwd);
		int yue=(Integer.parseInt(ac.getRecord()));
		//获取id
		int dd = (int) hs.getAttribute("useridss");
		ac.setUserid(dd);
		b.setUserid(dd);
		b=as.getPayPwd(b);
		//判断实名验证
		account acc = as.getUserName(ac);
		String username = acc.getUsername();
		
		System.out.println(payPwd);
		System.out.println(b.getPayPwd());
		if(username==null) {
			return 2;
		}else if(b.getPayPwd().equals(payPwd)){
			System.out.println("密码正确");
			//添加提现记录
			ac.setUsername(username);
			String rrr="提现"+ac.getRecord()+"元";
			ac.setRecord(rrr);
			System.out.println(ac);
			int record = as.recordTixian(ac);

			//减少余额
			balance ba=new balance();
			ba.setUserid(ac.getUserid());
			ba.setBalance(yue);
			int i = as.jianshaoyue(ba);
			if(record!=1||i!=1) {
				return 0;
			}else {
				return 1;
			}
		}else {
			System.out.println("密码错误");
			return 3;
		}
	}

	//查询余额
	@RequestMapping("getYue_dby")
	public String getYue(HttpSession hs) {
		//获取id
		int dd = (int) hs.getAttribute("useridss");
		b.setUserid(dd);
		System.out.println(dd);
		balance balance = as.getPayPwd(b);
		int i = balance.getBalance();
		System.out.println(i);
		return i+"";
	}

}
