package com.springboot;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.dao.UserDao;
import com.springboot.entity.User;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private UserDao dao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("\n*************************");
			System.out.println("=====--|| MENU ||---=====");
			System.out.println("*************************");
			System.out.println("Select CRUD Operation");
			System.out.println("1. Insert");
			System.out.println("2. Update");
			System.out.println("3. Delete (User Object by Email)");
			System.out.println("4. Delete (By Email)");
			System.out.println("5. Get One User (RowMapper Class)");
			System.out.println("6. Get One User (Anonymous RowMapper)");
			System.out.println("7. Get All User ");
			System.out.println("8. Exit");
			System.out.println("*************************");
			System.out.print("Enter your choice: ");
			int op = sc.nextInt();
			sc.nextLine();
			
			User user;
			boolean status;
			
			switch (op) {
			case 1:

				/* static data input*/ 
				// User user = new User("Solanki Om", "om@gmail.com", "M", "Bhanvad");

				//user = new User("John", "j@gmail.com", "M", "Jmc");
				
				/* dynamic input */
				
				user = new User();

				//set value using setter injection 
				System.out.println("Enter Your name");
				user.setName(sc.nextLine());
				System.out.println("Enter Your email");
				user.setEmail(sc.nextLine()); 
				System.out.println("Enter Your gender");
				user.setGender(sc.nextLine());
				System.out.println("Enter Your city");
				user.setCity(sc.nextLine());
				
				status = dao.insert(user);

				if (status) {
					System.out.println("Data inserted Successfully....!");
				} else {
					System.out.println("Data not inserted ...!");
				}
				break;

			case 2:

				user = new User();
				
				System.out.println("Update data Base on email");
				user.setEmail(sc.nextLine()); 
				
				System.out.println("Enter Your name");
				user.setName(sc.nextLine());
				System.out.println("Enter Your gender");
				user.setGender(sc.nextLine());
				System.out.println("Enter Your city");
				user.setCity(sc.nextLine());
				
				status = dao.updateUser(user);

				if (status) {
					System.out.println("Data update Successfully....!");
				} else {
					System.out.println("Data not update ...!");
				}
				break;

			case 3:
				// First way to 
				// Delete using User object

				user = new User();
				
				System.out.println("Delete data Base on email");
				user.setEmail(sc.nextLine());
				
				status = dao.deleteUser(user);

				if (status) {
					System.out.println("Data delete Successfully....!");
				} else {
					System.out.println("Data not d ...!");
				}
				break;
			case 4:
				// Second way to 
				// Delete using email directly
				
				System.out.println("Enter Email to deleted..!");
				String email = sc.nextLine();
				status = dao.deleteUser2(email);
				if (status) {
					System.out.println("Data delete using Email.....!");
				} else {
					System.out.println("data not deleted .....!");
				}
				break;
			case 5:
				System.out.print("Enter Email to Search: ");
				String email1 = sc.nextLine();
				user = dao.getOneUser(email1);
				if(user != null)
				{
					System.out.println("----------------------");
					/*
					 * System.out.println(user.getName()); System.out.println(user.getEmail());
					 * System.out.println(user.getGender()); System.out.println(user.getCity());
					 */
					printUser(user);
					System.out.println("----------------------");
				}
				else
				{
					System.out.println("Please Enter valid Email");
				}
				break;
			case 6:
				System.out.print("Enter Email to Search: ");
				String email2 = sc.nextLine();
				user = dao.getOneUser1(email2);
				if(user != null)
				{
					System.out.println("----------------------");
					/*
					 * System.out.println(user.getName()); System.out.println(user.getEmail());
					 * System.out.println(user.getGender()); System.out.println(user.getCity());
					 */
					printUser(user);
					System.out.println("----------------------");
				}
				else
				{
					System.out.println("Please Enter valid Email");
				}
				break;
			case 7:
				List<User> allUser = dao.getAllUser();
				if(allUser.isEmpty())
				{
					System.out.println("No studernt found..!");
				}
				else
				{
					for(User u : allUser)
					{
						 
						printUser(u);
						// if we use this type we need to toString method in User Class
						System.out.println(u);
					}	
				}
				
				break;
			case 8:
				System.out.println("Application exited successfully...");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice! Please enter 1 to 5.");
			}

		}
	}
	
	private void printUser(User user) {
		System.out.println("----------------------");
		System.out.println("Name   : " + user.getName());
		System.out.println("Email  : " + user.getEmail());
		System.out.println("Gender : " + user.getGender());
		System.out.println("City   : " + user.getCity());
		System.out.println("----------------------");
	}
}
