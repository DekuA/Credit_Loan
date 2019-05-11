package com.p2p.qiyun.xsr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.p2p.qiyun.dyj.pojo.Users;
import com.p2p.qiyun.lsx.entity.Loan;
import com.p2p.qiyun.xsr.domain.customer;
import com.p2p.qiyun.xsr.domain.kefuinfo;
import com.p2p.qiyun.xsr.domain.repayment;
import com.p2p.qiyun.xsr.domain.userinfo;
import com.p2p.qiyun.xsr.domain.xiaoxi;

@Mapper
public interface CreditMapper_xsr {
	userinfo phonechaxinxi(String phone);//查用户中心
	List<customer> kehuxinxi(int userid);//查客户信息
	List<String> scdenglu(String phone);//登录时间
	int shimingrz(userinfo info);//实名认证
	int delecus(int id);//删除无用的客户信息
	int bangyou(customer cus);//绑定邮箱
	int xiumi(userinfo info);//修改密码
	customer kehuxinxi22(int id);//查客户信息 
	int bangyin(customer cus);//绑定银行卡
	int xiuxinyongfen(customer cus);//修改信用分
	List<xiaoxi> xioxichaxun(int id);//查消息中心
	List<Loan> chajiekuan(int userid);//查借款记录
	List<repayment> chahuankuan(int userid);//查询还款信息
	
	int chaduihuatext(kefuinfo kf);//发给客服信息
	List<kefuinfo> chatextuser(int userid);//查询对话信息
	Users chakfu(int uid);//查询客户对象
}
