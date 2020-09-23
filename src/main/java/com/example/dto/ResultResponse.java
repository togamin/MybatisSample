package com.example.dto;

public class ResultResponse {
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
	
	/**
	 * 結果に関するメッセージ
	 */
	private String resultMessage;
	
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

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	

}
