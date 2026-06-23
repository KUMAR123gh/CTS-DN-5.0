# Singleton Pattern Example

## Objective

Implement the Singleton Design Pattern to ensure that only one instance of the `Logger` class exists throughout the application lifecycle.

---

## Scenario

A logging utility is required for an application. Instead of creating multiple logger objects, a single shared logger instance should be used by all parts of the application to ensure consistent logging and efficient memory usage.

---

## Project Structure

```text
SingletonPatternExample/
│
├── src/
│   ├── Logger.java
│   └── SingletonTest.java
│
├── README.md
└── .gitignore
```

---

## Classes

### Logger.java

* Implements the Singleton Pattern.
* Contains a private static instance of `Logger`.
* Has a private constructor to prevent object creation from outside the class.
* Provides a public static `getInstance()` method to access the single instance.
* Includes a `log()` method to print log messages.

### SingletonTest.java

* Tests the Singleton implementation.
* Obtains two logger references using `getInstance()`.
* Verifies that both references point to the same object.
* Prints hash codes and log messages.

---

## Sample Output

```
Logger instance created.
LOG: Application Started
LOG: User Logged In

Logger 1 HashCode : 1450495309
Logger 2 HashCode : 1450495309

Both logger objects are the same instance.
```

> Note: The hash code may vary on different executions, but both hash codes will always be identical because they refer to the same object.

---

## Time Complexity

| Operation     | Complexity |
| ------------- | ---------- |
| getInstance() | O(1)       |
| log()         | O(1)       |

---

## Conclusion

The Singleton Design Pattern ensures that only one instance of the `Logger` class is created and shared across the application. This helps maintain consistent logging while reducing unnecessary object creation and memory usage.
