package com.springboot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getoneUser(@PathVariable int id)
	{
		//if not fetch data provide null 
		// this is new way
		User user = service.getsingleUser(id).orElse(null);
		if(user != null)
		{
			//if find status 200 ok so give value in user
			return ResponseEntity.ok().body(user);
		}
		else 
		{
			return ResponseEntity.notFound().build();
		}
	}
	
	@PutMapping("/user/{id}")
	public ResponseEntity<User> udateUserData(@PathVariable int id , @RequestBody User user)
	{
		User upuserdata = service.updateUserDetail(id, user);
		if(upuserdata != null)
		{
			return ResponseEntity.ok(upuserdata);
		}
		else
		{
			return ResponseEntity.notFound().build();
		}
	}
}
