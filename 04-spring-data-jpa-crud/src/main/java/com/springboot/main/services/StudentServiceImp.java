package com.springboot.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.main.entities.Student;
import com.springboot.main.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService{

	@Autowired
	private StudentRepository repository;

	@Override
	public void test() {
		System.out.println("Services working...");
		
	}
	
	



}
