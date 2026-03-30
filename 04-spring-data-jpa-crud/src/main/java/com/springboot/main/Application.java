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
		}

}
