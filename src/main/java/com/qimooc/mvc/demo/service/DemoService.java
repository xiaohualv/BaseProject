package com.qimooc.mvc.demo.service;

import com.qimooc.common.model.PageList;
import com.qimooc.mvc.base.model.User;

public interface DemoService {
	
	public PageList selectDemoByPage(PageList pageList, String orderbyClause, User user) throws Exception;
	
}
