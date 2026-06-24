# Exercise 1: Control Structures

## Objective

To understand and implement PL/SQL control structures using loops, conditional statements, and SQL operations in a banking system.

---

## Database Used

### Customers Table

| Column | Description |
|---------|-------------|
| CustomerID | Unique customer ID |
| CustomerName | Customer Name |
| Age | Customer Age |
| Balance | Account Balance |
| IsVIP | VIP Status |

### Loans Table

| Column | Description |
|---------|-------------|
| LoanID | Unique Loan ID |
| CustomerID | Customer ID (Foreign Key) |
| InterestRate | Current Loan Interest Rate |
| DueDate | Loan Due Date |

---

## Scenario 1: Loan Interest Discount

### Problem Statement

The bank wants to apply a **1% discount** to loan interest rates for customers who are **above 60 years of age**.

### Logic

- Loop through all customers.
- Check if Age > 60.
- Reduce the customer's loan interest rate by 1%.
- Commit the changes.

### Output

Refer to:

`Outputs/Scenario1_Output.png`

---

## Scenario 2: VIP Promotion

### Problem Statement

Customers with an account balance greater than **$10,000** should be promoted to **VIP** status.

### Logic

- Loop through all customers.
- Check if Balance > 10000.
- Update the IsVIP flag to TRUE.
- Commit the changes.

### Output

Refer to:

`Outputs/Scenario2_Output.png`

---

## Scenario 3: Loan Reminder

### Problem Statement

Display reminder messages for customers whose loan is due within the next **30 days**.

### Logic

- Retrieve all loans due within 30 days using SYSDATE.
- Join Customers and Loans tables.
- Print reminder messages using DBMS_OUTPUT.PUT_LINE().

### Output

Refer to:

`Outputs/Scenario3_Output.png`

---

## PL/SQL Concepts Used

- Anonymous PL/SQL Blocks
- FOR LOOP
- UPDATE Statement
- SELECT Statement
- JOIN Operation
- COMMIT
- DBMS_OUTPUT.PUT_LINE()
- SYSDATE
- Conditional Filtering using WHERE clause

---

## Project Structure

```
PLSQL
│
├── DatabaseSetup
│   ├── CreateTables.sql
│   └── InsertSampleData.sql
│
└── ControlStructures
    ├── Scenario1_LoanInterestDiscount.sql
    ├── Scenario2_VIPPromotion.sql
    ├── Scenario3_LoanReminder.sql
    ├── README.md
    └── Outputs
        ├── Scenario1_Output.png
        ├── Scenario2_Output.png
        └── Scenario3_Output.png
```

---

## Result

Successfully implemented PL/SQL Control Structures for:

- Applying loan interest discounts.
- Promoting eligible customers to VIP status.
- Generating loan due reminder messages.

All scenarios were executed successfully using Oracle Live SQL.