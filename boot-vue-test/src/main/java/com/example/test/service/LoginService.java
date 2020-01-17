package com.example.test.service;

import java.util.List;

import com.example.test.model.User;

public interface LoginService {
	
	List<User> getuserlist();
	User getuser(String userId);
	void joinuser(User user);
}
