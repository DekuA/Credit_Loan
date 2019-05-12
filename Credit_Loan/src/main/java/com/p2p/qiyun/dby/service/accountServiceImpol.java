package com.p2p.qiyun.dby.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.dby.dao.accountMapper;
import com.p2p.qiyun.dby.pojo.account;

@Service
public class accountServiceImpol implements accountService {

	@Autowired
	private accountMapper acc;

	
	//查询用户记录
	@Override
	public List<account> getRecord(account ac) {
		// TODO Auto-generated method stub
		return acc.getRecord(ac);
	}

	
	//查询用户充值记录
	@Override
	public List<account> getRecordChongzhi(account ac) {
		// TODO Auto-generated method stub
		return acc.getRecordChongzhi(ac);
	}

	
	//查询用户提现记录
	@Override
	public List<account> getRecordTixian(account ac) {
		// TODO Auto-generated method stub
		return acc.getRecordTixian(ac);
	}

	
	//添加用户充值记录
	@Override
	public int addRecrodChongzhi(account ac) {
		// TODO Auto-generated method stub
		return acc.addRecrodChongzhi(ac);
	}

	
	//添加用户提现记录
	@Override
	public int addRecrodTixian(account ac) {
		// TODO Auto-generated method stub
		return acc.addRecrodTixian(ac);
	}
	


}
