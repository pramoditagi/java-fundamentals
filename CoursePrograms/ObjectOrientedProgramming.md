Object-Oriented Programming (OOP) is a programming paradigm that focuses on modeling real-world entities as objects. These objects encapsulate both data (attributes or state) and behaviors (methods or actions).

In contrast, Structural, Procedural, or Functional Programming focuses on organizing code around procedures, functions, or routines, with an emphasis on the sequence of operations and flow of data.

**Example Scenario: Air Travel**

_Procedural/Functional Approach:_
If a user wants to fly, the solution is designed as a sequence of steps or functions:

```
function travelToAirport() {
  findCounter();
  checkIn();
  securityCheck();
  onboard();
  findTheSeat();
}
```

Here, each function corresponds to a specific procedure in the workflow.

_Object-Oriented Approach:_
In OOP, we model real-world entities as classes, identifying their state (data) and behavior (actions):

**Airplane (Class)**

- Data (State): airline, make, type, position
- Actions (Behavior): takeoff(), land(), cruise()

**Passenger (Class)**

- Data (State): name, dateOfBirth, address
- Actions (Behavior): takeCab(), travel(), checkIn()

**AirHostess (Class)**

- Data (State): name, dateOfBirth, address, title
- Actions (Behavior): serve(), help()

- **State**: The data stored in an object, representing its current condition (e.g., the passenger's name or an airplane's position). The state of an object can change over time.
- **Behavior**: The set of actions or methods that can be performed on/by the object (e.g., checkIn(), takeoff()).

By thinking in terms of objects with state and behavior, OOP allows for more modular, reusable, and maintainable code.

**Example: Planet as an Object-Oriented Concept**

Consider representing a planet in an object-oriented way:

- **Planet**: This is a class that defines the blueprint for all planets. It has:
  - **Attributes (data/state)**: Such as `name`, `radius`, `distanceFromSun`, etc.
  - **Methods (actions/behavior)**: Such as `rotate()`, `orbit()`, etc.

Each planet like Earth or Mars can be represented as an **instance** (object) of the `Planet` class, each with its own unique data:

- **Earth**:
  - Data: `name = "Earth"`, `radius = 6371 km`, `distanceFromSun = 149.6 million km`
  - Behavior: `rotate()`, `orbit()`
- **Mars**:
  - Data: `name = "Mars"`, `radius = 3390 km`, `distanceFromSun = 227.9 million km`
  - Behavior: `rotate()`, `orbit()`

**Basic Class Structure Example:**

```javascript
class Planet {
  // Data/member variables:
  // name, radius, distanceFromSun, etc.
  // Methods:
  // rotate(), orbit(), etc.
}
```

This structure demonstrates how OOP models real-world entities (like planets) as objects with both state (attributes) and behavior (methods).

**Encapsulation:**  
Encapsulation is a fundamental concept in object-oriented programming (OOP) that ensures a class controls access to its own data (state). The internal data of a class should be private to that class and not accessible directly by other classes. If another class needs to access or modify this data, it should do so only through the public methods (also known as getters and setters) that the original class provides. This approach helps protect the integrity of the data, reduces unintended interactions, and makes the codebase more maintainable and modular.

**Advantages of Encapsulation**

1. Encapsulation ensures that the internal state (data) of a class is hidden from other classes. By marking member variables as `private`, they cannot be accessed directly from outside the class. Instead, controlled access is provided through public methods.
2. Using getter and setter methods allows for validation and control over how data is accessed and modified. This prevents invalid or inconsistent data from being assigned to class variables, promoting data integrity and reliability.
3. Encapsulation enhances modularity and maintainability, as changes to the internal implementation of a class do not affect code that uses the class, as long as the interface (public methods) remains the same.
4. By restricting direct access, encapsulation also helps to reduce code complexity and increases security.

Example:

```java
class Person {
  private String name; // Encapsulated variable

  // Getter with validation logic if needed
  public String getName() {
    return name;
  }

  // Setter with validation
  public void setName(String name) {
    if (name != null && !name.isEmpty()) {
      this.name = name;
    }
  }
}
```
