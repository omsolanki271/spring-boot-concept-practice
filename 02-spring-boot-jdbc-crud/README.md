# Spring Boot JDBC CRUD

## 📌 Overview
A **Spring Boot JDBC CRUD Application** using **JdbcTemplate** with MySQL.  
Demonstrates basic **CRUD operations** without JPA/Hibernate.

---

## 🎯 Features
- Insert, Update, Delete, Select One, Select All  
- DAO Layer with Interface + Implementation  
- RowMapper (custom + anonymous)  
- Menu-driven console input with dynamic user data  

---

## 🛠 Tech Stack
- Java  
- Spring Boot  
- Spring JDBC  
- MySQL  
- Maven  

---

## 📂 Project Structure
```
src/main/java/com/springboot
│
├── Application.java
├── entity/User.java
├── dao/UserDao.java
├── dao/UserDaoImpl.java
├── dao/RowMapperImp.java
└── resources/application.properties
```

---

## ⚙️ application.properties
```properties
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3307/springboot_jdbc
spring.datasource.username=root
spring.datasource.password=abc123
```
> Update with your local MySQL credentials.

---

## 🗄 Database Setup
```sql
CREATE DATABASE springboot_jdbc;
USE springboot_jdbc;

CREATE TABLE users(
    name VARCHAR(100),
    email VARCHAR(100),
    gender VARCHAR(100),
    city VARCHAR(100)
);
```

---

## ▶️ How to Run
1. Clone the repository  
2. Create database and table in MySQL  
3. Update `application.properties`  
4. Run `Application.java` as Spring Boot App  

---

## 🎯 Key Concepts
- `JdbcTemplate` for SQL queries  
- DAO pattern for separation of logic  
- RowMapper for mapping DB rows to objects  
- Menu-driven console CRUD flow  

---

## 👨‍💻 Author
**Om Solanki**  
*MCA Student | Java Backend Learner*
```
