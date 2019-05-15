package com.p2p.qiyun.wzr.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alipay.api.AlipayApiException;

@Service
public class PayService {
		@Autowired
	    private Alipay alipay;
	    
	    public String aliPay(AlipayBean alipayBean) throws AlipayApiException {
	        return alipay.pay(alipayBean);
	    }
}
