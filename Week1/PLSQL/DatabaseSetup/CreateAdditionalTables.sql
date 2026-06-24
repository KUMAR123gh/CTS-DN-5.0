-- Savings Accounts Table

CREATE TABLE SavingsAccounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    Balance NUMBER(10,2),
    FOREIGN KEY (CustomerID)
    REFERENCES Customers(CustomerID)
);

-- Employees Table

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    EmployeeName VARCHAR2(100),
    Department VARCHAR2(50),
    Salary NUMBER(10,2)
);