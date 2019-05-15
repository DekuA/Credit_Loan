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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.p2p.qiyun.dby.pojo.Map1;
import com.p2p.qiyun.dby.pojo.account;
import com.p2p.qiyun.dby.pojo.balance;
import com.p2p.qiyun.dby.pojo.rows1;
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
	

	//获取所有记录
	// 后台获得所有商品
		@RequestMapping("getAll_dby")
		public  Map1 getEmp(rows1 ro,HttpServletRequest request,HttpServletResponse response) {
			
			int page=Integer.parseInt(request.getParameter("page"));
			int rows=Integer.parseInt(request.getParameter("rows"));
			System.out.println(page+"+++"+rows);
			int a=(page-1)*rows;
			System.out.println(page+"----"+rows);
			ro.setA(a);
			ro.setRows(rows);
			int count = as.getCount();
			System.out.println(ro);
			System.out.println("count是"+count);
			
			List<account> list = as.getAll(ro);
			Map1 m=new Map1();
			
			m.setRows(list);
			m.setTotal(count);
			System.out.println(m);
			return m;
		}
		
		//后台条件查询
		@RequestMapping("getTiaojian_dby")
		public  Map1 getAccount(rows1 ro,HttpServletRequest request,HttpServletResponse response) {
			account ac=new account();
			List<account> list =null;
			int page=Integer.parseInt(request.getParameter("page"));
			int rows=Integer.parseInt(request.getParameter("rows"));
			System.out.println(page+"-----"+rows);
			int a=(page-1)*rows;
			ro.setA(a);
			ro.setRows(rows);
			int count ;
			
			//添加条件
			
			String record=request.getParameter("record");
			System.out.println(record);
			if(record.equals("1")) {
				record="";
			}else if(record.equals("2")) {
				record="充值";
			}else if(record.equals("3")) {
				record="提现";
			}
			
			
			//判断时间
			String startTime=request.getParameter("startTime");
			String endTime=request.getParameter("endTime");
			if(startTime=="") {
				startTime="2019-05-01";
			}
			if(endTime=="") {
				endTime="2020-05-01";
			}
			
			//添加数据
			ac.setEndTime(endTime);
			ac.setRecord(record);
			ac.setStartTime(startTime);
			ac.setA(ro.getA());				
			ac.setRows(ro.getRows());
			//判断是否有id，用不同的sql语句
			int userid;
			String userid1 = request.getParameter("userid");
			if(userid1!="") {
				userid=Integer.parseInt(userid1);
				ac.setUserid(userid);
				System.out.println(ac);
				 list = as.houtaiCha(ac);
				 count = as.getCount1(ac);
			}else {
				System.out.println(ac);
				 list = as.houtaiCha1(ac);
				 count = as.getCount2(ac);
			}
			
			Map1 m=new Map1();
			
			m.setRows(list);
			m.setTotal(count);
			System.out.println(m);
			return m;
		}
		
		
	//获取用户充值与提现记录
	@RequestMapping("getRecord_dby")
	public Map addRecrod(int yeshu,HttpSession hs,account ac) {
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

		return map;
	}

	//获取充值记录
	@RequestMapping("getchongzhi_dby")
	public  Map getRecordChongzhi(int yeshu,HttpSession hs,account ac) {
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
		
		return map;			
	}

	//获取提现记录
	@RequestMapping("gettixian_dby")
	public Map getRecordTixian(int yeshu,HttpSession hs,account ac) {
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
		if(username.length()<2) {
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
		if(username.length()<2) {
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
