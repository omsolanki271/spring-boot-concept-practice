package com.springboot.main.services;

import java.util.List;

import com.springboot.main.entities.Student;

public interface StudentService {

	void test();
	public boolean addStudentDetails(Student std);
	public List<Student> getStudentDetails();
	public Student getOneStudent(long stdid);
	
}
