# Lab Activity 2: Abstraction in Java

Name: Dianne Margareth C. Liquit
Section: 2A

## Description
This activity demonstrates abstraction in Java using an abstract class and method overriding. The `Vehicle` class is declared as an abstract class with four abstract movement methods. The `Car`, `Truck`, and `Motorcycle` classes extend `Vehicle` and provide their own implementations of these methods.

## Classes

- **Vehicle.java** – An abstract class that contains vehicle information and four abstract movement methods.
- **Car.java** – A subclass of `Vehicle` that implements the movement methods and displays the number of doors.
- **Truck.java** – A subclass of `Vehicle` that implements the movement methods and displays the number of wheels.
- **Motorcycle.java** – A subclass of `Vehicle` that implements the movement methods and displays the engine type.
- **Main.java** – Contains the main method, creates vehicle objects, and demonstrates abstraction and polymorphism.

## Abstract Methods

The `Vehicle` class declares the following abstract methods:

- `moveForward()`
- `moveBackwards()`
- `moveLeft()`
- `moveRight()`

Each subclass overrides these methods to display its own movement messages.

## Sample Output

```text
=== Parent References ===
Mitsubishi - Mirage G4 - 2019
Doors: 4
A car moves forward.
A car moves backwards.
A car moves left.
A car moves right.

=== Truck ===
Freightliner - Freightliner Cascadia - 2026
Wheels: 10
A truck moves forward.
A truck moves backwards.
A truck moves left.
A truck moves right.

=== Motorcycle ===
Harley-Davidson - Street 750 - 2020
Engine Type: V-Twin
A motorcycle moves forward.
A motorcycle moves backwards.
A motorcycle moves left.
A motorcycle moves right.
```

*Note: The program also demonstrates method parameters and an array of different vehicle objects.*

## How to Run

Compile the Java files:

```bash
javac *.java
```

Run the program:

```bash
java Main
```

## Concepts Demonstrated

- Abstraction
- Abstract classes and methods
- Inheritance
- Method overriding
- Polymorphism
