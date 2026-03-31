package com.springboot.services;

import java.util.List;

import com.springboot.entities.User;

public interface UserService {
	public User createUser(User user);
	public List<User> getAllUserDetails();
}
