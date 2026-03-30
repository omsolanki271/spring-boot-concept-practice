package com.springboot.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.main.entities.Student;
import com.springboot.main.services.StudentService;
import com.springboot.main.services.StudentServiceImp;

@SpringBootApplication()
public class Application {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(Application.class, args);
		StudentService bean = context.getBean(StudentServiceImp.class);
		bean.test();
		
		Student std = new Student();
		std.setName("om solanki");
		std.setRollno(2530100);
		std.setMarks(98);
		boolean statusDetails = bean.addStudentDetails(std);
		if(statusDetails)
		{
			System.out.println("Inserted successfully.....!");
		}
		else
		{
			System.out.println("Not inserted...");
		}
		}
}
