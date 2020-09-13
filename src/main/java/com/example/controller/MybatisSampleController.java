package com.example.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ResultResponse;
import com.example.dto.UserInfoRequest;

@RestController
public class MybatisSampleController {
	
	@RequestMapping(value="/post")
	public ResultResponse registUserInfo(@RequestBody UserInfoRequest request) {
		
		ResultResponse response = new ResultResponse();
		response.setName(request.getName());
		response.setEmail(request.getEmail());
		
		return response;
	}
}
