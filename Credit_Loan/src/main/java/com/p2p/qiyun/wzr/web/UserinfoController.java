package com.p2p.qiyun.wzr.web;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.wzr.domain.userinfo;
import com.p2p.qiyun.wzr.service.UserinfoService;

@RestController
public class UserinfoController {

	@Autowired
	private UserinfoService service;
	
	@RequestMapping("userentry")
	public int userentry(userinfo user,HttpSession session){
		 //把前端输入的username和password封装为token
        UsernamePasswordToken token = new UsernamePasswordToken(user.getPhone(),user.getPassword());
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            session.setAttribute("user", user.getPhone());
            service.UserTime(user.getPhone());
            userinfo userEntry = service.UserEntry(user.getPhone());
            session.setAttribute("username", user.getNickname());
            service.charukuhuxinxi(userEntry.getUserid());
            return 1;
        } catch (Exception e) {
           e.printStackTrace();
        }
		return 0;
	}
	
	@RequestMapping("usercode")
	public int usercode(userinfo user){
		int code = service.UserCode(user);
		if(code>0){
			return 1;
		}
		return 0;
	}
	
	@RequestMapping("userenroll")
	public int userenroll(userinfo user){
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
	
	@RequestMapping("logout")
	public int logout(HttpServletResponse response,HttpSession session){
		session.removeAttribute("user");
		return 1;
	}
}
