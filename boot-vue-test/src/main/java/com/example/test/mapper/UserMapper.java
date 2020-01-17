package com.example.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.test.model.User;

@Mapper
public interface UserMapper {
	List<User> getuserlist();
	User getuser(String userId);
}
