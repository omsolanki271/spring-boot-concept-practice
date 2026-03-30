# Spring Data JPA CRUD Project

This project  developed using **Spring Boot**, **Spring Data JPA**, and **MySQL**.

It was built as a hands-on practice project to understand how backend applications are structured in Java using the **Service Layer**, **Repository Layer**, and **Entity mapping** approach.

---

## 📌 Project Purpose

The purpose of this project is to practically learn:

- How Spring Boot starts and manages beans
- How `@Entity`, `@Service`, and `JpaRepository` work
- How to connect Spring Boot with MySQL
- How to perform CRUD operations using JPA
- How to structure a basic backend application properly

This project also helped me understand common beginner-level issues such as:

- datasource configuration errors
- bean creation errors
- package scanning problems
- service and repository integration

---

## 🚀 Features

This project currently supports the following operations:

- ✅ Test Service
- ✅ Insert Student Record
- ✅ Fetch All Students
- ✅ Fetch One Student by ID
- ✅ Update Student Marks

---

## 🧠 Learning Concepts Covered

This project helped me learn and practice:

- Spring Boot project setup
- Package structure in Spring Boot
- `@SpringBootApplication`
- `@Entity`
- `@Id`
- `@GeneratedValue`
- `JpaRepository`
- `@Service`
- `@Autowired`
- Service Layer architecture
- Repository Layer architecture
- CRUD operations using Spring Data JPA
- MySQL database connection
- Scanner input in Java
- Switch-case based menu program
- Bean creation and component scanning
- Common Spring Boot error debugging

---

## 📂 Project Structure

```text
src/main/java
└── com.springboot.main
    ├── Application.java
    ├── entities
    │   └── Student.java
    ├── repository
    │   └── StudentRepository.java
    └── services
        ├── StudentService.java
        └── StudentServiceImp.java
```

---

## 🗃️ Student Table Fields

The `Student` entity contains:

- `id`
- `name`
- `rollno`
- `marks`

---

## ⚙️ Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- STS / Eclipse

---

## 🛠️ Database Configuration

Add the following in `application.properties`:

```properties
spring.application.name=04-spring-data-jpa-crud

spring.datasource.url=jdbc:mysql://localhost:3307/springboot_datajpa_db
spring.datasource.username=root
spring.datasource.password=abc123

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ How to Run the Project

### 1. Clone the repository

```bash
git clone https://github.com/your-username/your-repository-name.git
```

### 2. Open in STS / Eclipse

Import the project as a **Maven Project**

### 3. Create MySQL database

```sql
create database springboot_datajpa_db;
```

### 4. Update database credentials

Edit your `application.properties` file if needed.

### 5. Run the application

Run:

```java
Application.java
```

---

## 📋 Console Menu

When the project runs, you will see:

```text
===== MENU =====
1. Test Service
2. Insert Student
3. Get All Students
4. Get One Student
5. Update Student Marks
0. Exit
```

---

## 📌 Sample Operations

### Insert Student
- Enter Name
- Enter Roll No
- Enter Marks

### Get All Students
- Displays all student records

### Get One Student
- Fetches one student using ID

### Update Student Marks
- Updates marks using student ID

---

## 💡 What I Learned From This Project

While building this project, I learned:

- How Spring Boot automatically scans packages
- Why `@Service` and `@Entity` are important
- How `JpaRepository` works
- How to connect Spring Boot with MySQL
- How to structure a basic backend project
- How to debug common bean and datasource errors

---

## 🔥 Future Improvements

I plan to add:

- Delete operation
- Full update operation
- Validation
- REST API version
- Controller layer
- Postman testing
- Exception handling

---

## 👨‍💻 Author

**Om Solanki**
*MCA Student | Java Backend Learner*

This project is part of my Spring Boot and Java backend learning journey.

---
