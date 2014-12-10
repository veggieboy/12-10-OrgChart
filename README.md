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
  - add new field manager of type Manager
- Constructor: takes six parameters - first three are used to call superclass constructor with first name, last name and age; last three are used to set hourly wage, hours worked and job title
- Accessors:
  - getWage(): returns the wage of the employee
  - getHours(): returns the hours of the employee
  - getWeeklySalary(): returns the weekly salary of the employee
  - getYearlySalary(): returns the annual salary of the employee - assume that the employee works the same amount of hours every week, and works 52 weeks in a year
  - getJobTitle(): returns employee's job title
  - toString(): returns employee's name, title and annual salary in form: "lastName, firstName: title @ $46000.0" (HINT: use supreclass toString() method to get name)
  - add getManager to return the String value of manager
- Mutators:
  - setWage(double newWage): changes the employee's wage to newWage
  - setHours(int h): changes the employee's hours to h
  - setJobTitle(String title): changes the employee's job title to title
  - giveRaise(): increases the employee's wage by $1 dollar
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
  - add toString: returns manager in form: "Manager: lastName, firstName: title @ $46000.0" (HINT: use supreclass toString() method)
- Mutators:
  - add addDirectReport(Employee employee): adds employee to directReports
  - add removeDirectReport(Employee employee): removes employee from directReports
  - add setDepartment(String dept): set department = dept
  
### CREATE main program OrgChart
main method should exercise your class methods:
- create 2 managers
- create 3 employees and set their manager to the first manager
- set the last employees manager to the second manager
- print out the mangers and their employees - similar to output below:

```
Manager: Flickerman, Caesar: Development Manager @ $114400.0
	Employee: Mellark, Peeta: SR Developer @ $93600.0
	Employee: Everdeen, Katniss: JR Developer @ $72800.0
Manager: Heavensbee, Plutarch: Development Manager @ $114400.0
	Employee: Odair, Finnick: JR Developer @ $72800.0
```