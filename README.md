# 🏫 School Management System (OOP Demonstration)

![Java](https://img.shields.io/badge/Language-Java%2023-ED8B00?logo=openjdk&logoColor=white) ![Concepts](https://img.shields.io/badge/Concepts-OOPs%20%26%20Design-blue)

## 📖 Overview
The **School Management System** is a pure Java application designed specifically to demonstrate the practical implementation of **Object-Oriented Programming (OOP)** principles.

Unlike standard management apps, the architecture of this project focuses on code reusability, modularity, and scalability using concepts like **Inheritance, Polymorphism, and Composition**.

## 🧠 OOP Concepts Implemented
This project maps real-world school entities to code using the following pillars of OOP:

* **🛡️ Encapsulation:** All sensitive data (like IDs and Salaries) is hidden using `private` fields and accessed only via secure Getters/Setters.
* **👨‍ Inheritance:** The `Student` and `Teacher` classes inherit common properties (Name, Age) from the abstract `Person` class to avoid code duplication.
* **🎭 Polymorphism:** The `printRole()` method is overridden to behave differently for a Student (shows Grade) versus a Teacher (shows Subject).
* **🧩 Composition:** A `School` is composed of `Courses`, and a `Course` is composed of `Students` and `Teachers` (Has-A relationship).
* **🏗️ Abstraction:** The `Person` class is abstract (cannot be instantiated directly), ensuring a proper blueprint for derived classes.
* **🔌 Interface:** The `Payable` interface allows the system to process salaries for Teachers without tightly coupling the payment logic.

## 🛠️ Tech Stack
* **Language:** Java 23.0.1
* **Core Concepts:** OOPs (Encapsulation, Inheritance, Polymorphism, Abstraction, Composition)
* **Data Structures:** Java Collections Framework (ArrayList)

## 📂 Project Structure
![Project Structure](./Project_Structure.png)

## 🚀 How to Run
1.  **Clone the Repository**
    ```bash
    git clone [https://github.com/pranjalpatel044/School-Management-System.git](https://github.com/pranjalpatel044/School-Management-System.git)
    ```
2.  **Navigate to Project Directory**
    ```bash
    cd School-Management-System
    ```
3.  **Compile the Code**
    ```bash
    javac Main.java
    ```
4.  **Run the Application**
    ```bash
    java Main
    ```

## 🎯 Learning Outcomes
By building this project, I mastered:
* How to design a **Class Hierarchy** effectively.
* The difference between **Is-A (Inheritance)** and **Has-A (Composition)** relationships.
* Using **Interfaces** to decouple logic (e.g., separating Payment logic from Person logic).
* Managing dynamic lists of objects using **ArrayList**.

---
**Developed by [Pranjal Patel](https://github.com/pranjalpatel044)**
