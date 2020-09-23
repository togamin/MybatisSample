package com.example.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ResultResponse;
import com.example.dto.UserInfoRequest;
import com.example.mapper.entity.UsersTableEntity;
import com.example.service.UsersService;

@RestController
public class MybatisSampleController {
	
	@Autowired
	UsersService usersService;
	
	/**
	 * ユーザー情報の書き込み
	 * @param request
	 * @return DBへの書き込み結果
	 */
	@RequestMapping(value="/post")
	public ResultResponse registUserInfo(@RequestBody UserInfoRequest request) {
		
		//レスポンス作成
		ResultResponse response = new ResultResponse();
		
		//データベースへの書き込みデータ準備
		String id = UUID.randomUUID().toString();
		UsersTableEntity entity = new UsersTableEntity();
		entity.setId(id);
		entity.setName(request.getName());
		entity.setEmail(request.getEmail());
		
		//データベースへの書き込み処理
		try {
			usersService.insertUser(entity);
			response.setResultMessage("DB書き込み成功");
			response.setId(id);
		}catch(Exception ex) {
			System.out.println(ex);
			response.setResultMessage("DB書き込み失敗");
			response.setId("null");
		}
		
		//リクエスト
		response.setName(request.getName());
		response.setEmail(request.getEmail());
		
		return response;
	}
}
