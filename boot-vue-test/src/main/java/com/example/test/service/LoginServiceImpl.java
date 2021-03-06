package com.example.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.mapper.UserMapper;
import com.example.test.model.User;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserMapper usermapper;

	@Override
	public List<User> getuserlist() {
		// TODO Auto-generated method stub
		return usermapper.getuserlist();
	}

	@Override
	public User getuser(String userId) {
		// TODO Auto-generated method stub
		return usermapper.getuser(userId);
	}

	@Override
	public void joinuser(User user) {
		// TODO Auto-generated method stub
		usermapper.joinuser(user);
	}

}
