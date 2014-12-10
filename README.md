OrgChart - Wed 12/10
==============

Create a program that prints a company's organization chart

## Objectives
- Understand inheritance and how the a subclass relates to and inherits from the superclass
- Implement a superclass and a subclass that inherits from the superclass

## Assignment

### class Person (Person.java)
- Fields: String for the person's first name and last name, plus an integer field for the Person's age (use proper encapsulation: private fields with get & set methods for each field)
- Constructors:
  - Default (no parameters): set names = "" (empty string) and age = 0
  - Second: takes three values and assigns them to first name, last name and age
- Accessors:
  - getFirstName
  - getLastName
  - getAge
  - toString: prints Person in form "lastName, firstName"
- Mutators:
  - recordBirthday: adds 1 to Person's age
  
### class Employee that inherits Person (Employee.java)
- Fields (use proper encapsulation: private fields with get & set methods for each field)
  - double hourlyWage
  - int hoursWorked
  - String jobTitle
- Constructor: takes six parameters - first three are used to call superclass constructor with first name, last name and age; last three are used to set hourly wage, hours worked and job title
- Accessors:
  - getWage(): returns the wage of the employee
  - getHours(): returns the hours of the employee
  - getWeeklySalary(): returns the weekly salary of the employee
  - getYearlySalary(): returns the annual salary of the employee - assume that the employee works the same amount of hours every week, and works 52 weeks in a year
  - getJobTitle(): returns employee's job title
  - toString(): returns employee's name, title and annual salary in form: "lastName, firstName: title @ $46000.0" (HINT: use supreclass toString() method to get name)
- Mutators:
  - setWage(double newWage): changes the employee's wage to newWage
  - setHours(int h): changes the employee's hours to h
  - setJobTitle(String title): changes the employee's job title to title
  - giveRaise(): increases the employee's wage by $1 dollar

  
OrgChart - Thur 12/11
==============
Make changes to class Employee and create classes Manager & Director.

### class Person - NO changes

### MODIFY class Employee that inherits Person
- Fields
  - add new field manager of type Manager
- Accessors:
  - add getManager to return the String value of manager
- Mutators:
  - add setManager(Manager newManager): 
    - if manager is not null, then remove this employee as a direct report from manager
    - set manager = newManager and add this employee as a direct report to manager
    
### CREATE class Manager that inherits Employee
- Fields:
  - add directReports as an ArrayList of type Employee
  - add String department
- Accessors:
  - add getDepartment 
  - add getDirectReports
- Mutators:
  - add addDirectReport(Employee employee): adds employee to directReports
  - add removeDirectReport(Employee employee): removes employee from directReports
  - add setDepartment(String dept): set department = dept
  
### CREATE class Manger that inherits Manager
- Fields:
  - add String division
- Accessors:
  - add getDivision 
- Mutators:
  - add setDivision
  