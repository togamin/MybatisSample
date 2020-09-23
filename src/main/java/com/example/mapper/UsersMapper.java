package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.mapper.entity.UsersTableEntity;

@Mapper
public interface UsersMapper {
	void insertUser(@Param("user")UsersTableEntity entity);
}



