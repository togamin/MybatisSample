package com.example.mapper;

import org.apache.ibatis.annotations.Param;

import com.example.mapper.entity.UsersTableEntity;

public interface UsersMapper {
	void insertUser(@Param("user")UsersTableEntity entity);
}