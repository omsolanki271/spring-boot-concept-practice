# 02-spring-boot-student-beans

## 📌 Project Overview
This project demonstrates **multiple ways to create and use beans in Spring Boot**:
1. Using `@Bean` annotation inside `Application` class.
2. Moving bean definitions into a separate `@Configuration` class (`AppConfig`).
3. Using `@Component` with `CommandLineRunner` to execute logic at startup.

This project is part of a structured Spring Boot learning series.

---

## 📂 Project Structure
```
02-spring-boot-student-beans/
│── pom.xml
│── src/main/java/com/springboot/
│   ├── Application.java
│   ├── beans/
│   │   └── Student.java
│   ├── config/
│   │   └── AppConfig.java
│   └── runner/
│       └── StudentRunner.java
```

---

## ⚙️ Dependencies
Defined in `pom.xml`:
- `spring-boot-starter`
- `spring-boot-starter-test`

Java version: **17**

---

## ▶️ How to Run
Open terminal in project root and run:

```bash
# Clean and build project
mvn clean install

# Run Spring Boot application
mvn spring-boot:run
```

---

## 📜 Code Explanation

### `Application.java`
- Entry point of the Spring Boot application.
- Initially demonstrates bean creation with `@Bean` and `CommandLineRunner` (commented for learning purpose).
- Later, bean definitions are moved to `AppConfig` for cleaner structure.

---

### `Student.java`
- A simple POJO with fields: `name`, `rollno`, `marks`.
- Includes `displaymarks()` method to print student details.

---

### `AppConfig.java`
- Uses `@Configuration` to define beans.
- Creates two `Student` beans (`studBeanboj1`, `studBeanobj2`).
- Defines a `CommandLineRunner` bean to execute logic at startup and call student beans.

---

### `StudentRunner.java`
- Uses `@Component` to implement `CommandLineRunner`.
- Creates `Student` objects directly inside `run()` method.
- Demonstrates another way to execute logic at startup without explicit bean definitions.

---

## 🖥️ Output
When you run the application, you will see:

```bash
---------------------------------
First AppConfig Call
---------------------------------
Name :Ram
Roll No :108
Marks :99.9
---------------------------------
Name :Om
Roll No :100
Marks :98.3
=================================
---------------------------------
Second @Component Call
---------------------------------
Name :Ram
Roll No :108
Marks :99.2
---------------------------------
Name :Om
Roll No :100
Marks :93.1
*********************************
```
