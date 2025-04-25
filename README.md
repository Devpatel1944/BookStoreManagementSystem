# 📚 Bookstore Management System

A full-stack web application built using **Java**, **Spring Boot**, **Spring Web**, **MySQL**, **Thymeleaf**, and **Bootstrap** to manage a bookstore efficiently.

---

## 🚀 Features

- View list of available books
- Add new books to the store
- Edit book details
- Delete books from inventory
- Categorize books
- User-friendly UI using Bootstrap & Thymeleaf

---

## 🛠️ Tech Stack

- **Backend:** Java, Spring Boot, Spring Web
- **Frontend:** Thymeleaf, HTML, CSS, Bootstrap
- **Database:** MySQL
- **Build Tool:** Maven
- **IDE:** Eclipse / IntelliJ

---
💡 Future Enhancements
Add login and user roles

REST API version

Book search & filter

Export book list to PDF/Excel

Add book ratings and reviews

## ⚙️ Configuration

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/Database_name
spring.datasource.username=username
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.thymeleaf.cache=false
server.port=8080


---
▶️ How to Run

1. Clone the repository
git clone https://github.com/yourusername/bookstore-management.git

2.Create the database in MySQL
CREATE DATABASE database_name;

3.Update application.properties with your DB credentials.

4.Run the app
mvn spring-boot:run

Open browser and go to:
👉 http://localhost:8080

---------------------------
