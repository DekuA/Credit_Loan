package com.p2p.qiyun.hjh.controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;

import org.apache.shiro.authc.SimpleAuthenticationInfo;


import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;

import org.apache.shiro.realm.AuthorizingRealm;

import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;


public class ShiroRealm extends AuthorizingRealm {
	/* 用户验证 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pr) {
		// TODO Auto-generated method stub
		Object primaryPrincipal = pr.getPrimaryPrincipal();
		Set<String> roles=new HashSet<String>(); 
		roles.add("x");
		if(primaryPrincipal.equals("x")){
			
			roles.add("y");
		}
		SimpleAuthorizationInfo in=new SimpleAuthorizationInfo(roles);
		return in;
	}

	/* 用户授权 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken a)  {
		// TODO Auto-generated method stub
	
		String principal = (String) a.getPrincipal();
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql:///com","root","123456");
			String sql="select *from users where username=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setObject(1, principal);
			ResultSet executeQuery = ps.executeQuery();
		
		while(	executeQuery.next()){
			ByteSource bytes = ByteSource.Util.bytes(executeQuery.getString(2));
			SimpleHash simpleHash = new SimpleHash("MD5", executeQuery.getString(3),bytes,666);
			
			AuthenticationInfo au=new SimpleAuthenticationInfo(executeQuery.getString(2), simpleHash.toString(), bytes, getName());
			
			return au;
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	
	}
	/*
	 * @Test public void t(){
	 * 
	 * ByteSource bytes = ByteSource.Util.bytes("李大爷"); System.out.println(new
	 * SimpleHash("MD5", "1234",bytes,666));
	 * 
	 * }
	 */
}
