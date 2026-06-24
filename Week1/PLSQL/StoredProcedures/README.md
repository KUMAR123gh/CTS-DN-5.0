# Exercise 3: Stored Procedures

## Objective

To understand and implement PL/SQL Stored Procedures for performing banking operations such as processing monthly interest, updating employee bonuses, and transferring funds between customer accounts.

---

## Database Tables Used

### Customers

Stores customer information.

### Loans

Stores customer loan details.

### SavingsAccounts

Stores savings account details including account balance.

### Employees

Stores employee details including department and salary.

---

## Scenario 1: Process Monthly Interest

### Problem Statement

The bank wants to process monthly interest for all savings accounts by applying an interest rate of **1%** to the current account balance.

### Procedure Name

`ProcessMonthlyInterest`

### Logic

- Update every savings account.
- Increase the balance by **1%**.
- Save the changes using `COMMIT`.

### Output

Refer to:

`Outputs/Scenario1_Output.png`

---

## Scenario 2: Update Employee Bonus

### Problem Statement

The bank wants to reward employees by giving a bonus based on their department.

### Procedure Name

`UpdateEmployeeBonus`

### Parameters

- Department
- Bonus Percentage

### Logic

- Accept department and bonus percentage as input.
- Increase the salary of employees belonging to the specified department.
- Commit the updated salaries.

### Output

Refer to:

`Outputs/Scenario2_Output.png`

---

## Scenario 3: Transfer Funds

### Problem Statement

Customers should be able to transfer money from one savings account to another.

### Procedure Name

`TransferFunds`

### Parameters

- Source Account ID
- Destination Account ID
- Transfer Amount

### Logic

- Retrieve the balance of the source account.
- Check whether sufficient balance is available.
- If sufficient:
  - Deduct amount from source account.
  - Add amount to destination account.
  - Commit the transaction.
- Otherwise display an "Insufficient Balance" message.

### Output

Refer to:

`Outputs/Scenario3_Output.png`

---

## PL/SQL Concepts Used

- Stored Procedures
- Procedure Parameters
- Variables
- SELECT INTO
- UPDATE Statement
- IF...ELSE Condition
- COMMIT
- DBMS_OUTPUT.PUT_LINE()
- Arithmetic Operations

---

## Project Structure

```
PLSQL
│
├── DatabaseSetup
│   ├── CreateTables.sql
│   ├── InsertSampleData.sql
│   ├── CreateAdditionalTables.sql
│   └── InsertAdditionalData.sql
│
├── ControlStructures
│
└── StoredProcedures
    ├── Scenario1_ProcessMonthlyInterest.sql
    ├── Scenario2_UpdateEmployeeBonus.sql
    ├── Scenario3_TransferFunds.sql
    ├── README.md
    └── Outputs
        ├── Scenario1_Output.png
        ├── Scenario2_Output.png
        └── Scenario3_Output.png
```

---

## Result

Successfully implemented three PL/SQL stored procedures for:

- Processing monthly interest on savings accounts.
- Updating employee salaries with department-wise bonuses.
- Securely transferring funds between customer accounts with balance validation.

All procedures were executed and verified successfully using **Oracle Live SQL**.