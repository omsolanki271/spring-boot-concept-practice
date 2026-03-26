package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.springboot.beans.Student;

@SpringBootApplication
public class Application{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
	//try to first learn this after move AppConfig file. 
	//here extra code remove and pass in AppConfig file.
	
	/*
	 * @Override public void run(String... args) throws Exception { //call using
	 * bean object
	 * 
	 * stdBeanobj1().displaymarks(); System.out.println("--------------");
	 * stdBeanobj2().displaymarks(); }
	 */
	
	
	//create two bean object 

	/*
	 * @Bean public Student stdBeanobj1() { return new Student("Ram",108, 98.5f); }
	 * 
	 * @Bean public Student stdBeanobj2() { return new Student("Om",100, 95.5f); }
	 */
	
	
}
