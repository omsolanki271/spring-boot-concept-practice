package com.springboot.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.config.HibernetConfig;
import com.springboot.entities.User;
import com.springboot.repository.Dboperation;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(Application.class, args);
		Dboperation bean = context.getBean(Dboperation.class);
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter ID to fetch data: ");
		Long selectId = sc.nextLong();

		User user2 = bean.getUserdetail(selectId);
		if (user2 != null) {
				System.out.println(user2.getId());
				System.out.println(user2.getName());
				System.out.println(user2.getCity());
				System.out.println(user2.getGender());
				System.out.println(user2.getEmail());
				System.out.println(user2.getPassword());
		}
		else 
		{
			System.out.println("No Founded...! " + selectId);
		}
		

	}
}
