package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.dao.UserDao;
import com.springboot.entity.User;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private UserDao dao;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User("Solanki Om","om@gmail.com","M","Bhanvad");
		boolean status = dao.insert(user);
		
		if(status)
		{
			System.out.println("Data inserted Successfully....!");
		}
		else
		{
			System.out.println("Data not inserted ...!");
		}
		
	}

}
