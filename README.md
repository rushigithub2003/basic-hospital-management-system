# Hospital Management System

## 📌 About the Project

This project is a basic Hospital Management System developed using Java and Spring Boot.

It provides REST APIs to manage Doctors, Patients, and Staff. The application demonstrates Setter-Based Dependency Injection and uses separate controllers and service layers to handle different hospital management operations.

## 🛠️ Technologies Used

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* PostgreSQL
* Maven

## 📂 Project Structure

```text
com.example.hospital
├── controller
│   ├── DoctorController.java
│   ├── PatientController.java
│   └── StaffController.java
├── entity
│   ├── Doctor.java
│   ├── Patient.java
│   └── Staff.java
├── repository
│   ├── DoctorRepo.java
│   ├── PatientRepo.java
│   └── StaffRepo.java
└── service
    ├── DoctorService.java
    ├── PatientService.java
    └── StaffService.java
```

## 🧩 Concepts Covered

* Spring Boot REST API Development
* Dependency Injection (DI)
* Inversion of Control (IoC)
* Setter-Based Dependency Injection
* `@Autowired` annotation
* `@RestController` annotation
* `@PostMapping`, `@GetMapping`, and `@DeleteMapping`
* `@RequestBody` and `@PathVariable`
* Spring Data JPA
* Hibernate ORM
* CRUD Operations

## 💉 Setter-Based Dependency Injection

The project demonstrates Setter Injection by injecting service dependencies through setter methods.

Example from `DoctorController`:

```java
@Autowired
public void setDoctorService(DoctorService doctorImpl) {
    this.doctorService = doctorImpl;
}
```

Similar setter-based dependency injection is used in `StaffController`.

The `PatientController` also defines a setter method for injecting `PatientService`. However, its setter currently does not have the `@Autowired` annotation.

## 🏥 Modules

### 1. Doctor Management

Provides APIs to:

* Add a doctor.
* Retrieve a doctor by ID.
* Delete a doctor by ID.
* Delete all doctors.

### 2. Patient Management

Provides APIs to:

* Add a patient.
* Retrieve a patient by ID.
* Delete a patient by ID.
* Delete all patients.

### 3. Staff Management

Provides APIs to:

* Add staff.
* Retrieve staff by ID.
* Delete staff by ID.
* Delete all staff.

## 🌐 API Endpoints

### Doctor APIs

| HTTP Method | Endpoint       | Description         |
| ----------- | -------------- | ------------------- |
| POST        | `/doctor`      | Add a doctor        |
| GET         | `/doctor/{id}` | Get doctor by ID    |
| DELETE      | `/doctor/{id}` | Delete doctor by ID |
| DELETE      | `/doctor`      | Delete all doctors  |

### Patient APIs

| HTTP Method | Endpoint        | Description          |
| ----------- | --------------- | -------------------- |
| POST        | `/patient`      | Add a patient        |
| GET         | `/patient/{id}` | Get patient by ID    |
| DELETE      | `/patient/{id}` | Delete patient by ID |
| DELETE      | `/patient`      | Delete all patients  |

### Staff APIs

| HTTP Method | Endpoint      | Description        |
| ----------- | ------------- | ------------------ |
| POST        | `/staff`      | Add staff          |
| GET         | `/staff/{id}` | Get staff by ID    |
| DELETE      | `/staff/{id}` | Delete staff by ID |
| DELETE      | `/staff`      | Delete all staff   |

## 📥 Sample API Requests

### Add Doctor

**POST** `/doctor`

```json
{
  "id": 1,
  "name": "Dr. Rahul",
  "specialization": "Cardiology"
}
```

### Add Patient

**POST** `/patient`

```json
{
  "id": 1,
  "name": "Amit",
  "age": 30
}
```

### Add Staff

**POST** `/staff`

```json
{
  "id": 1,
  "name": "Priya",
  "role": "Nurse"
}
```

*Note: The sample JSON fields are illustrative. Adjust them according to the actual fields in your Doctor, Patient, and Staff entities.*

## ▶️ How to Run

1. Clone this repository.
2. Import the project into Spring Tool Suite (STS) as an existing Maven project.
3. Configure the database connection in `application.properties`.
4. Ensure the database is running.
5. Run the main Spring Boot application.
6. Test the REST APIs using Postman.

## 🎯 Learning Objective

The main objective of this project is to understand how to develop REST APIs using Spring Boot, organize an application into controller, service, repository, and entity layers, and implement Setter-Based Dependency Injection.

## 🚀 Future Improvements

* Add update operations for Doctors, Patients, and Staff.
* Add GET APIs to retrieve all records.
* Implement global exception handling.
* Add request validation.
* Improve dependency injection and service management.
