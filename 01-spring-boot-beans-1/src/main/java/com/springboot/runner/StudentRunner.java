package com.springboot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.beans.Student;

@Component
public class StudentRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		System.out.println("---------------------------------");
		System.out.println("Second @Componet Call");
		System.out.println("---------------------------------");
		
		Student s1 = new Student("Ram", 108, 99.2f);
		Student s2 = new Student("Om", 100, 93.1f);

		s1.displaymarks();
		System.out.println("---------------------------------");
		s2.displaymarks();
		System.out.println("*********************************");
	}
}