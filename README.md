# java-oop

Java programs based on **Object-Oriented Programming (OOP)**, covering fundamental Class XII concepts such as inheritance, polymorphism, abstraction, interfaces, and encapsulation

> **Note:** This repository is maintained solely for **learning and educational purposes**, as part of my study of Java Object-Oriented Programming

## What this repository contains

This repository contains Java programs organized into sections according to the OOP concepts they demonstrate

---

## 1. Inheritance

Programs covering the fundamental concepts and types of inheritance

### Basic Inheritance

1. **Basic Inheritance** — demonstrates inheritance using the `extends` keyword.
2. **Single Inheritance** — demonstrates one superclass and one subclass.
3. **Multilevel Inheritance** — demonstrates inheritance across multiple levels.
4. **Hierarchical Inheritance** — demonstrates multiple subclasses inheriting from the same superclass.

### Method Overriding

5. **Method Overriding** — demonstrates overriding a superclass method in a subclass.
6. **Multiple Overriding** — demonstrates multiple subclasses overriding the same superclass method.

### `super` Keyword

7. **`super` with Variable** — accesses a superclass variable when the subclass contains a variable with the same name.
8. **`super` with Method** — invokes an overridden method of the superclass.
9. **`super` with Constructor** — explicitly invokes the no-argument constructor of the superclass.

### Constructors

10. **Constructor Execution Order** — demonstrates the order in which constructors execute in multilevel inheritance.
11. **Parameterized `super()`** — passes arguments to a parameterized superclass constructor using `super(...)`.
12. **Multilevel Constructor Chaining** — demonstrates parameterized constructor chaining across multiple levels of inheritance.
13. **Default Constructor in Subclass** — demonstrates the automatic default constructor and implicit `super()` call in a subclass.

### Access Modifiers

14. **Private Member** — demonstrates that a private superclass member cannot be directly accessed by a subclass.
15. **Protected Member** — demonstrates that a protected superclass member can be directly accessed by a subclass.

---

## 2. Polymorphism

Programs demonstrating different forms of polymorphism in Java

### Compile-Time Polymorphism

1. **Method Overloading** — demonstrates compile-time polymorphism by defining multiple methods with the same name but different parameter lists.

### Run-Time Polymorphism

2. **Method Overriding** — demonstrates runtime polymorphism through method overriding.
3. **Multiple Subclasses** — demonstrates multiple subclasses overriding the same superclass method.
4. **Dynamic Method Dispatch** — demonstrates how the overridden method is selected according to the actual object at runtime.
5. **Polymorphic Method Parameters** — demonstrates how a method can accept objects of different subclasses through a superclass parameter.
6. **Upcasting and Downcasting** — demonstrates treating a subclass object as a superclass object and explicitly converting the reference back to the subclass type.
7. **`instanceof`** — demonstrates checking the actual type of an object before performing downcasting.
8. **Final Recap** — combines the major polymorphism concepts covered in the section, including method overloading, method overriding, dynamic method dispatch, polymorphic parameters, upcasting, downcasting, and `instanceof`.

---

## 3. Abstraction

Programs demonstrating abstract classes and abstract methods

### Abstract Classes and Methods

1. **Abstract Keyword** — demonstrates the use of abstract classes and abstract methods, including concrete methods within an abstract class.
2. **Multiple Subclasses** — demonstrates how multiple subclasses implement abstract methods differently while inheriting common concrete methods.

### Constructors

3. **Constructor in Abstract Class** — demonstrates constructor execution in an abstract superclass when a subclass object is created.
4. **Multiple Abstract Methods** — demonstrates how a concrete subclass must implement multiple abstract methods declared in an abstract superclass.
5. **Parameterized Constructor** — demonstrates parameterized constructors in abstract classes and constructor chaining using `super(...)`.

### Abstraction and Polymorphism

6. **Abstract Class and Polymorphism** — demonstrates runtime polymorphism using an abstract superclass reference and different subclass objects.
7. **Abstraction Recap** — combines abstract classes, multiple abstract methods, concrete methods, parameterized constructors, `super(...)`, multiple subclasses, abstract-class references, and runtime polymorphism.

---

## 4. Interfaces

