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
