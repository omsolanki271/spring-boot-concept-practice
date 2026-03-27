package com.springboot.dao;

import com.springboot.entity.User;

public interface UserDao {
	public boolean insert(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(User user);
}
