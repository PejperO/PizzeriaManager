# PizzeriaManager

## Overview
PizzeriaManager is a comprehensive system designed for managing pizzerias, aiming to support pizzeria owners and employees in efficiently managing various aspects of restaurant operations. The system offers functionalities for menu management, ingredient management, employee and customer management, and order tracking.

## Table of Contents
1. [Project Scope and Objectives](README.md#project-scope-and-objectives)
2. [System Responsibilities](README.md#system-responsibilities)
3. [System Users](README.md#system-users)
4. [User Requirements](README.md#user-requirements)
5. [Functional Requirements](README.md#functional-requirements)
6. [Non-Functional Requirements](README.md#non-functional-requirements)
7. [System Features](README.md#system-features)
8. [System Structure - Diagrams](README.md#system-structure---diagrams)
   - [Context Diagram](README.md#context-diagram)
   - [Use Case Diagram](README.md#use-case-diagram)
   - [Analytical Class Diagram](README.md#analytical-class-diagram)
   - [Design Class Diagram](README.md#design-class-diagram)
   - [Dynamic Use Case Analysis](README.md#dynamic-use-case-analysis)
   - [State Diagram](README.md#state-diagram)
   - [Activity Diagram](README.md#activity-diagram)
   - [Sequence Diagram](README.md#sequence-diagram)
   - [User Interface Prototype](README.md#user-interface-prototype)
9. [Glossary](README.md#glossary)
10. [Installation](README.md#installation)
11. [License](README.md#license)

## Project Scope and Objectives
The system is intended for the gastronomy industry, specifically for managing pizzerias. It supports owners and employees in effectively managing various aspects of the restaurant, including:

- **Menu and Dish Management:** Create, modify, and manage the pizzeria's menu, including adding new dishes such as pizza, gnocchi, and spaghetti.
- **Ingredient Management:** Manage ingredients used in dishes, track their availability, and plan purchases.
- **Employee and Customer Management:** Manage employee data, including their employment, shifts, and roles. Store customer data for personalized services and loyalty programs.

## System Responsibilities
The system provides comprehensive support for managing pizzeria operations, focusing on:

- **Menu Management:** Create, edit, and delete menu items, assign ingredients to dishes.
- **Employee Data Management:** Manage employee data, including employment, shifts, and roles.
- **Customer Data Management:** Collect and store customer information.
- **Order Management:** Track and manage orders, from placement to fulfillment.

## System Users
The system is designed for various user groups involved in pizzeria operations:

- **Pizzeria Owners:** Manage all aspects of the restaurant, including menu, ingredients, and employees.
- **Pizzeria Employees:** Perform duties such as taking and fulfilling orders, preparing dishes, and managing work schedules.

## User Requirements
The system should store information about:

- Persons:
  - Owner
  - Customer
  - Employee (Waiter, Chef)
- Dishes: Pizza, Gnocchi, Spaghetti
- Ingredients: Used in dishes
- Menu: Comprehensive details necessary for restaurant operations

## Functional Requirements
- Add, edit, and delete dishes
- Browse the menu
- Manage ingredients
- Place and accept orders
- Track order status
- Manage employees and customers
- Backup data
- Ensure data security

## Non-Functional Requirements
- **Security:** Data access is restricted based on user roles.
- **Reliability:** Data recovery mechanisms in case of system failure.
- **Scalability:** Easily add new types of dishes, ingredients, and persons.
- **Usability:** Intuitive user interface with search and filter functions.

## System Features
The PizzeriaManager system offers a wide range of features to facilitate the efficient management of a pizzeria. These include:

1. Menu Management:
   - Add, edit, and delete dishes.
   - Browse and search the menu.
   - Assign ingredients to dishes.

2. Ingredient Management:
   - Track ingredient availability.
   - Plan and manage ingredient purchases.

3. Order Management:
   - Place and track orders.
   - Update order status.
   - Manage order fulfillment.

4. Employee Management:
   - Manage employee information and roles.
   - Schedule employee shifts.

5. Customer Management:
   - Store and manage customer data.
   - Personalize customer service and loyalty programs.

6. Data Management:
   - Backup and restore data.
   - Ensure data security and integrity.

## System Structure - Diagrams
### Context Diagram
![Context Diagram](https://github.com/user-attachments/assets/46388e6d-2bd9-4fcf-bac0-876b8b412cf6)

### Use Case Diagram
![Use Case Diagram](https://github.com/user-attachments/assets/19359da5-05b7-4aca-acd9-1d3aacbceca9)

### Analytical Class Diagram
![Analytical Class Diagram](https://github.com/user-attachments/assets/30508ddc-4de0-4785-9d9b-8444adcdec6b)

### Design Class Diagram
![Design Class Diagram](https://github.com/user-attachments/assets/ead21cd4-d9a6-42a9-a052-70b10bf64e67)

### Dynamic Use Case Analysis

| Use Case: | Add a new dish to the menu |
| ------------- |:-------------:|
| _Actors:_ | Owner |
| _Goal:_ | Owner wants to add a new dish to the pizzeria's menu |
| _Preconditions:_ | Owner is logged into the system |
| _Postconditions:_ | New dish is added to the menu and available for customers |
| _Main Steps:_ | Owner selects "Add new dish" option |
|  | System displays form for new dish details |
|  | Owner enters details |
|  | System validates input |
|  | Owner confirms |
|  | System creates new dish object |
|  | System assigns ingredients to the dish |
|  | System adds dish to the menu |
|  | System displays success message |
| _Alternate Steps:_ | Missing required data: System displays error message |

### State Diagram
![State Diagram](https://github.com/user-attachments/assets/dbc686b2-27cf-4fa0-b284-a2eceaad5b2b)

### Activity Diagram
![Activity Diagram](https://github.com/user-attachments/assets/33ef1ba9-bb2a-4d1d-a903-4acba702247c)

### Sequence Diagram
![Sequence Diagram](https://github.com/user-attachments/assets/3fecafc6-bccb-4bbc-97de-86bd2a51f6b8)

### User Interface Prototype
#### Main Menu
![Main Menu](https://github.com/user-attachments/assets/0c2b1348-f5de-44a3-bfd8-1a461a5f9e3a)
#### Adding a new person
![Adding a new person](https://github.com/user-attachments/assets/f7638ca1-1455-47d4-8a46-078c6d7d56b6)
#### Monitoring orders
![Monitoring orders](https://github.com/user-attachments/assets/5cafca77-549c-44d5-9356-11b22d39fdb9)
#### Adding a new order
![Adding a new order](https://github.com/user-attachments/assets/f958cf70-7485-4f39-8891-cc2cec6a9ef9)
#### Adding a new dish
![Adding a new dish](https://github.com/user-attachments/assets/00f3102d-a37d-4647-b2fe-561d6cb48a54)

### Glossary
- **Gastronomy Industry:** Sector focused on food and beverage preparation and service.
- **Pizzeria:** Restaurant specializing in pizza.
- **Menu:** List of available dishes and beverages.
- **Dish:** Single menu item, e.g., pizza, gnocchi, spaghetti.
- **Ingredient:** Item used to prepare dishes, e.g., sausage, cheese, tomato sauce.
- **Employee:** Individual employed in the pizzeria, such as a waiter or chef.
- **Customer:** Person using pizzeria services.
- **Owner:** Person managing and owning the pizzeria.
- **Unique Identifier:** Each person and component must have a unique ID.
- **Data Integrity:** Each dish must have at least one ingredient; orders must be linked to a customer and waiter.
- **System Performance:** The system should handle up to 1000 orders per day without performance degradation.

## Installation
To install and run the PizzeriaManager system, follow these steps:
1. Clone the repository:
``` bash
git clone https://github.com/PejperO/PizzeriaManager.git
```
2. Navigate to the project directory:
``` bash
cd PizzeriaManager
```
3. Build the project using Maven:
``` bash
./mvnw clean install
```
4. Run the application:
``` bash
./mvnw spring-boot:run
```
Make sure you have Java Development Kit (JDK) and Apache Maven installed on your machine. If not, you can download and install them from the following links:
- [JDK](https://www.oracle.com/java/technologies/downloads/?er=221886) 
- [Apache Maven](https://maven.apache.org/download.cgi)

## License
This project is licensed under the GPL-3.0 License. See the [LICENSE](LICENSE) file for more details.
