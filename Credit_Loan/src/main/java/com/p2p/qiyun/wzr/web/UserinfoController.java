package com.p2p.qiyun.wzr.web;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.wzr.common.SmsAO;
import com.p2p.qiyun.wzr.common.Test;
import com.p2p.qiyun.wzr.common.cn.com.webxml.ArrayOfString;
import com.p2p.qiyun.wzr.common.cn.com.webxml.WeatherWSSoap;
import com.p2p.qiyun.wzr.common.cn.com.webxml.WeatherWS;
import com.p2p.qiyun.wzr.domain.Userinfo;
import com.p2p.qiyun.wzr.domain.Usersms;
import com.p2p.qiyun.wzr.service.UserinfoService;
import com.p2p.qiyun.xsr.domain.customer;
import com.p2p.qiyun.xsr.service.CreditService_xsr;

@RestController
public class UserinfoController {

	@Autowired
	private UserinfoService service;
	@Autowired
	private CreditService_xsr im;
	


	@RequestMapping("sendsms")
	public int sendsms(String mobile,int smstype) throws Exception {
		SmsAO ao = new SmsAO();
		String code = "";
		for(int t = 0; t < 6; t++){
			int a = (int) Math.floor(Math.random()*10);
			code += a;
		}
		int send = ao.send(mobile, code);
		if(send>0) {
			Date now = new Date();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Usersms sms = new Usersms();
			sms.setMobile(mobile);
			sms.setSmscode(code);
			sms.setSmstype(smstype);
			sms.setExpiredtime(df.format(now.getTime()));
			service.smsinsert(sms);
			return 1;
		}
		return 0;
	}
	
	@RequestMapping("smsselect")
	public String smsselect(String mobile) throws ParseException {
		Usersms usersms = service.smsselect(mobile);
		String time = usersms.getExpiredtime();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c1=Calendar.getInstance();
		Calendar c2=Calendar.getInstance();
		Calendar c3=Calendar.getInstance();
		Date date = df.parse(time);
		c1.setTime(date);//要判断的日期
		c2.setTime(new Date());//初始日期
		c3.setTime(new Date());//也给初始日期 把分钟加五
		c3.add(c3.MINUTE, 5);
		c2.add(c2.MINUTE,-5);//减去五分钟
			if(c1.after(c2)&&c1.before(c3)){
				return usersms.getSmscode();
			}
		return ""+0;
	}
	
	@RequestMapping("smsselect2")
	public String smsselect2(String mobile) throws ParseException {
		Usersms usersms = service.smsselect2(mobile);
		String time = usersms.getExpiredtime();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c1=Calendar.getInstance();
		Calendar c2=Calendar.getInstance();
		Calendar c3=Calendar.getInstance();
		Date date = df.parse(time);
		c1.setTime(date);//要判断的日期
		c2.setTime(new Date());//初始日期
		c3.setTime(new Date());//也给初始日期 把分钟加五
		c3.add(c3.MINUTE, 5);
		c2.add(c2.MINUTE,-5);//减去五分钟
			if(c1.after(c2)&&c1.before(c3)){
				return usersms.getSmscode();
			}
		return ""+0;
	}
		
	@RequestMapping("userentry")
	public int userentry(Userinfo user,HttpSession session){
		

		ByteSource bytes = ByteSource.Util.bytes(user.getPhone());
		SimpleHash hash = new SimpleHash("MD5",user.getPassword(),bytes,1234);
		user.setPassword(hash.toString());
		List<Userinfo> list = service.userlogin(user);
		if(list.size()>0){
			session.setAttribute("user", user.getPhone());
			service.UserTime(user.getPhone());
			Userinfo userEntry = service.UserEntry(user.getPhone());
			session.setAttribute("UserInfo",userEntry);
			session.setAttribute("username", user.getNickname());
			session.setAttribute("useridss", userEntry.getUserid());
			if(im.setousrc(userEntry.getUserid())==null) {
				im.addtoux(userEntry.getUserid());
			}	
			if(im.sebalance(userEntry.getUserid())==null) {				
				System.out.println(1);
				im.addbalance(userEntry.getUserid());
			}
			service.charukuhuxinxi(userEntry.getUserid());
			List<customer> kehuxinxi = im.kehuxinxi(userEntry.getUserid());
			for (int i = 1; i < kehuxinxi.size(); i++) {
				im.delecus(kehuxinxi.get(i).getCustomerid());			
			}
			return 1;
		}
		return 0;
	}
	
	
	@RequestMapping("gotoindex")
	public Userinfo gotoIndex(Model model,HttpSession session,HttpServletResponse response) {
		//System.out.println(userEntry);
		Userinfo user = (Userinfo) session.getAttribute("UserInfo");
		if(user!=null) {
			Userinfo userEntry = service.UserEntry(user.getPhone());
			session.setAttribute("UserInfo",userEntry);
			return userEntry;
		}
		//System.out.println(userEntry);
		return user;
	} 
	
	
	
