# Lab Activity 2: Interfaces in Java

Name: Dianne Margareth C. Liquit
Section: 2A

# Laboratory Activity: Interfaces

## Overview
This activity continues the previous Abstraction and Polymorphism project by implementing Interfaces in Java.

## Objectives
- Create a `Serviceable` interface.
- Implement the interface in Car, Motorcycle, Truck, and Printer classes.
- Use a `Serviceable[]` array to demonstrate interface polymorphism.
- Use a `Vehicle[]` array to demonstrate inheritance and polymorphism.
- Practice implementing methods from an interface.

## Classes and Interface

### 1. Serviceable.java
Defines the `service()` method that must be implemented by the classes.

### 2. Vehicle.java
An abstract parent class containing vehicle fields, constructors, getters, setters, and abstract movement methods.

### 3. Car.java
Extends Vehicle and implements Serviceable. Includes car information and service behavior.

### 4. Motorcycle.java
Extends Vehicle and implements Serviceable. Includes motorcycle information and service behavior.

### 5. Truck.java
Extends Vehicle and implements Serviceable. Includes truck information and service behavior.

### 6. Printer.java
Implements Serviceable without extending Vehicle.

### 7. Main.java
Creates objects, uses the `performService()` helper method, and demonstrates polymorphism using Serviceable and Vehicle arrays.

Sample Output

=== Serviceable Items ===
Car: check oil and brakes.
Motorcycle: inspect tires and brakes.
Truck: inspect cargo brakes.
Printer: check ink and paper.

=== Vehicle Information ===
Mitsubishi - Mirage G4 - 2019
Doors: 4
A car is moving.

Harley-Davidson - Street 750 - 2020
Engine Type: V-Twin
A motorcycle is moving.

Freightliner - Freightliner Cascadia - 2026
Wheels: 10
A truck is moving.

Expected Result

One interface allows the same helper method to work with different implementing classes. The abstract Vehicle implementation continues to work through its subclasses.