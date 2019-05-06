package com.p2p.qiyun.wzr.common;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.wzr.dao.UserinfoMapper;
import com.p2p.qiyun.wzr.domain.userinfo;

public class AuthRealm extends AuthorizingRealm{

	@Autowired
	private UserinfoMapper Mapper;
	//为用户授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
			
		return null;
	}

	//认证登录
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//token携带了用户信息
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        //获取前端输入的用户名
        String userName  = usernamePasswordToken.getUsername();
        //根据用户名查询数据库中对应的记录
        userinfo user = Mapper.UserEntry(userName);
        //当前realm对象的name
        String realmName = getName();
        //盐值
        ByteSource salt = ByteSource.Util.bytes(user.getPhone());
        //封装用户信息，构建AuthenticationInfo对象并返回
        AuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(),
               salt, realmName);
        return info;
	}

}
