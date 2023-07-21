package com.mahi.demo.service;

import java.util.List;

import com.mahi.demo.entity.User;

public interface UserService {

	public User saveUser(User user);
	
	public List<User>  getUsers();
}
