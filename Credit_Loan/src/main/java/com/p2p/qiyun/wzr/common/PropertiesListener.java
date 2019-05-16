package com.p2p.qiyun.wzr.common;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class PropertiesListener implements ApplicationListener<ApplicationStartedEvent> {

	@Override
	public void onApplicationEvent(ApplicationStartedEvent arg0) {
		  AlipayProperties.loadProperties();
	}

}
