# Car Factory Application
## Description
The **Car Factory Application** is a simple Java console-based management system designed to simulate car manufacturing processes. This system allows users to add cars, employees, and car-producing machines into a car factory system. The application facilitates the management of employees and machines in a car manufacturing plant. 

## Features
**Add Employees:** Users can add employees with information such as name, position, and salary.
**Add Car-Producing Machines:** Users can add machines used for manufacturing cars, specifying attributes like machine name, capacity, and operational status.
**Car Management:** Users can add cars with details such as car name, engine type, price, and production year.
**Console-Based Interaction: **The application interacts with the user through the console for ease of use and management.

## Installation and Setup
Follow these steps to install and set up the Car Factory application:

### Prerequisites
**Java Development Kit (JDK):** Ensure that Java 8 or higher is installed on your machine.
**MySQL Database:** Ensure that MySQL is installed and running. Create a database car_factory before using the application. The schema is provided below.

**Clone or Download the Project: **Download the project files from the provided ZIP or clone the repository. 

**Set up the Database:** Open your MySQL client or terminal and run the following commands to set up the necessary tables.

```sql
CREATE DATABASE car_factory;

-- Create table for employees
CREATE TABLE Employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    position VARCHAR(100),
    salary DECIMAL(10, 2)
);

-- Create table for machines
CREATE TABLE Machines (
    id INT AUTO_INCREMENT PRIMARY KEY,
    machine_name VARCHAR(255),
    capacity INT,
    operational BOOLEAN
);

-- Create table for cars
CREATE TABLE Cars (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    engine_type VARCHAR(50),
    price DECIMAL(10, 2),
    production_year INT
);

```
**Configure Database Connection:** Open the `CarRepository.java`, `EmployeeRepository.java`, and `CarProducingMachineRepository.java` files in the `src/repository folder`. Modify the database connection URL and credentials if necessary to match your MySQL setup.

**Build the Project:**
Using Maven: If you are using Maven, you can simply run:
```bash
mvn clean install

```
Using Gradle: If you are using Gradle, run:
```bash
gradle build

```

**Run the Application:** After building the project, you can run the main application (`Main.java`) from your IDE or command line:
```bash
java -cp target/car_factory_app.jar Main
```

**Use the Console:** Once the application is running, you can interact with it through the console:
1. Add employees
2. Add car-producing machines
3. Add cars to the factory system

When the application is running, it will show a console menu like this:
```
Car Factory Management System
1. Add Employee
2. Add Car Producing Machine
3. Exit
Choose an option: 1
Enter Employee Name: John Doe
Enter Employee Position: Engineer
Enter Employee Salary: 50000.00
Employee added successfully.

Car Factory Management System
1. Add Employee
2. Add Car Producing Machine
3. Exit
Choose an option: 2
Enter Machine Name: Production Line 1
Enter Production Capacity: 100
Is Operational (true/false): true
Machine added successfully.

```
