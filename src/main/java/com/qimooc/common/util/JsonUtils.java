package com.qimooc.common.util;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtils {

	// private static Gson gson = new Gson();

	private static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

	// private static Gson gson = new GsonBuilder().registerTypeAdapter(
	// java.util.Date.class, new
	// UtilDateSerializer()).setDateFormat(DateFormat.LONG)
	// .create();

	/**
	 * 将对象序列化为JSON字符串
	 * 
	 * @param object
	 * @return JSON字符串
	 */
	public static String toJson(Object src) {
		return gson.toJson(src);
	}

	/**
	 * 将JSON字符串反序列化为对象
	 * 
	 * @param JSON字符串
	 * @param classOfT
	 * @return objectT
	 * 
	 * String userJson = "{ \"user_id\": 110, \"user_name\": \"zhangwy105\"}";
	 * User user = JsonUtils.fromJson(userJson, User.class);
	 */
	public static <T> T fromJson(String json, Class<T> classOfT) {
		return gson.fromJson(json, classOfT);
	}

	/**
	 * 将JSON字符串反序列化为对象
	 * 
	 * @param JSON字符串
	 * @param typeOfT
	 * @return objectT
	 * 
	 * 使用示例：
	 * 
	 * String userList = "[{ \"user_id\": 110, \"user_name\": \"zhangwy105\"},{ \"user_id\": 111, \"user_name\": \"zhangwy106\"}]";
	 * List<User> list = JsonUtils.fromJson(userList, new TypeToken<List<User>>(){}.getType());
	 */
	public static <T> T fromJson(String json, Type typeOfT) {
		return gson.fromJson(json, typeOfT);
	}
	
}