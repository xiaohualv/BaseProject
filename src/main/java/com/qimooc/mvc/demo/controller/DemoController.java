package com.qimooc.mvc.demo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qimooc.common.model.JsonResult;
import com.qimooc.common.model.PageList;
import com.qimooc.common.model.UserToken;
import com.qimooc.mvc.base.model.User;
import com.qimooc.mvc.demo.service.DemoService;

/**
 * DEMO Controller
 * 
 * @author piccy
 *
 */
@Controller
public class DemoController {
	
	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource
	private DemoService demoService;
	
	
	@RequestMapping(value = "/api/demo/user_info")
	@ResponseBody
	public UserToken userInfo(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		UserToken userToken = (UserToken) request.getSession().getAttribute("userToken");
		if (userToken != null) {
			return userToken;
		}
		// 如果没有登录，则返回实例化空的User对象。
		return null;
	}
	
	@RequestMapping(value = "/api/demo/login")
	@ResponseBody
	public JsonResult<Object> login(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		String user_name = request.getParameter("user_name");
		String password = request.getParameter("password");
		
		if ("zhangyong".equals(user_name) && "888888".equals(password)){
			UserToken userToken = new UserToken();
			userToken.setUser_id(1);
			userToken.setUser_name("zhangyong");
			userToken.setReal_name("张勇");
			
			request.getSession().setAttribute("userToken",userToken);
			return new JsonResult<Object>(userToken);
		}
		
		return new JsonResult<Object>(401,"登录失败");
		
	}
	
	@RequestMapping(value = "/api/demo/logout")
	@ResponseBody
	public boolean logout(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		request.getSession().removeAttribute("userToken");
		// 如果没有登录，则返回实例化空的User对象。
		return true;
	}
	
	@RequestMapping(value = "/api/demo/user/list")
	@ResponseBody
	public JsonResult<PageList> list(PageList pageList, String orderByClause, User user) throws Exception {
		pageList = demoService.selectDemoByPage(pageList, orderByClause, user);
		return new JsonResult<PageList>(pageList);
	}
	
}
