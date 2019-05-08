package com.p2p.qiyun.hjh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.hjh.dao.LoanMapper;
import com.p2p.qiyun.hjh.entity.Loan;


@Service
public class LoanServiceimpol implements LoanService {
	@Autowired
private	LoanMapper lomapper;
	@Override
	public List<Loan> selStatus() {
		// TODO Auto-generated method stub
		List<Loan> selStatus = lomapper.selStatus();
		return selStatus;
	}

}
