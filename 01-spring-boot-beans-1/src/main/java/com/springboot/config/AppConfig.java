
package com.springboot.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.beans.Student;

@Configuration
public class AppConfig {

	// Second way to here CommnadLineRunner Inteface Use nad implements

	// here create bean obj of CommandLineRunner to call other bean obj

	@Bean
	public CommandLineRunner commandLineRunner() {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				System.out.println("---------------------------------");
				System.out.println("First AppConfig Call");
				System.out.println("---------------------------------");
				
				studBeanboj1().displaymarks();
				System.out.println("---------------------------------");
				studBeanobj2().displaymarks();
				System.out.println("=================================");
			}
		};
	}

	@Bean
	public Student studBeanboj1() {
		return new Student("Ram", 108, 99.9f);
	}

	@Bean
	public Student studBeanobj2() {
		return new Student("Om", 100, 98.3f);
	}

}
