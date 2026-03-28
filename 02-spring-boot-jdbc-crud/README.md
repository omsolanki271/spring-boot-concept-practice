# Spring Boot JDBC CRUD

## 📌 Overview
A **Spring Boot JDBC CRUD Application** using **JdbcTemplate** with MySQL.  
Demonstrates basic **CRUD operations** without JPA/Hibernate.

---

## 🎯 Features
- Insert, Update, Delete (two ways), Select One, Select All  
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
├── Application.java        # Main class with menu-driven console
├── entity/User.java        # Entity class
├── dao/UserDao.java        # DAO interface
├── dao/UserDaoImpl.java    # DAO implementation
├── dao/RowMapperImp.java   # Custom RowMapper
└── resources/application.properties
```

---

## ⚙️ application.properties
```properties
spring.application.name=02-spring-boot-jdbc-crud
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

## 🔖 Annotations Used
- `@SpringBootApplication` → Marks main class, enables auto-configuration  
- `@Autowired` → Injects `UserDao` and `JdbcTemplate`  
- `@Repository` → Marks DAO implementation class  
- `@Override` → Used for implementing interface methods  

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
