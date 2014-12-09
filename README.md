OrgChart
==============

Create a program that prints a company's organization chart

## Objectives
- Understand inheritance and how the a subclass relates to and inherits from the superclass
- Implement a superclass and a subclass that inherits from the superclass

## Assignment

### class Person (Person.java)
- Fields: String for the person's first name and last name, plus an integer field for the Person's age (use proper encapsulation: private fields with get & set methods for each field)
- Accessors:
  - getFirstName
  - getLastName
  - getAge
  - toString: prints Person in form "lastName, firstName"
- Mutators:
  - recordBirthday: adds 1 to Person's age
  
### class Employee inherits Person (Employee.java)
- Fields (use proper encapsulation: private fields with get & set methods for each field)
  - double hourlyWage
  - int hoursWorked
  - String jobTitle
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
  
