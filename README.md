INTERVIEW QN:- WAJP to create unique employees id's for the employees of JPmorgan company 
- Create 5 to 7 object of employees and print the details
-----------------------------------------------------------------------------------------------
- Important Code Logic
private static int randomnum = 700;
this.empid = "JPm" + randomnum++;
----------------------------------------------------------------------------------------------
  OUTPUT :-
Employee name is pranav Empid is JPm700 salary is 80000
Employee name is saras Empid is JPm701 salary is 85000
Employee name is surve Empid is JPm702 salary is 90000
Employee name is singh Empid is JPm703 salary is 50000
Employee name is siddhant Empid is JPm704 salary is 100000
Employee name is saish Empid is JPm705 salary is 40000
Employee name is sahil Empid is JPm706 salary is 300000
Employee name is omkar Empid is JPm707 salary is 60000
---------------------------------------------------------------------------------------------
📌 Project Description

This is a simple Java program that demonstrates the use of the final keyword and static variables in Java.
The program automatically generates a unique Employee ID for each employee using a static counter.

This project helps in understanding basic OOP concepts in Java.
-----------------------------------------------------------------------------------------------
🛠 Technologies Used

Java

Object-Oriented Programming (OOP)
----------------------------------------------------------------------------------------
🔹 How the Program Works

The empid variable is declared as final, so it cannot be changed after assignment.

A static variable randomnum starts from 700.

Every time a new employee object is created, the employee ID is automatically generated.

The ID format is: JPm700, JPm701, JPm702...

The info() method prints employee details.
