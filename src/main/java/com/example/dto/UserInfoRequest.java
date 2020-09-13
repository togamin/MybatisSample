package com.example.dto;

public class UserInfoRequest {
	/**
	 * ユーザー名
	 */
	private String name;
	/**
	 * メールアドレス
	 */
	private String email;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

}
