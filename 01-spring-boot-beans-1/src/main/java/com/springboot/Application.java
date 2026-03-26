package com.springboot;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springboot.beans.Student;

@SpringBootApplication
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		stdBeanobj1().displaymarks();
		System.out.println("--------------");
		stdBeanobj2().displaymarks();
	}
	
	@Bean
	public Student stdBeanobj1()
	{
		return new Student("Ram",108, 98.5f);
	}
	
	public Student stdBeanobj2()
	{
		return new Student("Om",100, 95.5f);
	}
	
	
}
