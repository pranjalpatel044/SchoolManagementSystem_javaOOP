# 🏫 School Management System (Java OOP Project)

A **Java-based School Management System** built to demonstrate **core Object-Oriented Programming (OOP) concepts** including **Encapsulation, Inheritance, Polymorphism, Abstraction, Interfaces, and Composition**.   

---

## 🚀 Features
- **Encapsulation** → Private fields with getters/setters for safe data handling  
- **Inheritance** → `Student` and `Teacher` extend `Person`  
- **Polymorphism** → `printRole()` behaves differently for Student and Teacher  
- **Abstraction** → Abstract class `Person` & `Payable` interface  
- **Composition** → `School` has `Courses`, `Course` has Students and Teacher  
- **Interface Implementation** → Salary system using `Payable`  

---

## 📂 Project Structure
SchoolManagementSystem/
│── src/
│ ├── Person.java # Abstract class (base for Student & Teacher)
│ ├── Student.java # Inherits Person
│ ├── Teacher.java # Inherits Person, implements Payable
│ ├── Payable.java # Interface for salary system
│ ├── Course.java # Course with students & teacher (Composition)
│ ├── School.java # Manages people & courses (Composition)
│ └── SchoolManagementSystem.java # Main runner class
│
└── README.md # Project documentation

---

## 🛠️ Technologies Used
- **Java 23.0.1** 
- **OOP Concepts** (Encapsulation, Inheritance, Polymorphism, Abstraction, Composition, Interfaces)  
- **Collections Framework** (ArrayList for managing objects)  

---
