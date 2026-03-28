package com.springboot.dao;

import java.util.List;

import com.springboot.entity.User;

public interface UserDao {
	public boolean insert(User user);
	public boolean updateUser(User user);

	//First way to delte Using Class 
	public boolean deleteUser(User user);
	//Second way to delete only pass email
	public boolean deleteUser2(String email);
	
	//select to get one User to get base on Email
	//1
	public User getOneUser(String email);
	//2
	public User getOneUser1(String email);
	
	public List<User> getAllUser();
}
