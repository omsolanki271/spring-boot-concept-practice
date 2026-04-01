# spring-boot-concept-practice

A structured **Spring Boot learning and practice repository** covering important backend concepts step by step with simple examples and practice hand-on projects.

This repository is created to practice, organize, and revise **Spring Boot + Java backend development** concepts in a practical way.

Each module is implemented as a separate project with its own code and README for better understanding and revision.

---

## 📌 Concepts Covered

- Spring Boot Basics  
- Beans  
- `@Bean`  
- `@Component`  
- `@Configuration`  
- `CommandLineRunner`  
- Dependency Injection  
- JDBC  
- Hibernate  
- Spring Boot + Hibernate  
- JPA  
- Spring Data JPA  
- RESTful Web Services  
- CRUD Operations  
- Repository Layer  
- Service Layer  
- MySQL Integration  

---

## 📂 Repository Structure

```text
spring-boot-concept-practice/
│── 01-spring-boot-beans/
│── 01-spring-boot-beans-1/
│── 02-spring-boot-jdbc-crud/
│── 03-hibernate-crud/
│── 03-springboot-hibernate_1/
│── 03-springboot-hibernate_2/
│── 04-spring-data-jpa-crud/
│── 05-spring-boot-Restfull-webservices/
│── .gitignore
│── README.md
```

---

## 📚 Practice Modules

### `01-spring-boot-beans`
Basic Spring Boot bean creation project.

**Concepts:**
- `@Bean`
- `CommandLineRunner`
- Basic bean usage

---

### `01-spring-boot-beans-1`
Bean practice project with multiple bean creation approaches.

**Concepts:**
- `@Bean`
- `@Configuration`
- `@Component`
- Multiple bean objects

---

### `02-spring-boot-jdbc-crud`
CRUD project using **Spring Boot + JDBC + MySQL**.

**Concepts:**
- `JdbcTemplate`
- DAO Layer
- RowMapper
- Console CRUD

---

### `03-hibernate-crud`
Basic **Hibernate ORM CRUD** project.

**Concepts:**
- Hibernate setup
- `hibernate.cfg.xml`
- `SessionFactory`
- CRUD operations

---

### `03-springboot-hibernate_1`
CRUD project using **Spring Boot + Hibernate**.

**Concepts:**
- Spring Boot + Hibernate integration
- Entity mapping
- MySQL CRUD

---

### `03-springboot-hibernate_2`
Structured **Select Operation** project using Spring Boot + Hibernate.

**Concepts:**
- Config class
- Repository Layer
- `@Repository`
- Clean Hibernate structure

---

### `04-spring-data-jpa-crud`
CRUD project using **Spring Boot + Spring Data JPA + MySQL**.

**Concepts:**
- `@Entity`
- `JpaRepository`
- `@Service`
- Repository + Service Layer
- CRUD operations

---

### `05-spring-boot-restful-webservices`
REST API learning project using **Spring Boot Web**.

**Concepts:**
- `@RestController`
- `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`
- `@RequestBody`
- `@PathVariable`
- `ResponseEntity`
- CRUD APIs

---

## 🛠️ Tech Stack

- Java 17  
- Spring Boot  
- Spring JDBC  
- Hibernate ORM  
- Spring Data JPA  
- MySQL  
- Maven  
- STS / Eclipse  
- Git & GitHub  

---

## ▶️ How to Run

Open terminal inside any project folder and run:

```bash
mvn clean install
mvn spring-boot:run
```

Or run directly from **STS / Eclipse**:

```text
Run As → Spring Boot App
```

---

## 🗄️ Database Note

Some projects require MySQL database setup.

Update credentials in:

- `application.properties`
- `hibernate.cfg.xml`

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3307/your_database_name
spring.datasource.username=root
spring.datasource.password=your_password
```

---

## 🚀 Future Topics

- Validation  
- Exception Handling  
- Authentication  
- Spring Security  
- Postman Testing  
- More REST API Projects  

---

## 👨‍💻 Author

**Om Solanki**  
*MCA Student | Java Backend Learner*