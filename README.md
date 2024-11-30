# Employee Management System  

## Overview  
The **Employee Management System** is a web application built using Spring Boot that allows employers to manage employee records efficiently. It provides functionalities to store employee data, update details, manage attendance, and more. The application integrates **Spring Data JPA**, **Hibernate ORM**, and **Thymeleaf** for a seamless backend and frontend experience, using a **PostgreSQL database** for robust data storage.  

---

## Features  
- **CRUD Operations**: Create, Read, Update, and Delete employee details.  
- **Dynamic Frontend**: Built with Thymeleaf for responsive and user-friendly interfaces.  
- **Data Persistence**: Seamless database integration using Spring Data JPA and Hibernate ORM.  
- **Attendance Management**: Employees can log in to mark their attendance.  
- **Role-Based Access**: Employers can manage employee details securely.  
- **Scalable Architecture**: Modular design for scalability and maintainability.  

---

## Technology Stack  
### Backend  
- **Java**  
- **Spring Boot** (3.3)  
- **Spring Data JPA**  
- **Hibernate ORM**  
- **PostgreSQL**  

### Frontend  
- **Thymeleaf**  
- **HTML/CSS**  

### Tools & Other Dependencies  
- **IntelliJ IDEA**  
- **Postman**  
- **pgAdmin**  
- **Maven**  

---

## Installation  

### Prerequisites  
- **Java JDK 11 or later**  
- **PostgreSQL** installed and running  
- **Maven** for dependency management  

### Steps  
1. Clone this repository:  
   ```bash  
   git clone https://github.com/Ayush-Puri/Employee-Management-Backend-Web
   cd Employee-Management-Backend-Web  
   ```  

2. Configure the database:  
   - Update the `application.properties` file located in `src/main/resources/` with your PostgreSQL credentials:  
     ```properties  
     spring.datasource.url=jdbc:postgresql://localhost:5432/employee_db  
     spring.datasource.username=your-username  
     spring.datasource.password=your-password  
     spring.jpa.hibernate.ddl-auto=update  
     ```  

3. Build the project:  
   ```bash  
   mvn clean install  
   ```  

4. Run the application:  
   ```bash  
   mvn spring-boot:run  
   ```  

5. Access the application:  
   Open your web browser and navigate to:  
   ```
   http://localhost:8080  
   ```  

---

## API Endpoints  

### **Employee Management**  
| HTTP Method | Endpoint               | Description                  |  
|-------------|------------------------|------------------------------|  
| `GET`       | `/employees`           | Retrieve all employees       |  
| `GET`       | `/employees/{id}`      | Retrieve employee by ID      |  
| `POST`      | `/employees`           | Add a new employee           |  
| `PUT`       | `/employees/{id}`      | Update an employee's details |  
| `DELETE`    | `/employees/{id}`      | Delete an employee by ID     |  

### **Attendance Management**  
| HTTP Method | Endpoint               | Description                  |  
|-------------|------------------------|------------------------------|  
| `POST`      | `/attendance`          | Mark attendance              |  

---

## Project Structure  
```plaintext  
Employee-Management-System/  
├── src/  
│   ├── main/  
│   │   ├── java/com/example/employee/  
│   │   │   ├── controller/       # Handles HTTP requests  
│   │   │   ├── model/            # Defines JPA entities  
│   │   │   ├── repository/       # Data access layer  
│   │   │   └── service/          # Business logic  
│   │   └── resources/  
│   │       ├── static/           # Static assets (CSS, JS)  
│   │       ├── templates/        # Thymeleaf templates  
│   │       └── application.properties # Configuration  
│   └── test/  
├── pom.xml                        # Maven dependencies  
└── README.md                      # Project documentation  
```  

---

## Screenshots  

### Dashboard  
![Dashboard Screenshot](#)  

### Employee List  
![Employee List Screenshot](#)  

### Add Employee  
![Add Employee Screenshot](#)  

---

## Contribution  
Contributions are welcome! To contribute:  
1. Fork this repository.  
2. Create a new branch for your feature:  
   ```bash  
   git checkout -b feature-name  
   ```  
3. Commit and push your changes.  
4. Create a pull request detailing your changes.  

---

## License  
This project is licensed under the MIT License.  

---

Feel free to ask if you need help deploying this project or understanding its structure.
