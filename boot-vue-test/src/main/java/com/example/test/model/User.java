package com.example.test.model;

public class User {

	private String userId;
	private String userPwd;
	private String name;
	private String address;
	
	
	public User(String userId, String name, String address, String userPwd) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.name = name;
		this.address = address;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPwd=" + userPwd + ", name=" + name + ", address=" + address + "]";
	}
}