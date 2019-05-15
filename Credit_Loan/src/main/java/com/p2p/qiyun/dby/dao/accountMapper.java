package com.p2p.qiyun.dby.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.p2p.qiyun.dby.pojo.account;
import com.p2p.qiyun.dby.pojo.balance;


@Mapper
public interface accountMapper {
	//查询用户记录
	List<account> getRecord(account ac);
	//查询用户充值记录
	List<account> getRecordChongzhi(account ac);
	//查询用户提现记录
	List<account> getRecordTixian(account ac);
	//添加用户充值记录
	int recordChongzhi(account ac);
	//添加用户提现记录
	int recordTixian(account ac);
	//添加余额
	int tianjiayue(balance ba);
	//减少余额
	int jianshaoyue(balance ba);
	//根据id查姓名
	account getUserName(account ac);
	//验证支付密码
	balance getPayPwd(balance ba);
	
 }