	@RequestMapping("usercode")
	public int usercode(Userinfo user){
		int code = service.UserCode(user);
		if(code>0){
			return 1;
		}
		return 0;
	}
	
	@RequestMapping("userenroll")
	public int userenroll(Userinfo user){
		String yonghu = "祁云用户";
		user.setNickname(yonghu+user.getPhone());
		ByteSource bytes = ByteSource.Util.bytes(user.getPhone());
		SimpleHash hash = new SimpleHash("MD5",user.getPassword(),bytes,1234);
		user.setPassword(hash.toString());
		int enroll = service.UserEnroll(user);
		if(enroll>0){
			return 1;
		}
		return 0;
	}
	
	@RequestMapping("logouttt")
	public String logout(HttpServletResponse response,HttpSession session) throws IOException{
		session.removeAttribute("user");
		session.removeAttribute("UserInfo");
		try {
			response.sendRedirect("login.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";

	}
	
	@RequestMapping("getcity")
	public Map getcity() throws Exception{
		WeatherWS ws = new WeatherWS();
		WeatherWSSoap soap = ws.getWeatherWSSoap();
		ArrayOfString weather = soap.getWeather("长沙", null);
		List<String> list = weather.getString();
		Map map = new HashMap<>();
		map.put("test1", list.get(0));
		map.put("test2", list.get(7));
		map.put("test3", list.get(8));
		return map;
	}
	@RequestMapping("forgetPwd2")
	public int forgetPwd2(HttpServletResponse response,HttpServletRequest request,String phone) throws IOException {
		if(!phone.equals("null")) {
			request.getSession().setAttribute("forget", phone);
			return 1;
		}
		return 0;
	}
	
	@RequestMapping("pwd3")
	public String pwd3(HttpServletRequest request) {
		
		return (String) request.getSession().getAttribute("forget");
	}
	
	@RequestMapping("forgetselect")
	public int forgetselect(String phone,String pwd) {
		ByteSource bytes = ByteSource.Util.bytes(phone);
		String hash = new SimpleHash("MD5",pwd,bytes,1234).toString();
		Userinfo entry = service.UserEntry(phone);
		if(entry.getPassword().equals(hash)) {
			return 1;
		}
		return 0;
	}
	
	@RequestMapping("forgetupdate")
	public int forgetupdate(Userinfo user) {
		ByteSource bytes = ByteSource.Util.bytes(user.getPhone());
		String hash = new SimpleHash("MD5",user.getPassword(),bytes,1234).toString();
		user.setPassword(hash);
		int forgetupdate = service.forgetupdate(user);
		return forgetupdate;
	}
	
	//时间间隔(一天)  
    private static final long PERIOD_DAY = 24 * 60 * 60 * 1000;
	public static void main(String[] args){
		 Calendar calendar = Calendar.getInstance();  
	        calendar.set(Calendar.HOUR_OF_DAY, 1); //凌晨1点  
	        calendar.set(Calendar.MINUTE, 0);  
	        calendar.set(Calendar.SECOND, 0);  
	        Date date=calendar.getTime(); //第一次执行定时任务的时间  
	        //如果第一次执行定时任务的时间 小于当前的时间  
	        //此时要在 第一次执行定时任务的时间加一天，以便此任务在下个时间点执行。如果不加一天，任务会立即执行。  
	        if (date.before(new Date())) {  
	            date = addDay(date, 1);  
	        }  
	        Timer timer = new Timer();
	        //安排指定的任务在指定的时间开始进行重复的固定延迟执行。  
	        timer.schedule(new Test(),date,PERIOD_DAY); 
	}
	
	// 增加或减少天数  
    public static Date addDay(Date date, int num) {  
        Calendar startDT = Calendar.getInstance();  
        startDT.setTime(date);  
        startDT.add(Calendar.DAY_OF_MONTH, num);  
        return startDT.getTime();  
    }
	
}
