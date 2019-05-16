package com.p2p.qiyun.dby.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.dby.dao.accountMapper;
import com.p2p.qiyun.dby.pojo.account;
import com.p2p.qiyun.dby.pojo.balance;
import com.p2p.qiyun.dby.pojo.rows1;

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
	public int recordChongzhi(account ac) {
		// TODO Auto-generated method stub
		return acc.recordChongzhi(ac);
	}


	
	//添加用户提现记录
	@Override
	public int recordTixian(account ac) {
		// TODO Auto-generated method stub
		return acc.recordTixian(ac);
	}


	@Override
	public int tianjiayue(balance ba) {
		// TODO Auto-generated method stub
		return acc.tianjiayue(ba);
	}


	@Override
	public int jianshaoyue(balance ba) {
		// TODO Auto-generated method stub
		return acc.jianshaoyue(ba);
	}


	@Override
	public account getUserName(account ac) {
		// TODO Auto-generated method stub
		return acc.getUserName(ac);
	}


	@Override
	public balance getPayPwd(balance ba) {
		// TODO Auto-generated method stub
		return acc.getPayPwd(ba);
	}


	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return acc.getCount();
	}


	@Override
	public List<account> getAll(rows1 ro) {
		// TODO Auto-generated method stub
		return acc.getAll(ro);
	}


	@Override
	public List<account> houtaiCha(account ac) {
		// TODO Auto-generated method stub
		return acc.houtaiCha(ac);
	}


	@Override
	public List<account> houtaiCha1(account ac) {
		// TODO Auto-generated method stub
		return acc.houtaiCha1(ac);
	}


	@Override
	public int getCount1(account ac) {
		// TODO Auto-generated method stub
		return acc.getCount1(ac);
	}


	@Override
	public int getCount2(account ac) {
		// TODO Auto-generated method stub
		return acc.getCount2(ac);
	}

	


	

	
	


}
