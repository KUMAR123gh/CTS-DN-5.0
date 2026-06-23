# Financial Forecasting

## Objective

Implement a recursive algorithm to predict the future value of an investment based on its current value, annual growth rate, and the number of years.

---

## Scenario

A financial forecasting tool is required to estimate the future value of an investment using historical growth rates. This exercise demonstrates how recursion can be applied to repeatedly calculate the value of an investment over a specified number of years.

---

## Understanding Recursion

Recursion is a programming technique in which a method calls itself to solve a problem by breaking it down into smaller subproblems. Every recursive algorithm consists of:

* **Base Case** – The condition that stops the recursion.
* **Recursive Case** – The part where the method calls itself with a smaller problem.

In this project:

* **Base Case:** When the number of years becomes 0, the current value is returned.
* **Recursive Case:** The investment value is increased by the growth rate, and the method is called again for the remaining years.

---

## Project Structure

```text
FinancialForecasting/
│
├── src/
│   └── FinancialForecast.java
│
├── README.md
└── .gitignore
```

---

## Algorithm

1. Read the current investment value.
2. Read the annual growth rate.
3. Read the number of years.
4. If the number of years is 0, return the current value.
5. Otherwise, calculate the updated value using the growth rate.
6. Recursively call the method for the remaining years.
7. Display the predicted future value.

---

## Sample Output

```text
Current Value : 10000.00
Growth Rate   : 10.00%
Years         : 5
Future Value  : 16105.10
```

---

## Time Complexity

| Operation          | Complexity |
| ------------------ | ---------- |
| Recursive Forecast | O(n)       |

where **n** is the number of years.

---

## Space Complexity

| Operation            | Complexity |
| -------------------- | ---------- |
| Recursive Call Stack | O(n)       |

Each recursive call occupies one stack frame until the base case is reached.

---

## Optimization

Although recursion provides a simple and elegant solution, it consumes additional memory because of recursive function calls.

The solution can be optimized by:

* Using an **iterative approach**, which reduces space complexity to **O(1)**.
* Using **Dynamic Programming (Memoization)** for problems involving repeated recursive calculations.

For this forecasting problem, an iterative solution is generally more memory-efficient.

---

## Conclusion

This project demonstrates the use of recursion to predict the future value of an investment over multiple years. The recursive solution clearly illustrates how a problem can be solved by repeatedly applying the same calculation until a base condition is reached. While recursion improves code readability, an iterative approach is preferred in real-world financial applications due to its lower memory usage.
