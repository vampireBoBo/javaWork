package com.lhb.controller;

import javax.servlet.http.HttpServletRequest;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lhb.entity.User;
import com.lhb.util.Result;


/**
 * <p>Titile: 用户类controller</p>
 * <p>Description: 用于用户登录</p>
 * @user Administrator
 * @data 2019年1月28日
 */
@Controller
public class LoginController {
	
	private static final Logger log = LoggerFactory.getLogger(LoginController.class);
	
	/**
	 * 进行用户登录处理
	 * @return
	 */
	@RequestMapping("/login")
	@ResponseBody
	public Result login(String userName,String password){
		UsernamePasswordToken token = new UsernamePasswordToken(userName,password);
		Subject subject = SecurityUtils.getSubject();
		log.error("用户正在执行登录");
		try {
			subject.login(token);
		} catch (UnknownAccountException e) {
			return Result.FAILURE("用户名错误", 405);
		} catch (IncorrectCredentialsException e){
			return Result.FAILURE("密码错误", 405);
		}
		return Result.SUCCESS("/home");
	}
	/**
	 * 封装当前 shiro中用户信息  并跳转到项目home页面
	 * @return  返回视图名称
	 */
	@RequestMapping("/home")
	public String home(HttpServletRequest req){
		log.error("用户校验通过，跳转至home页面并携带对应的权限和角色信息");
		// 集成cas以后 用户的认证由cas-server进行负责 故重写的casRealm中对认证不进行重写  故使用casRealm中的认证方法  则 pricipal中存储的为当前登录用户的登录名 
		/*User user = (User) SecurityUtils.getSubject().getPrincipal();
		req.setAttribute("loginUser", user);*/
		return "home";
	}
}
