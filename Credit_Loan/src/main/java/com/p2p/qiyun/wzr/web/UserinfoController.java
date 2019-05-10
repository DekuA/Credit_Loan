package com.p2p.qiyun.wzr.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.wzr.common.cn.com.webxml.ArrayOfString;
import com.p2p.qiyun.wzr.common.cn.com.webxml.WeatherWSSoap;
import com.p2p.qiyun.wzr.common.cn.com.webxml.WeatherWS;
import com.p2p.qiyun.wzr.domain.Userinfo;
import com.p2p.qiyun.wzr.service.UserinfoService;
import com.p2p.qiyun.xsr.domain.customer;
import com.p2p.qiyun.xsr.service.CreditService_xsr;

@RestController
public class UserinfoController {

	@Autowired
	private UserinfoService service;
	@Autowired
	private CreditService_xsr im;
	
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
			session.setAttribute("username", user.getNickname());
			service.charukuhuxinxi(userEntry.getUserid());
			List<customer> kehuxinxi = im.kehuxinxi(userEntry.getUserid());
			for (int i = 1; i < kehuxinxi.size(); i++) {
				im.delecus(kehuxinxi.get(i).getCustomerid());			
			}
			return 1;
		}
		return 0;
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
}
