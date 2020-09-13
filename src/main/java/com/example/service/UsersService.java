package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.UsersMapper;
import com.example.mapper.entity.UsersTableEntity;

//@Service
public class UsersService {
	
//	@Autowired
	private UsersMapper usersMapper;
	
	public void insertUser(UsersTableEntity entity) {
		usersMapper.insertUser(entity);
	}

}
