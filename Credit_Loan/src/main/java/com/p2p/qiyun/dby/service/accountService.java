package com.p2p.qiyun.dby.service;

import java.util.List;

import com.p2p.qiyun.dby.pojo.account;
import com.p2p.qiyun.dby.pojo.balance;
import com.p2p.qiyun.dby.pojo.rows1;

public interface accountService {
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
		
		//EasyUI用
		//获取总数
		int getCount();
		//获取所有记录
		List<account> getAll(rows1 ro);
		//后台模糊查询记录和总数 有ID
		List<account>houtaiCha(account ac);
		int getCount1(account ac);
		
		//后台模糊查询记录和总数
		List<account>houtaiCha1(account ac);
		int getCount2(account ac);
}
