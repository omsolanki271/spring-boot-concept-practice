package com.springboot.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.main.entities.Student;
import com.springboot.main.services.StudentService;
import com.springboot.main.services.StudentServiceImp;

@SpringBootApplication()
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		StudentService beanservice = context.getBean(StudentServiceImp.class);

		Scanner sc = new Scanner(System.in);

		int choice;

		do {
			System.out.println("\n===== MENU =====");
			System.out.println("1. Test Service");
			System.out.println("2. Insert Student");
			System.out.println("3. Get All Students");
			System.out.println("4. Get One Student");
			System.out.println("5. Update Student Marks");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				/* test Perpose */
				
				beanservice.test();
				break;

			case 2:

				/* Insert operation */
				
				Student std = new Student();

				System.out.print("Enter Name: ");
				sc.nextLine(); // clear buffer
				std.setName(sc.nextLine());

				System.out.print("Enter Roll No: ");
				std.setRollno(sc.nextInt());

				System.out.print("Enter Marks: ");
				std.setMarks(sc.nextInt());

				boolean statusDetails = beanservice.addStudentDetails(std);

				if (statusDetails) {
					System.out.println("Inserted successfully.....!");
				} else {
					System.out.println("Not inserted...");
				}
				break;

			case 3:
				/* select operation */
				
				List<Student> details = beanservice.getStudentDetails();

				for (Student mydata : details) {
					System.out.println("------------------------");
					System.out.println(mydata.getId());
					System.out.println(mydata.getName());
					System.out.println(mydata.getRollno());
					System.out.println(mydata.getMarks());
					System.out.println("------------------------");
				}
				break;

			case 4:
				/* get select operation 2 */
				System.out.print("Enter Student ID: ");
				Long id = sc.nextLong();

				Student oneStudent = beanservice.getOneStudent(id);

				if (oneStudent != null) {
					System.out.println("-------------------------");
					System.out.println(oneStudent.getId());
					System.out.println(oneStudent.getName());
					System.out.println(oneStudent.getRollno());
					System.out.println(oneStudent.getMarks());
					System.out.println("-------------------------");
				} else {
					System.out.println("Not found.....");
				}
				break;

			case 5:
				/* update operation */
				System.out.print("Enter Student ID: ");
				Long updateId = sc.nextLong();

				System.out.print("Enter New Marks: ");
				int marks = sc.nextInt();

				boolean updatestudent = beanservice.updatestudent(updateId, marks);

				if (updatestudent) {
					System.out.println("Student Detail Updated...!");
				} else {
					System.out.println("Not update.....");
				}
				break;

			case 0:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 0);

		sc.close();

	}
}
