# leave-management-system-backend
Backend code for creating REST APIs to manage employees and leaves taken by them

Description :
Spring Boot-based web application that exposes RESTful CRUD APIs to clients. It involves the creation, retrieval, updation and deletion of employees and subsequent operations for applying leave and taking actions on it.

Requirements : 
* Java 8 or higher.
* Maven
* MySQL Database server (including MySQL Workbench and MySQL Command Line Client to manage database)
* Eclipse IDE
* Postman (to test RESTful APIs)

How To Run :
* Create a mysql database and import tables from app-DB-Script.sql
* Import the project in Eclipse IDE and run as java application. The application will get started at embedded tomcat server.
* Hit the apis from Postman (Ex. GET http://localhost:8080/employees)

Update :
Api documentation using the Springfox implementation of the Swagger 2 specification.
* Add springfox dependencies in pom.xml

![image](https://user-images.githubusercontent.com/40176983/120137620-5ce9ba80-c1f2-11eb-9dd2-c4d0ed5f6567.png)

* Add docket bean and @EnableSwagger2 annotation in @SpringBootApplication class.
* Run the application.
* Open the browser and go to http://localhost:8080/swagger-ui.html#/

![image](https://user-images.githubusercontent.com/40176983/120137863-e0a3a700-c1f2-11eb-9458-fb694e5255f4.png)

 
