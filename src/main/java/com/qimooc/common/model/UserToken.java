package com.qimooc.common.model;

import java.io.Serializable;

public class UserToken implements Serializable {

	private static final long serialVersionUID = 1L;

	private int user_id = 0;

	private String user_name;

	private String real_name;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

}