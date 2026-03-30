package com.springboot.main.services;

import java.util.List;
import java.util.Optional;

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


	@Override
	public Student getOneStudent(long stdid) {
		Optional<Student> optional = repository.findById(stdid);
		if(optional.isPresent())
		{
			return optional.get();
		}
		else
		{
			return null;
		}
	}


	@Override
	public boolean updatestudent(long id, int marks) {
		boolean status = false;
		Student student = getOneStudent(id);
		if(student != null)
		{
			student.setMarks(marks);
			repository.save(student);
			status = true;
		}
		return status;
	}


}
