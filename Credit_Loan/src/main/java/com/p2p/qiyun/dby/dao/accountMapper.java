package com.p2p.qiyun.dby.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.p2p.qiyun.dby.pojo.account;


@Mapper
public interface accountMapper {
	//查询用户记录
	List<account> getRecord(account ac);
	//查询用户充值记录
	List<account> getRecordChongzhi(account ac);
	//查询用户提现记录
	List<account> getRecordTixian(account ac);
	//添加用户充值记录
	int addRecrodChongzhi(account ac);
	//添加用户提现记录
	int addRecrodTixian(account ac);
 }
