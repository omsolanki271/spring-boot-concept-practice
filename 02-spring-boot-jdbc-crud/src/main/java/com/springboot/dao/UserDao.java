package com.springboot.dao;

import com.springboot.entity.User;

public interface UserDao {
	public boolean insert(User user);
	public boolean updateUser(User user);
	//First way to delte Using Class 
	public boolean deleteUser(User user);
	//Second way to delete only pass email
	public boolean deleteUser2(String email);
}
