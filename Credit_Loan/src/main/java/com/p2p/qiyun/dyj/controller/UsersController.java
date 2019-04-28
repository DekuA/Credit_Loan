package com.p2p.qiyun.dyj.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.dyj.pojo.Users;
import com.p2p.qiyun.dyj.service.UsersService;

@RestController
public class UsersController {
	@Autowired
	private UsersService us;
	@RequestMapping("findpwd")
	public Users findPwd(String loginname,HttpSession session,HttpServletResponse response) throws IOException{
		Users u = us.findPwd(loginname);
		if(u!=null){
			session.setAttribute("user", u);
		}else{
			session.removeAttribute("user");
			response.sendRedirect("lg.html");
		}
		return u;
	}
	@RequestMapping("getUsername")
	public Users findPwd(HttpSession session) {
		Users u =(Users) session.getAttribute("user");
		return u;
	}
}
