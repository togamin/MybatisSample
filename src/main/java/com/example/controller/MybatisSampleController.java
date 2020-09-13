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
	
//	@Autowired
//	UsersService userService;
	
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
//		try {
//			userService.insertUser(entity);
//			response.setResultMessage("DB書き込み成功");
//		}catch(Exception ex) {
//			System.out.println(ex);
//			response.setResultMessage("DB書き込み失敗");
//		}
		
		//リクエスト
		response.setId(id);
		response.setName(request.getName());
		response.setEmail(request.getEmail());
		
		return response;
	}
}
