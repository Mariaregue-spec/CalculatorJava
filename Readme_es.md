# 🧮 CalculatorJava

Calculadora simple desarrollada en **Java** usando **TDD (Test Driven Development)**.

Este proyecto implementa operaciones matemáticas básicas y tests unitarios con JUnit 5.

---

## 📌 Descripción

La calculadora permite realizar las siguientes operaciones:

- ➕ Suma
- ➖ Resta
- ✖ Multiplicación
- ➗ División

Características:

- Números positivos
- Números negativos
- Números decimales
- Control de división por cero
- Tests parametrizados
- Uso de TDD

---

## ⚙️ Tecnologías

| Herramienta | Uso |
|------------|--------|
| Java | Lenguaje principal |
| Maven | Gestión del proyecto |
| JUnit 5 | Tests unitarios |
| IntelliJ IDEA | IDE |
| GitHub | Repositorio |

---

## 📂 Estructura del proyecto

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
## ▶️ Ejecutar el programa

Ejecutar Main.java

---

### 🧪 Ejemplo de salida
```text
==============================
➕ CASOS DE SUMA
==============================
2.0 + 3.0 = 5.0
-5.0 + 2.0 = -3.0
2.5 + 3.5 = 6.0

==============================
➖ CASOS DE RESTA
==============================
5.5 - 2.0 = 3.5
2.0 - 5.5 = -3.5
-3.0 - -2.0 = -1.0

==============================
✖ CASOS DE MULTIPLICACIÓN
==============================
2.5 * 2.0 = 5.0
-2.0 * 3.0 = -6.0
5.5 * 0.0 = 0.0

==============================
➗ CASOS DE DIVISIÓN
==============================
7.0 / 2.0 = 3.5
-6.0 / 2.0 = -3.0
5.5 / 0.5 = 11.0

==============================
⚠ DIVISIÓN ENTRE CERO
==============================
5.0 / 0.0 -> Error: Cannot divide by zero

```

---
## 🧪 Tests

Todos los métodos han sido probados usando **JUnit 5 con ParameterizedTest**.

Casos probados:

- Números positivos
- Números negativos
- Números decimales
- Multiplicación por cero
- División por cero

### ✅ Resultado de los tests

Añadir captura de pantalla aquí:

<img width="391" height="426" alt="Captura de pantalla 2026-03-09 090153" src="https://github.com/user-attachments/assets/4d34f391-5984-49a7-a260-d29d7db0054e" />
---

## 🧠 Proceso TDD

Pasos seguidos:

Escribir el test

Ejecutar → falla

Implementar método

Ejecutar → pasa

Refactorizar

Todos los métodos se han creado siguiendo TDD.

## 📌 Características

✔ Código limpio

✔ Tests parametrizados

✔ Control de excepciones

✔ Proyecto Maven

✔ Uso de TDD

✔ Principios SOLID

✔ Salida por consola

## 🧱 Principios SOLID

S — Single Responsibility Principle

La clase Calculator solo tiene una responsabilidad:

Realizar operaciones matemáticas.

Cada método hace una sola cosa:

add → suma

subtract → resta

multiply → multiplicación

divide → división

O — Open / Closed Principle

La clase puede ampliarse sin modificar el código existente.

Ejemplo:

potencia

raíz cuadrada

módulo

L — Liskov Substitution Principle

No se usa herencia en este proyecto,
pero el diseño permite ampliaciones.

I — Interface Segregation Principle

No es necesario en este proyecto simple.

D — Dependency Inversion Principle

No necesario en este proyecto,
pero el código es fácil de extender.

---

## 👩‍💻 Autor

Mariaregue-spec

GitHub:
https://github.com/Mariaregue-spec

