package com.p2p.qiyun.hjh.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.p2p.qiyun.dyj.pojo.Users;
import com.p2p.qiyun.hjh.dao.CustomerMapper;
import com.p2p.qiyun.hjh.dao.LoanMapper;
import com.p2p.qiyun.hjh.entity.Customer;
import com.p2p.qiyun.hjh.entity.Loan;


@Service
public class LoanServiceimpol implements LoanService {
	@Autowired
private	LoanMapper lomapper;
	@Autowired
private	CustomerMapper comter;
	@Override
	public List<Loan> selStatus() {
		// TODO Auto-generated method stub
		List<Loan> selStatus = lomapper.selStatus();
	
		return selStatus;
	}
	@Override
	public int selectByPrimaryKeys(Integer id,HttpServletRequest request) {
		// TODO Auto-generated method stub
		Customer selectByPrimaryKey = comter.selectByPrimaryKeys(id);
		int parseInt = Integer.parseInt(selectByPrimaryKey.getCreditrate());
		if (parseInt < 500) {
			return 0;

		} else {

			Users  u =(Users) request.getAttribute("user");
			System.out.println("user----"+u);
			Loan a=new Loan(u.getUid());
			
			if(lomapper.insertSelective(a)>0) {
				
				return 1;
			}else {
				
				return 0;
			}
			
			
		}
		
	}
	
	
	
}
