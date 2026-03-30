package com.springboot.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.main.entities.Student;
import com.springboot.main.services.StudentService;
import com.springboot.main.services.StudentServiceImp;

@SpringBootApplication()
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		StudentService beanservice = context.getBean(StudentServiceImp.class);
		beanservice.test();

		/* Insert opration */
		
		/*
		 * Student std = new Student(); std.setName("om solanki");
		 * std.setRollno(2530100); std.setMarks(98);
		 * 
		 * boolean statusDetails = beanservice.addStudentDetails(std);
		 * 
		 * if (statusDetails) { System.out.println("Inserted successfully.....!"); }
		 * else { System.out.println("Not inserted..."); }
		 */
		
		
		/* select operation */
		
		List<Student> details = beanservice.getStudentDetails();
		for(Student mydata : details)
		{
			System.out.println("------------------------");
			System.out.println(mydata.getId());
			System.out.println(mydata.getName());
			System.out.println(mydata.getRollno());
			System.out.println(mydata.getMarks());
			System.out.println("------------------------");
		}
		
	}
}
