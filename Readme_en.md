# 🧮 CalculatorJava

![Java](https://img.shields.io/badge/Java-17-blue)
![JUnit](https://img.shields.io/badge/JUnit-5-green)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![TDD](https://img.shields.io/badge/Methodology-TDD-orange)

🔗 Repository:  
https://github.com/Mariaregue-spec/CalculatorJava

---

## 📌 Description

This project is a simple calculator developed in **Java** using **Test Driven Development (TDD)**.

The calculator supports the following operations:

- ➕ Add
- ➖ Subtract
- ✖ Multiply
- ➗ Divide

All methods support:

- Positive numbers  
- Negative numbers  
- Decimal numbers  
- Division by zero control  

Unit tests were created using **JUnit 5**.

---

## ⚙️ Technologies

| Tool | Use |
|------|--------|
| Java | Main language |
| Maven | Project management |
| JUnit 5 | Testing |
| IntelliJ IDEA | IDE |
| GitHub | Repository |

---

## 📂 Project Structure

```text
CalculatorJava
│
├─ src
│  ├─ main
│  │  └─ java
│  │      └─ org.example
│  │          ├─ Main.java
│  │          └─ Calculator
│  │              └─ Calculator.java
│  │
│  └─ test
│      └─ java
│          └─ Calculator
│              └─ CalculatorTest.java

```

---

## ▶️ Run the program

Run `Main.java`

### 🧪 Example output

```text
==============================
➕ ADD TEST CASES
==============================
2.0 + 3.0 = 5.0
-5.0 + 2.0 = -3.0
2.5 + 3.5 = 6.0

==============================
➖ SUBTRACT TEST CASES
==============================
5.5 - 2.0 = 3.5
2.0 - 5.5 = -3.5
-3.0 - -2.0 = -1.0

==============================
✖ MULTIPLY TEST CASES
==============================
2.5 * 2.0 = 5.0
-2.0 * 3.0 = -6.0
5.5 * 0.0 = 0.0

==============================
➗ DIVIDE TEST CASES
==============================
7.0 / 2.0 = 3.5
-6.0 / 2.0 = -3.0
5.5 / 0.5 = 11.0

==============================
⚠ DIVIDE BY ZERO TEST
==============================
5.0 / 0.0 -> Error: Cannot divide by zero

```

---

## 🧪 Tests

All methods were tested using **JUnit 5 Parameterized Tests**.

Tested cases:

- Positive numbers
- Negative numbers
- Decimal numbers
- Multiply by zero
- Division by zero (exception)

### ✅ Test results

📸 Screenshot of test execution:


<img width="391" height="426" alt="Captura de pantalla 2026-03-09 090153" src="https://github.com/user-attachments/assets/ca11fe96-f960-4ff1-9c24-d3ed847bfdd8" />



Example:


CalculatorTest

testAdd ✔
testSubtract ✔
testMultiply ✔
testDivide ✔
testDivideByZero ✔


To insert screenshot:

1. Create folder `images`
2. Save screenshot as `tests.png`
3. Replace with:



---

## 🧠 TDD Process

Steps followed:

1. Write test
2. Run test → fail
3. Implement method
4. Run test → pass
5. Refactor

All methods were created following TDD.

---

## 📌 Features

✔ Clean code  
✔ Parameterized tests  
✔ Exception handling  
✔ Console output  
✔ Maven project  
✔ Git commits  
✔ TDD  
✔ SOLID principles  

---

## 🧱 SOLID Principles

This project follows basic SOLID principles.

### S — Single Responsibility Principle

The `Calculator` class has only one responsibility:

Perform mathematical operations.

Each method does only one thing:

- add → addition
- subtract → subtraction
- multiply → multiplication
- divide → division

---

### O — Open / Closed Principle

The class can be extended with new operations without modifying existing code.

Example:

- power
- square root
- modulo

New methods can be added without breaking existing tests.

---

### L — Liskov Substitution Principle

Not applied in this project because no inheritance is used,
but the design allows extension without breaking behaviour.

---

### I — Interface Segregation Principle

Not required for this simple project.

The class only exposes the methods that are needed.

---

### D — Dependency Inversion Principle

Not needed in this small project,
but the code is prepared to be extended if needed.

✔ Clean structure  
✔ Easy to test  
✔ Easy to extend  

---

## 👩‍💻 Author

Mariaregue-spec

GitHub:

https://github.com/Mariaregue-spec
