# 🎓 Student Management System

A comprehensive web-based Student Management System built with Spring Boot that provides full CRUD (Create, Read, Update, Delete) operations for managing student records. This application features a modern, responsive user interface and uses an in-memory H2 database for easy setup and development.

## ✨ Features

- **📋 Student List View** - Display all students in a clean, organized table format
- **➕ Create Student** - Add new students with first name, last name, and email
- **✏️ Edit Student** - Update existing student information
- **🗑️ Delete Student** - Remove students from the system
- **💾 H2 Database** - In-memory database with console access for data inspection
- **🎨 Modern UI** - Responsive Bootstrap-based interface
- **⚡ Fast Performance** - Optimized Spring Boot application

## 🛠️ Tech Stack

- **Backend Framework**: Spring Boot 4.0.1
- **Java Version**: 25
- **Database**: H2 Database (In-Memory)
- **ORM**: Spring Data JPA / Hibernate
- **Template Engine**: Thymeleaf
- **Frontend**: Bootstrap 5.3.8
- **Build Tool**: Maven
- **Server**: Embedded Tomcat

## 📋 Prerequisites

Before you begin, ensure you have the following installed:

- **Java JDK 25** or higher
- **Maven 3.6+** (or use the included Maven wrapper)
- **Git** (for cloning the repository)
- **IDE** (IntelliJ IDEA, Eclipse, or VS Code recommended)

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/pruthapatel05/Student-Management-System.git
cd Student-Management-System
```

### 2. Build the Project

Using Maven wrapper (recommended):
```bash
./mvnw clean install
```

Or using Maven directly:
```bash
mvn clean install
```

### 3. Run the Application

Using Maven wrapper:
```bash
./mvnw spring-boot:run
```

Or using Maven directly:
```bash
mvn spring-boot:run
```

Or run the JAR file:
```bash
java -jar target/Student-Management-System-0.0.1-SNAPSHOT.jar
```

### 4. Access the Application

Once the application starts, open your web browser and navigate to:

- **Main Application**: http://localhost:8080/students
- **H2 Database Console**: http://localhost:8080/h2-console

**H2 Console Credentials:**
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: (leave empty)

## 📖 Usage Guide

### Viewing Students

Navigate to http://localhost:8080/students to see all registered students in a table format.

### Adding a New Student

1. Click the **"Add New Student"** button on the students list page
2. Fill in the required fields:
   - First Name
   - Last Name
   - Email (must be unique)
3. Click **"Save Student"** to add the student

### Editing a Student

1. From the students list, click the **Edit** button next to the student you want to modify
2. Update the desired fields
3. Click **"Update Student"** to save changes

### Deleting a Student

1. From the students list, click the **Delete** button next to the student you want to remove
2. Confirm the deletion (the student will be immediately removed)

## 🏗️ Project Structure

```
Student-Management-System/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/studentmanagement/sms/
│   │   │       ├── controller/          # REST controllers
│   │   │       │   └── Studentcontroller.java
│   │   │       ├── entity/              # JPA entities
│   │   │       │   └── Studententity.java
│   │   │       ├── repository/          # Data access layer
│   │   │       │   └── Studentrepository.java
│   │   │       ├── services/            # Business logic
│   │   │       │   ├── Studentservices.java
│   │   │       │   └── impl/
│   │   │       │       └── StudentserviceImpl.java
│   │   │       └── StudentManagementSystemApplication.java
│   │   │
│   │   └── resources/
│   │       ├── static/                  # Static resources (CSS, images)
│   │       │   └── css/
│   │       ├── templates/               # Thymeleaf templates
│   │       │   ├── students.html
│   │       │   ├── create_student.html
│   │       │   └── edit_student.html
│   │       └── application.properties   # Application configuration
│   │
│   └── test/                            # Test files
│
├── pom.xml                              # Maven dependencies
├── .gitignore
└── README.md
```

## 🔧 Configuration

The application configuration can be found in `src/main/resources/application.properties`:

- **Server Port**: 8080
- **Database**: H2 In-Memory Database
- **JPA**: Auto-update schema on startup
- **H2 Console**: Enabled at `/h2-console`

### Switching to MySQL (Optional)

To use MySQL instead of H2, uncomment and configure the MySQL settings in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=yourpassword
```

And uncomment the MySQL dependency in `pom.xml`.

## 🧪 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/students` | Display all students |
| GET | `/students/new` | Show create student form |
| POST | `/students` | Create a new student |
| GET | `/students/edit/{id}` | Show edit student form |
| POST | `/students/{id}` | Update a student |
| GET | `/students/delete/{id}` | Delete a student |

## 🎯 Key Features Explained

### Entity Design
- **Student Entity**: Contains ID (auto-generated), First Name, Last Name, and Email
- **Email Validation**: Unique constraint ensures no duplicate emails
- **JPA Annotations**: Proper mapping for database operations

### Service Layer
- **Separation of Concerns**: Business logic separated from controller
- **Repository Pattern**: Clean data access abstraction
- **CRUD Operations**: Complete Create, Read, Update, Delete functionality

### User Interface
- **Responsive Design**: Works on desktop, tablet, and mobile devices
- **Bootstrap Integration**: Modern, professional styling
- **Form Validation**: Client-side and server-side validation
- **User-Friendly Navigation**: Intuitive buttons and links

## 🐛 Troubleshooting

### Port Already in Use
If port 8080 is already in use, change it in `application.properties`:
```properties
server.port=8081
```

### Database Connection Issues
- Ensure H2 database is properly configured
- Check `application.properties` for correct database settings
- Access H2 console to verify database state

### Build Errors
- Ensure Java 25+ is installed: `java -version`
- Clean and rebuild: `mvn clean install`
- Check Maven wrapper permissions: `chmod +x mvnw` (Linux/Mac)

---

⭐ If you find this project helpful, please consider giving it a star!
