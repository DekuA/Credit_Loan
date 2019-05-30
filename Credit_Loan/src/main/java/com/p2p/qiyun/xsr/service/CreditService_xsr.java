package com.p2p.qiyun.xsr.service;

import java.util.List;

import com.p2p.qiyun.cjz.domain.investnotes;
import com.p2p.qiyun.dby.pojo.balance;
import com.p2p.qiyun.dyj.pojo.Users;
import com.p2p.qiyun.lsx.entity.Loan;
import com.p2p.qiyun.xsr.domain.customer;
import com.p2p.qiyun.xsr.domain.kefuinfo;
import com.p2p.qiyun.xsr.domain.paymenthistory;
import com.p2p.qiyun.xsr.domain.touxiang;
import com.p2p.qiyun.xsr.domain.userinfo;
import com.p2p.qiyun.xsr.domain.usersfz;
import com.p2p.qiyun.xsr.domain.xiaoxi;

public interface CreditService_xsr {
	userinfo phonechaxinxi(String phone);
	List<customer> kehuxinxi(int userid);
	String scdenglu(String phone);
	int shimingrz(userinfo info);
	int delecus(int id);
	int bangyou(customer cus);
	int xiumi(userinfo info);
	customer kehuxinxi22(int id);
	int bangyin(customer cus);
	int xiuxinyongfen(customer cus);
	List<xiaoxi> xioxichaxun(int id);
	List<Loan> chajiekuan(int userid);//查借款记录
	List<paymenthistory> chahuankuan(int userid);//查询还款信息
	int chaduihuatext(kefuinfo kf);//发给客服信息
	List<kefuinfo> chatextuser(int userid);//查询对话信息
	Users chakfu(int uid);//查询客户对象
	String setousrc(int userid);//查询头像路径
	int updasrc(touxiang tou);//修改头像
	int xiunicheng(userinfo us);//修改昵称;
	int addtoux(int usid);
	int addsfzzp(usersfz sfzzp);//上传身份证
	int addbalance(int userid);//添加余额信息
	balance sebalance(int userid);//查询余额信息存不存在
	List<userinfo> chaxunqingqiu(List<String> list);//查询用户请求
	int upzfmm(balance ba);//设置支付密码
	int charuxiaoxi(xiaoxi xo);
	
	List<investnotes> wodetouzibiao(int userid);//查询我的投资
	int zqzrcaozuo(investnotes in);//转让操作
	int zqzrcaozuo2(investnotes in);//转让操作

}
