package com.p2p.qiyun.wzr.service;

import java.io.File;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URI;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.model.CityResponse;
import com.maxmind.geoip2.record.City;
import com.maxmind.geoip2.record.Subdivision;
import com.p2p.qiyun.wzr.dao.UserinfoMapper;
import com.p2p.qiyun.wzr.domain.userinfo;

@Service
public class UserinfoServiceImpol implements UserinfoService {

	@Autowired
	private UserinfoMapper Mapper;

	@Override
	public userinfo UserEntry(String phone) {
		userinfo entry = Mapper.UserEntry(phone);
		return entry;
	}

	@Override
	public int UserEnroll(userinfo user) {
		int enroll = Mapper.UserEnroll(user);
		return enroll;
	}

	@Override
	public int UserCode(userinfo user) {
		int userCode = Mapper.UserCode(user);
		return userCode;
	}

	@Override
	public int UserTime(String phone) {
		int time = Mapper.UserTime(phone);
		return time;
	}
}
