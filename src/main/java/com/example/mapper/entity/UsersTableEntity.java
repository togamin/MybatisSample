package com.example.mapper.entity;

public class UsersTableEntity {
	/**
	 * key
	 */
	private String id;
	
	/**
	 * ユーザー名
	 */
	private String name;
	
	/**
	 * メールアドレス
	 */
	private String email;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
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
