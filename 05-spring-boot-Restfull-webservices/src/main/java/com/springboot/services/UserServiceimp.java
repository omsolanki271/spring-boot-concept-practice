package com.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entities.User;
import com.springboot.repository.UserRepository;

@Service
public class UserServiceimp implements UserService{

	@Autowired
	private UserRepository repository;
	
	@Override
	public User createUser(User user) {
		
		return repository.save(user);
	}

}
