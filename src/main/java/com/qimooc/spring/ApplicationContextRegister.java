package com.qimooc.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 获取ApplicationContext中的Bean,本类会被spring注册管理
 * 
 * @author zhwy
 * @version 2015-1-13
 * 
 */
public class ApplicationContextRegister implements ApplicationContextAware {

	private static ApplicationContext appContext;

	/**
	 * 当继承了ApplicationContextAware类之后，那么程序在调用 getBean(String)的时候会自动调用该方法，不用自己操作
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		appContext = applicationContext;
	}

	/**
	 * 获取spring管理的BEAN
	 * 
	 * @param paramString
	 *            bean的id(spring配置文件的ID)
	 * @return bean 对象
	 */
	public static Object getBean(String paramString) {
		return appContext.getBean(paramString);
	}

	/**
	 * 从静态变量applicationContext中取得Bean, 自动转型为所赋值对象的类型.
	 */
	public static <T> T getBean(Class<T> requiredType) {
		return appContext.getBean(requiredType);
	}

}
