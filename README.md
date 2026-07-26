# 🏧 ATM Simulator

A simple console-based ATM simulator written in Java. The application allows users to authenticate using a card number and PIN, check their balance, deposit money, withdraw funds, and log out.

This project was created as a learning exercise to practice object-oriented programming principles, service separation, and console application development.

---

## 🚀 Features

* User authentication using card number and PIN
* View current account balance
* Deposit money
* Withdraw money with balance validation
* Logout functionality
* Simple console-based menu
* Predefined test accounts for demonstration

---

## 🛠️ Tech Stack

* Java
* Gradle
* Lombok

---

## 📂 Project Structure

```
src
└── main
    └── java
        ├── homework
        │   └── Main.java
        ├── Service
        │   ├── ATMService.java
        │   └── MenuService.java
        └── models
            ├── Account.java
            └── Bank.java
```

---

## 🏗️ Architecture

### Account

Represents a bank account.

Responsibilities:

* Stores card number
* Stores PIN code
* Stores account balance
* Deposits money
* Withdraws money with validation

---

### Bank

Acts as a simple in-memory database.

Responsibilities:

* Stores all available accounts
* Initializes predefined demo accounts
* Searches accounts by card number

---

### ATMService

Contains the application's business logic.

Responsibilities:

* User authentication
* Current session management
* Balance retrieval
* Depositing money
* Withdrawing money
* Logout

---

### MenuService

Handles all console interaction with the user.

Responsibilities:

* Reading user input
* Displaying menus
* Calling business logic methods
* Processing user actions

---

## ▶️ Running the Project

### Clone the repository

```bash
git clone https://github.com/RomaIlchyshyn/ATMSimulator.git
```

### Navigate to the project

```bash
cd ATMSimulator
```

### Run the application

Using Gradle:

```bash
./gradlew run
```

or build the project:

```bash
./gradlew build
```

You can also run `Main.java` directly from your IDE.

---

## 👤 Demo Accounts

| Card Number | PIN  | Balance |
| ----------- | ---- | ------- |
| 4512        | 1234 | 500.00  |
| 1111        | 1111 | 1100.00 |
| 9999        | 7777 | 777.00  |

---

## 💻 Example Workflow

```
=== Welcome to ATM ===

Enter your card number:
4512

Enter your PIN:
1234

MAIN MENU

1. Check balance
2. Deposit money
3. Withdraw money
4. Logout
```

---

## 📌 Current Functionality

* Authentication
* Session management
* Balance inquiry
* Deposit funds
* Withdraw funds
* Logout

---

## 🔮 Possible Improvements

* Unit tests (JUnit 5)
* Input validation
* Exception handling
* Transaction history
* Account creation
* Data persistence (database or file storage)
* Multiple currencies
* Transfer between accounts
* Admin panel
* Logging
* REST API version
* Maven support
* Docker support

---

## 📖 Learning Objectives

This project demonstrates:

* Object-Oriented Programming (OOP)
* Encapsulation
* Separation of concerns
* Service layer implementation
* Simple application architecture
* Working with collections
* Console interaction
* Basic banking business logic

---

## 📄 License

This project was created for educational purposes.
# ATMSimulator
