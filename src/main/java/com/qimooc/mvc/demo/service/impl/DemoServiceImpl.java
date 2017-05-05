package com.qimooc.mvc.demo.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qimooc.common.model.PageList;
import com.qimooc.mvc.base.model.User;
import com.qimooc.mvc.demo.dao.UserDemoMapper;
import com.qimooc.mvc.demo.service.DemoService;

@Service("userDemoService")
public class DemoServiceImpl implements DemoService {
	@Resource
	private UserDemoMapper userDemoMapper;

	@Override
	public PageList selectDemoByPage(PageList pageList, String orderByClause, User user) throws Exception {

		HashMap<String, Object> hm = new HashMap<String, Object>();
		hm.put("pageList", pageList);

		if (null != orderByClause && "".equals(orderByClause)) {
			hm.put("orderByClause", orderByClause);
		}

		if (null!=user) {
			hm.put("user", user);
		}

		if (pageList.isRequireTotalCount()) {
			pageList.setTotalCount(userDemoMapper.selectDemoByPageTotalRecords(hm));
		}

		List<User> list = userDemoMapper.selectDemoByPage(hm);
		pageList.setList(list);

		return pageList;
	}
	
}
