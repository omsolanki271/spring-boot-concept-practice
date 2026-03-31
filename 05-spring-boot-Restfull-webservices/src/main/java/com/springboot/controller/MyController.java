package com.springboot.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@PostMapping("/user")
	public String addUserDetails()
	{
		return "index";
	}
}
