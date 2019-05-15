package com.p2p.qiyun.wzr.common;

import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;

import com.p2p.qiyun.wzr.service.BorrowService;

public class Test extends TimerTask{

	@Autowired
	private BorrowService service;
	
	@Override
	public void run() {
		
	}

	
}
