# Spring Boot + Hibernate (Select Operation)

## 📌 Overview
This project demonstrates how to integrate **Spring Boot with Hibernate ORM** and perform a **Select operation (fetch user data by ID)** from a MySQL database.  

### 🔹 What’s New Compared to Old Hibernate Project
- Added **HibernateConfig class** to centralize `SessionFactory` creation
- Introduced **Repository interface + implementation** (`Dboperation`, `Dboperationimp`)
- Used **Spring Boot annotations** (`@SpringBootApplication`, `@Repository`) for cleaner structure and dependency management

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
├── main/Application.java        # Main class with @SpringBootApplication
│
├── config/HibernetConfig.java   # Hibernate SessionFactory configuration
│
├── entities/User.java           # Entity class with JPA annotations
│
└── repository
    ├── Dboperation.java         # Repository interface
    └── Dboperationimp.java      # Repository implementation with @Repository
│
src/main/resources/com/springboot/resource/hibernate.cfg.xml   # Hibernate configuration
pom.xml
```

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
- `@SpringBootApplication(scanBasePackages = "com.springboot")` → Marks main class, enables auto-configuration  
- `@Entity` → Marks User class as Hibernate entity  
- `@Table` → Maps entity to database table  
- `@Id` → Primary key field  
- `@GeneratedValue(strategy = GenerationType.IDENTITY)` → Auto-increment ID  
- `@Column` → Maps fields to table columns  
- `@Repository` → Marks repository implementation class  

---

## 📖 New Implementation Logic

### HibernateConfig Class
```java
public static SessionFactory getSessionFactory() {
    Configuration configuration = new Configuration();
    configuration.configure("/com/springboot/resource/hibernate.cfg.xml");
    return configuration.buildSessionFactory();
}
```
➡️ Centralizes SessionFactory creation, reusable across the project.

### Repository Implementation
```java
@Repository
public class Dboperationimp implements Dboperation {
    @Override
    public User getUserdetail(long id) {
        User user = null;
        try (Session session = HibernetConfig.getSessionFactory().openSession()) {
            user = session.get(User.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
```
➡️ Moves Hibernate logic out of `main` and into a Spring-managed repository.

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
5. Enter user ID in console to fetch details  

---

## 🎯 Key Concept (New in This Project)
- **HibernateConfig class** → Provides a reusable `SessionFactory`  
- **Repository Layer** → Encapsulates Hibernate logic in `Dboperationimp`, managed by Spring with `@Repository`  
- This makes the project more modular, testable, and closer to real-world Spring Boot + Hibernate applications.

---

## 👨‍💻 Author
**Om Solanki**  
*MCA Student | Java Backend Learner*
