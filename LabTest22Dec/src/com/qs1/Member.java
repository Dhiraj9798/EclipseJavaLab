/*
 * Program: Create a class named 'Member' having the following members:
 * Data members
 * 1 - Name
 * 2 - Age
 * 3 - Phone Number
 * 4 - Address
 * 5 - Salary
 * It also has a method named 'printSalary' which prints the salary of the members.
 * Two classes 'Employee' and 'Manager' inherits the 'Member' class.
 * The 'Employee' and 'Manager' classes have data members 'specialization' and 
 * 'department' respectively. Now, assign name, age, phone number, 
 * address and salary to an employee and a manager by making an object
 * of both of these classes and print the same
 * @Author: Dhiraj  kumar
 * @Date: 23/12/2022
 * */

package com.qs1;

public class Member 


{
	String name;
	int age;
	int PhoneNumber;
	String address;
	int salary;

	void printSalary(int i) {
		System.out.println(salary);
	}

}

class Employee extends Member {
	String Specialization;
	String Department;
}

class Manager extends Member {
	String Specialization;
	String Department;
}