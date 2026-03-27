# 01-spring-boot-beans

## 📌 Project Overview
This is a simple **Spring Boot Beans Learning Project** demonstrating:
- How to define beans using `@Bean` annotation.
- How to use `CommandLineRunner` to execute code after application startup.
- Basic dependency injection in Spring Boot.

---

## 📂 Project Structure
```
01-spring-boot-beans/
│── pom.xml
│── src/main/java/com/springboot/
│   ├── Application.java
│   └── MyClass.java
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
```java
@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        myclasobj().printMsg("Solanki om");
    }

    @Bean
    public MyClass myclasobj() {
        return new MyClass();
    }
}
```

- `@SpringBootApplication` → Marks this as a Spring Boot app.
- Implements `CommandLineRunner` → Executes logic after startup.
- Defines a bean `myclasobj()` → Returns `MyClass` instance.

---

### `MyClass.java`
```java
package com.springboot;

public class MyClass {
    public void printMsg(String name) {
        System.out.println("Hello :" + name);
    }
}
```

- Simple class with `printMsg()` method.
- Prints a greeting message.

---

## 🖥️ Output
When you run the application:

```bash
Hello :Solanki om
```
