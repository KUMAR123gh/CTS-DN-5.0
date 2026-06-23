# E-commerce Platform Search Function

## Objective

Implement **Linear Search** and **Binary Search** algorithms to search products in an e-commerce platform and compare their performance using time complexity analysis.

---

## Scenario

An e-commerce platform stores a large number of products. Efficient searching is essential to provide quick search results to users. This exercise demonstrates how Linear Search and Binary Search can be used to search for products based on their names.

---

## Big O Notation

Big O notation is used to measure the efficiency of an algorithm by describing how its execution time grows as the input size increases.

### Linear Search

* Best Case: **O(1)** (Element found at the first position)
* Average Case: **O(n)**
* Worst Case: **O(n)** (Element found at the last position or not found)

### Binary Search

* Best Case: **O(1)** (Element found at the middle)
* Average Case: **O(log n)**
* Worst Case: **O(log n)**

---

## Project Structure

```text
SearchAlgorithms/
│
├── src/
│   ├── Product.java
│   ├── LinearSearch.java
│   ├── BinarySearch.java
│   └── SearchTest.java
│
├── README.md
└── .gitignore
```

---

## Classes

### Product.java

Represents a product with the following attributes:

* Product ID
* Product Name
* Category

### LinearSearch.java

Implements the Linear Search algorithm by checking each product sequentially until the target product is found.

### BinarySearch.java

Implements the Binary Search algorithm to search efficiently in a sorted array of products.

### SearchTest.java

Creates sample products, performs both Linear Search and Binary Search, and displays the search results.

---

## Sample Output

```text
===== Linear Search =====
Product ID : 104
Product Name : Monitor
Category : Electronics

===== Binary Search =====
Product ID : 104
Product Name : Monitor
Category : Electronics
```

---

## Time Complexity

| Algorithm     | Best Case | Average Case | Worst Case |
| ------------- | --------: | -----------: | ---------: |
| Linear Search |      O(1) |         O(n) |       O(n) |
| Binary Search |      O(1) |     O(log n) |   O(log n) |

---

## Comparison

### Linear Search

* Works on both sorted and unsorted arrays.
* Simple to implement.
* Suitable for small datasets.

### Binary Search

* Requires the array to be sorted.
* Much faster for large datasets.
* Efficient for applications with frequent search operations.

---

## Conclusion

This project demonstrates the implementation and comparison of Linear Search and Binary Search algorithms. While Linear Search is simple and suitable for small or unsorted datasets, Binary Search provides significantly better performance for large sorted datasets, making it the preferred choice for modern e-commerce platforms.
