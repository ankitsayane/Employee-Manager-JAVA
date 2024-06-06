# Employee Management System

This is a simple console-based Employee Management System implemented in Java. It allows you to add, delete, search, and display details of full-time and part-time employees. Additionally, you can sort employees based on their joining date.

## Features

1. **Add Full-Time Employee**
2. **Add Part-Time Employee**
3. **Delete Employee by ID**
4. **Search Employee by Aadhar**
5. **Display All Employee Details**
6. **Sort Employees by Joining Date**
7. **Exit**

## Types of Employees

There are two types of employees:
1. **Full-Time Employee (FTE)**
2. **Part-Time Employee (PTE)**

### Employee Details

The application captures the following details for each employee, whether FTE or PTE:
- Name
- Date of Joining
- Phone Number
- Aadhaar Number

Additionally:
- For FTE, the monthly salary is also captured.
- For PTE, the hourly payment amount is also captured.

The same collection class is used to store both FTE and PTE.

### Input Validation

Before entering the data into the system, input should be validated as follows:
- **Emp ID**: Should be auto-generated and unique for each employee.
- **Date of Joining**: Should be of type `LocalDate`.
- **Phone Number**: Should be all numeric and of length 10.
- **Aadhaar Number**: Should be all numeric and of length 12 only, with no spaces in between.
- Two employees cannot have the same Aadhaar number.

## Application Menu

1. **Add Full-Time Employee**
2. **Add Part-Time Employee**
3. **Delete an Employee by Emp ID**
4. **Search Employee Details by Aadhaar Number**
5. **Display All Employee Details**
6. **Display All Employee Details Sorted by Date of Joining**
7. **Exit**

## Prerequisites

- Java Development Kit (JDK) 8 or higher
