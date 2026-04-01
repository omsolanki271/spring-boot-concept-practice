package com.springboot.services;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<User> getAllUserDetails() {
		
		return repository.findAll();
	}

	@Override
	public Optional<User> getsingleUser(int id) {
		
		return repository.findById(id);
	}

	@Override
	public User updateUserDetail(int id, User updateUser) 
	{
		User orElse = repository.findById(id).orElse(updateUser);
		if(orElse != null)
		{
			return repository.save(updateUser);
		}
		else
		{
			throw new RuntimeException("User not found " + id);
		}

	}

	@Override
	public void deleteUserDetail(int id) {
		 repository.deleteById(id);
		 
	}
}
