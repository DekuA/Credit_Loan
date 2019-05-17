package com.p2p.qiyun.wzr.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.p2p.qiyun.wzr.dao.UserinfoMapper;
import com.p2p.qiyun.wzr.domain.Paymenthistory;
import com.p2p.qiyun.wzr.domain.VoluntarilyVo;

@Component
@Configuration
@EnableScheduling
public class Runner {

	private static final Logger logger = Logger.getLogger(Runner.class.getName());

	@Autowired
	private UserinfoMapper Mapper;

	@Scheduled(cron = "0 39 15 * * ?")
	public void queryPayStatus() throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		List<Paymenthistory> list = Mapper.voluntarilydate();
		List<Integer> voluntarilyuserid = Mapper.voluntarilyuserid();
		List<Double> voluntarilyment = Mapper.voluntarilyment();
		List<Double> voluntarilymoney = Mapper.voluntarilymoney(voluntarilyuserid);
		System.out.println(list.get(0).getStorydate());
		Date date = new Date();
		Date dd = df.parse(df.format(date.getTime()));
		for (int a = 0; a < list.size(); a++) {
			Date bb = df.parse(list.get(a).getStorydate());
			if (dd.before(bb)) {
				if(voluntarilymoney.get(a)>=list.get(a).getCurrentrepayment()) {
					Mapper.voluntarilyupdate(new VoluntarilyVo(voluntarilyuserid,voluntarilyment));
					Mapper.voluntarilypayupdate(new VoluntarilyVo(voluntarilyuserid,voluntarilyment));
				}else {
					Mapper.voluntarilypayupdate2(new VoluntarilyVo(voluntarilyuserid.get(a),list.get(a).getCurrentrepayment()));
					Mapper.voluntarilycustupdate(new VoluntarilyVo(voluntarilyuserid.get(a),list.get(a).getCurrentrepayment()));
				}
			} else {
				System.out.println("9892138918");

			}
		}

	}
}