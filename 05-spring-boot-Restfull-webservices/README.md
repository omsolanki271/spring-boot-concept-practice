# Spring Boot RESTful Web Services

A simple **Spring Boot REST API project** built using **Spring Boot**, **Spring Data JPA**, and **MySQL**.

This project demonstrates how to create a basic **RESTful CRUD API** for managing user data.

---

## 📌 Project Purpose

This project is created to practice and understand:

- REST API development in Spring Boot
- `@RestController`
- `@GetMapping`
- `@PostMapping`
- `@PutMapping`
- `@DeleteMapping`
- `@RequestBody`
- `@PathVariable`
- `ResponseEntity`
- Spring Data JPA integration
- MySQL database connectivity
- CRUD operations using API endpoints

---

## 🚀 Features

This project supports the following operations:

- ✅ Add New User
- ✅ Get All Users
- ✅ Get One User by ID
- ✅ Update User by ID
- ✅ Delete User by ID

---

## 🧠 Concepts Covered

This project helped in learning and practicing:

- RESTful Web Services
- API endpoint creation
- HTTP methods
- Controller Layer
- Service Layer
- Repository Layer
- Entity Mapping
- Request and Response handling
- `ResponseEntity`
- Optional handling using `orElse(null)`
- CRUD operations using Spring Data JPA
- MySQL database integration

---

## 📂 Project Structure

```text
src/main/java
└── com.springboot
    ├── Application.java
    │
    ├── controller
    │   └── MyController.java
    │
    ├── entities
    │   └── User.java
    │
    ├── repository
    │   └── UserRepository.java
    │
    └── services
        ├── UserService.java
        └── UserServiceimp.java

src/main/resources
└── application.properties
```

---

## 🗃️ User Entity Fields

The `User` entity contains:

- `id`
- `name`
- `email`
- `password`
- `city`

---

## ⚙️ Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- STS / Eclipse

---

## 🛠️ application.properties

```properties
spring.application.name=05-spring-boot-Restfull-webservices

server.port=8081

spring.datasource.url=jdbc:mysql://localhost:3307/restfull_db
spring.datasource.username=root
spring.datasource.password=abc123

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 🗄️ Database Setup

Create database in MySQL:

```sql
CREATE DATABASE restfull_db;
```

> No need to manually create the table if `spring.jpa.hibernate.ddl-auto=update` is enabled.

---

## 🔖 Annotations Used

### Controller Layer
- `@RestController`
- `@PostMapping`
- `@GetMapping`
- `@PutMapping`
- `@DeleteMapping`
- `@RequestBody`
- `@PathVariable`

### Service Layer
- `@Service`
- `@Autowired`

### Entity Layer
- `@Entity`
- `@Table`
- `@Id`
- `@GeneratedValue`
- `@Column`

### Repository Layer
- `JpaRepository`

---

## 📌 API Endpoints

### 1) Add User
**POST** `/user`

#### Request Body
```json
{
  "name": "Om",
  "email": "om@gmail.com",
  "password": "12345",
  "city": "Surat"
}
```

#### Response
```json
{
  "id": 1,
  "name": "Om",
  "email": "om@gmail.com",
  "password": "12345",
  "city": "Surat"
}
```

---

### 2) Get All Users
**GET** `/user`

#### Response
```json
[
  {
    "id": 1,
    "name": "Om",
    "email": "om@gmail.com",
    "password": "12345",
    "city": "Surat"
  }
]
```

---

### 3) Get One User by ID
**GET** `/user/{id}`

#### Example
```http
GET /user/1
```

#### If User Found
```json
{
  "id": 1,
  "name": "Om",
  "email": "om@gmail.com",
  "password": "12345",
  "city": "Surat"
}
```

#### If User Not Found
```http
404 Not Found
```

---

### 4) Update User by ID
**PUT** `/user/{id}`

#### Example
```http
PUT /user/1
```

#### Request Body
```json
{
  "id": 1,
  "name": "Om Solanki",
  "email": "omsolanki@gmail.com",
  "password": "99999",
  "city": "Ahmedabad"
}
```

#### Response
```json
{
  "id": 1,
  "name": "Om Solanki",
  "email": "omsolanki@gmail.com",
  "password": "99999",
  "city": "Ahmedabad"
}
```

---

### 5) Delete User by ID
**DELETE** `/user/{id}`

#### Example
```http
DELETE /user/1
```

#### Expected Result
User record will be deleted from database.

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
CREATE DATABASE restfull_db;
```

### 4. Update database credentials

Edit your `application.properties` file if needed.

### 5. Run the application

Run:

```java
Application.java
```

### 6. Test APIs

You can test API endpoints using:

- Postman
- Thunder Client
- Browser (only GET APIs)

---

## 📬 Base URL

```text
http://localhost:8081
```

---

## 📋 Example API URLs

```text
POST   http://localhost:8081/user
GET    http://localhost:8081/user
GET    http://localhost:8081/user/1
PUT    http://localhost:8081/user/1
DELETE http://localhost:8081/user/1
```

---

## 💡 What I Learned From This Project

While building this project, I learned:

- How REST APIs work in Spring Boot
- How to send and receive JSON data
- How `@RequestBody` and `@PathVariable` work
- How to use `ResponseEntity`
- How to connect REST APIs with database operations
- How to structure a Spring Boot backend project properly
- How CRUD APIs are built in real backend applications


---

## 👨‍💻 Author

**Om Solanki**  
*MCA Student | Java Backend Learner*

This project is part of my **Spring Boot and Java backend learning journey**.