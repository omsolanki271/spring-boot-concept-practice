package com.springboot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entities.User;
import com.springboot.services.UserService;

@RestController
public class MyController {

	@Autowired
	private UserService service;
	
	@PostMapping("/user")
	public User addUserDetails(@RequestBody User user)
	{
		return service.createUser(user);
	}
	
	@GetMapping("/user")
	public List<User> getAllUsers()
	{
		return service.getAllUserDetails();
	}
}
