package com.springboot.main.services;

import java.util.List;

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
	

	@Override
	public boolean addStudentDetails(Student std) {
		boolean status = false;
		
		try {
			repository.save(std);
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
			status = false;
		}
		
		return status;
	}


	@Override
	public List<Student> getStudentDetails() {
		return repository.findAll();
	}




}
