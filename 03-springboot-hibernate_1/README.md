# Spring Boot + Hibernate CRUD

## 📌 Overview
A **Spring Boot + Hibernate CRUD Application** using MySQL.  
Demonstrates basic **CRUD operations** (Insert, Select, Update, Delete) with Hibernate ORM inside a Spring Boot project.

---

## 🎯 Features
- Insert new user record  
- Select user by ID  
- Update existing user data  
- Delete user record  
- Menu-driven console application  

---

## 🛠 Tech Stack
- Java 17  
- Spring Boot  
- Hibernate ORM  
- MySQL  
- Maven  

---

## 📂 Project Structure
```
src/main/java/com/springboot
│
├── main/Application.java        # Main class with @SpringBootApplication and CRUD menu
│
├── entities/User.java           # Entity class with JPA annotations
│
src/main/resources
└── com/springboot/config/hibernate.cfg.xml   # Hibernate configuration
```

---

## ⚙️ Maven Dependencies
- `spring-boot-starter`  
- `hibernate-core` (5.6.15.Final)  
- `mysql-connector-java` (8.0.33)  
- `jaxb-api`, `jaxb-core`, `jaxb-impl`  

---

## ⚙️ Hibernate Configuration (`hibernate.cfg.xml`)
```xml
<property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>
<property name="connection.url">jdbc:mysql://localhost:3307/hibernate_db</property>
<property name="connection.username">root</property>
<property name="connection.password">abc123</property>

<property name="dialect">org.hibernate.dialect.MySQL8Dialect</property>
<property name="show_sql">true</property>
<property name="format_sql">true</property>
<property name="hbm2ddl.auto">update</property>

<mapping class="com.springboot.entities.User"/>
```

---

## 🔖 Annotations Used
- `@SpringBootApplication` → Marks main class, enables auto-configuration  
- `@Entity` → Marks User class as Hibernate entity  
- `@Table` → Maps entity to database table  
- `@Id` → Primary key field  
- `@GeneratedValue(strategy = GenerationType.IDENTITY)` → Auto-increment ID  
- `@Column` → Maps fields to table columns  

---

## 📖 CRUD Methods Used
- `session.save(user)` → Insert  
- `session.get(User.class, id)` → Select  
- `session.saveOrUpdate(user)` → Update  
- `session.delete(user)` → Delete  
- `transaction.commit()` / `transaction.rollback()` → Transaction handling  

---

## 🗄 Database Setup
```sql
CREATE DATABASE hibernate_db;

CREATE TABLE user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100),
    gender VARCHAR(50),
    city VARCHAR(100)
);
```

---

## ▶️ How to Run
1. Clone the repository  
2. Create database and table in MySQL  
3. Update `hibernate.cfg.xml` with your credentials  
4. Run `Application.java` as Spring Boot App  
5. Choose CRUD operation from console menu  

---

## 🎯 Key Concepts
- Integrating Hibernate ORM with Spring Boot  
- Using JPA annotations for entity mapping  
- Managing transactions with Hibernate  
- Performing CRUD operations via Hibernate Session  

---

## 👨‍💻 Author
**Om Solanki**  
*MCA Student | Java Backend Learner*
