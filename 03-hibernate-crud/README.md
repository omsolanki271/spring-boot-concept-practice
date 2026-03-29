# 03-hibernate-crud

## 📌 Project Overview
This project demonstrates **basic CRUD operations in Hibernate** using a **menu-driven Java console application** in a **Maven project**.

The project performs the following operations on the database:
- **Insert** a new user record
- **Select** user data by ID
- **Update** existing user data
- **Delete** user data from the database

This project is created to understand how **Hibernate ORM** works with **Java + MySQL + Maven**.

---

## 🛠️ Technologies Used
- Java
- Hibernate ORM
- MySQL
- Maven
- Eclipse / Spring Tool Suite (STS)

---

## 📂 Project Structure
```bash id="x6syr2"
03-hibernate-crud
│── src/main/java
│   ├── com.hibernet.main
│   │   └── App.java
│   │
│   └── com.hibernet.entity
│       └── User.java
│
│── src/main/resources
│   └── hibernate.cfg.xml
│
│── pom.xml
│── README.md
````

---

## ⚙️ Maven Dependencies Used

This project uses the following main dependencies:

### Hibernate Core

```xml id="b4w6jg"
<dependency>
	<groupId>org.hibernate</groupId>
	<artifactId>hibernate-core</artifactId>
	<version>5.6.15.Final</version>
</dependency>
```

### MySQL Connector

```xml id="12d5uk"
<dependency>
	<groupId>mysql</groupId>
	<artifactId>mysql-connector-java</artifactId>
	<version>8.0.33</version>
</dependency>
```

---

## ⚙️ Hibernate Configuration

The project uses `hibernate.cfg.xml` for database connection and Hibernate settings.

### Main Configuration Used

```xml id="2rdv6q"
<property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>
<property name="connection.url">jdbc:mysql://localhost:3307/hibernate_db</property>
<property name="connection.username">root</property>
<property name="connection.password">abc123</property>

<property name="dialect">org.hibernate.dialect.MySQL8Dialect</property>
<property name="show_sql">true</property>
<property name="format_sql">true</property>
<property name="hbm2ddl.auto">update</property>

<mapping class="com.hibernet.entity.User"/>
```

---

## 📖 CRUD Operations Included

### 1. Insert Operation

Used to insert a new user record into the database.

### 2. Select Operation

Used to fetch user data using ID.

### 3. Update Operation

Used to update existing user information.

### 4. Delete Operation

Used to remove a user record from the database.

---

## 📌 Main Hibernate Methods Used

```
session.save(user);
session.get(User.class, selectId);
session.saveOrUpdate(user3);
session.delete(user4);
transaction.commit();
transaction.rollback();
```

---

## ▶️ How to Run This Project

1. Clone or download this project
2. Open it in **Eclipse / STS**
3. Make sure **MySQL server** is running
4. Create the required database:

```sql id="fd4wxj"
create database hibernate_db;
```

5. Update your database username and password in `hibernate.cfg.xml`
6. Run the `App.java` file
7. Choose operation from the console menu

---

## 🧠 What I Learned

* How to create a **Maven Hibernate project**
* How to add dependencies in `pom.xml`
* How to configure Hibernate using `hibernate.cfg.xml`
* How to connect Java application with MySQL
* How to perform CRUD operations using Hibernate
* How to use `SessionFactory`, `Session`, and `Transaction`

---

## 🚀 Purpose of This Project

This project is built for **learning Hibernate CRUD basics** and understanding how ORM works in Java applications.

It creates a strong foundation for:

* Hibernate projects
* Spring Boot with JPA
* Java backend development

---

## 👨‍💻 Author

**Om Solanki**
