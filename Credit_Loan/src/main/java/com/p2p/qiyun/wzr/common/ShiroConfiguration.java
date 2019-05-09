package com.p2p.qiyun.wzr.common;

import java.util.LinkedHashMap;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.apache.shiro.mgt.SecurityManager;
@Configuration
public class ShiroConfiguration {
	/**
     * 密码校验规则HashedCredentialsMatcher
     * 这个类是为了对密码进行编码的 ,
     * 防止密码在数据库里明码保存 , 当然在登陆认证的时候 ,
     * 这个类也负责对form里输入的密码进行编码
     * 处理认证匹配处理器：如果自定义需要实现继承HashedCredentialsMatcher
     */
    @Bean("hashedCredentialsMatcher")
    public HashedCredentialsMatcher hashedCredentialsMatcher() {
        HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
        //指定加密方式为MD5
        credentialsMatcher.setHashAlgorithmName("MD5");
        //加密次数
        credentialsMatcher.setHashIterations(1234);
        credentialsMatcher.setStoredCredentialsHexEncoded(true);
        return credentialsMatcher;
    }
    
    @Bean("authRealm")
    @DependsOn("lifecycleBeanPostProcessor")//可选
    public AuthRealm authRealm(@Qualifier("hashedCredentialsMatcher") HashedCredentialsMatcher matcher) {
        AuthRealm authRealm = new AuthRealm();
        authRealm.setAuthorizationCachingEnabled(false);
        authRealm.setCredentialsMatcher(matcher);
        return authRealm;
    }


    /**
     * 定义安全管理器securityManager,注入自定义的realm
     * @param authRealm
     * @return
     */
    @Bean("securityManager")
    public SecurityManager securityManager(@Qualifier("authRealm") AuthRealm authRealm) {
        DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
        manager.setRealm(authRealm);
        return manager;
    }


    /**
     * 定义shiroFilter过滤器并注入securityManager
     * @param manager
     * @return
     */
    @Bean("shiroFilter")
    public ShiroFilterFactoryBean shiroFilter(@Qualifier("securityManager")SecurityManager manager) {
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        //设置securityManager
        bean.setSecurityManager(manager);
        //设置未授权跳转的页面
        bean.setUnauthorizedUrl("404.html");
        //定义过滤器
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("/lg.html", "anon");
		//放行login.html页面
        map.put("/findpwd", "anon");
        map.put("/shouye.html", "anon");
        map.put("/login.html", "anon");
        map.put("/loanone.html", "anon");
        map.put("/loanfalv.html", "anon");
        map.put("/userentry","anon");
        map.put("/loginout","logout");
        map.put("/logouttt", "anon");
        map.put("/usercode", "anon");
        map.put("/userenroll", "anon");

        
        //xsr的请求
        map.put("/zhanghu_xsr", "anon");
        map.put("/shimingname_xsr", "anon");
        map.put("/bangyou_xsr", "anon");
        map.put("/xiumima_xsr", "anon");
        map.put("/chayin_xsr", "anon");
        map.put("/bangyin_xsr", "anon");
        map.put("/panduan_xsr", "anon");
        map.put("/shuaping_xsr", "anon");
        map.put("/panlogin_xsr","anon");
        map.put("/panlogin_xsr","anon");
        map.put("/xiaoxi_xsr","anon");
		map.put("/chajie_xsr","anon");

		//修改调整的登录页面
        bean.setLoginUrl("/lg.html");
		
        map.put("/login", "anon");
        //需要登录访问的资源 , 一般将/**放在最下边
        map.put("/*", "authc");
        bean.setFilterChainDefinitionMap(map);
        return bean;
    }
    /**
     * Spring的一个bean , 由Advisor决定对哪些类的方法进行AOP代理 .
     * @return
     */
    @Bean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator creator = new DefaultAdvisorAutoProxyCreator();
        creator.setProxyTargetClass(true);
        return creator;
    }

    /**
     * 配置shiro跟spring的关联
     * @param securityManager
     * @return
     */
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(@Qualifier("securityManager") SecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager);
        return advisor;
    }

    /**
     * lifecycleBeanPostProcessor是负责生命周期的 , 初始化和销毁的类
     * (可选)
     */
    @Bean("lifecycleBeanPostProcessor")
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }
}