Programs demonstrating the use and implementation of interfaces in Java

### Basic Interfaces

1. **Basic Interface** — demonstrates the declaration of an interface, implementation using `implements`, and implementation of interface methods.
2. **Multiple Interfaces** — demonstrates how a class can implement multiple interfaces and provide implementations for methods from each interface.
3. **Interface Reference & Polymorphism** — demonstrates runtime polymorphism using an interface reference and different implementing class objects.

### Interface Variables and Methods

4. **Interface Variables** — demonstrates interface variables, which are implicitly `public static final` constants.
5. **Default Methods** — demonstrates default methods in interfaces, which provide a ready-made implementation for implementing classes.
6. **Default Method Override** — demonstrates how an implementing class can override a default method provided by an interface.
7. **Static Methods** — demonstrates static methods in interfaces and how they are accessed using the interface name.

### Interface Inheritance

8. **Interface Inheritance** — demonstrates one interface inheriting from another interface using `extends`.
9. **Multiple Interface Inheritance** — demonstrates how an interface can extend multiple interfaces and combine their contracts.

### Recap

10. **Interfaces Recap** — combines interface methods, default methods, multiple interface inheritance, and implementation of inherited interface methods.

---

## 5. Encapsulation

Programs demonstrating encapsulation and controlled access to class members

### Basic Encapsulation

1. **Basic Encapsulation** — demonstrates encapsulation using `private` instance variables and controlled access through methods.

### Getters and Setters

2. **Getters and Setters** — demonstrates getter and setter methods for reading and modifying private instance variables.
3. **Validation Using Setters** — demonstrates validating data through a setter before modifying a private variable.
4. **`this` with Encapsulation** — demonstrates the use of the `this` keyword to distinguish instance variables from parameters with the same name.

### Constructors and Encapsulation

5. **Constructor + Encapsulation** — demonstrates initializing private instance variables through a parameterized constructor instead of a setter.
6. **Validation in Constructor** — demonstrates validating data during object creation and maintaining a validity status for the object.
7. **Read-Only Data** — demonstrates read-only access using a private variable, a constructor for initialization, and a getter without a setter.
8. **Write-Only Data** — demonstrates write-only access using a private variable and a setter without a getter.

### `final` Variables

9. **`final` Variables** — demonstrates the use of a private `final` variable that can be initialized once and cannot be reassigned.
10. **Encapsulation Recap** — combines private members, constructors, `this`, `final` variables, getters, validation, and controlled modification of object data.

---

## Concepts Covered

### Inheritance

- `extends` keyword
- Single inheritance
- Multilevel inheritance
- Hierarchical inheritance
- Method overriding
- `super` keyword
- `super()` constructor
- Parameterized constructor chaining
- Automatic constructor chaining
- Default constructors in subclasses
- `private` members
- `protected` members
- Constructor execution order

### Polymorphism

- Compile-time polymorphism
- Method overloading
- Runtime polymorphism
- Method overriding
- Dynamic method dispatch
- Polymorphic method parameters
- Upcasting
- Downcasting
- `instanceof` operator

### Abstraction

- Abstract classes
- Abstract methods
- Concrete methods in abstract classes
- Multiple abstract methods
- Multiple subclasses
- Constructors in abstract classes
- Parameterized constructors
- `super(...)` with abstract classes
- Constructor chaining
- Abstract-class references
- Abstraction with runtime polymorphism

### Interfaces

- Interfaces
- `implements` keyword
- Interface methods
- Interface constants (`public static final`)
- Interface references
- Runtime polymorphism
- Multiple interface implementation
- Default methods
- Overriding default methods
- Static methods in interfaces
- Interface inheritance
- Multiple interface inheritance
- Combining multiple interface contracts

### Encapsulation

- Encapsulation
- `private` instance variables
- Getters
- Setters
- Data validation
- Boolean validity flags
- `this` keyword
- Parameterized constructors
- Constructor-based initialization
- Read-only data
- Write-only data
- `final` variables
- Controlled access to object state
- Controlled modification of object data

### OOP Concepts

- Inheritance
- Polymorphism
- Abstraction
- Interfaces
- Encapsulation

## Level

**Class XII / ISC Computer Science**