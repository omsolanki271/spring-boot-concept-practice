package com.springboot.services;

import java.util.List;
import java.util.Optional;

import com.springboot.entities.User;

public interface UserService {
	
	public User createUser(User user);
	public List<User> getAllUserDetails();
	public Optional<User> getsingleUser(int id);
	
	public User updateUserDetail(int id,User user);
}
