package com.qimooc.mvc.demo.dao;

import java.util.List;
import java.util.Map;

import com.qimooc.mvc.base.model.User;

public interface UserDemoMapper {
	
	public List<User> selectDemoByPage(Map<?, ?> m);
	
	public int selectDemoByPageTotalRecords(Map<?, ?> m);
}
