package com.p2p.qiyun.hjh.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAge {


	public static int getAge(String code) {

		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String currentYear = format.format(date).substring(0, 4);

		String substring = code.substring(6, 10);

		int age = Integer.parseInt(currentYear) - Integer.parseInt(substring);
		return age;

	}

}
