package com.springboot;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.dao.UserDao;
import com.springboot.entity.User;

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
			
			
			System.out.println("*************************");
			System.out.println("=====--|| Menu ||---=====");
			System.out.println("**************************");
			System.out.println("Selete CRUD opeartion opeation");
			System.out.println(" 1.Insert");
			System.out.println(" 2.Update");
			System.out.println(" 3.Delete way 1 ");
			System.out.println(" 4.Delete Way 2 ");
			System.out.println(" 5.exit ");
			System.out.println("**************************");
			System.out.println("Enter your Choice");
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
				System.out.println("Application exited successfully...");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice! Please enter 1 to 5.");
			}

		}
	}

}
