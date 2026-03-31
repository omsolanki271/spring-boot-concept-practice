package com.springboot.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entities.User;

@RestController
public class MyController {

	@PostMapping("/user")
	public String addUserDetails(@RequestBody User user)
	{
		return "index";
	}
}
