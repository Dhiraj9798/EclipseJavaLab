/*
 * Program: WAP to create a package called Employee having ID, name , department and salary .
Create 2 method 
GetDetails()
PrintDetails()
Create a Employee Test class in  a separate package to get the Details of 2 employees and print the details  of both of them"
 * @Author: Dhiraj kumar
 * @Date: 26 Oct 2022
 */

package com.question3Louber;

//Declaring Class
public class Louber {
	
	
	
	// Declaring instance variables
		int Eid;
		String Ename;
		String department;
		float salary;

		
		
		// Method to get the details of Employee
		public void getDetails(int id, String n, String d, float sal) {
			Eid = id;
			Ename = n;
			department = d;
			salary = sal;
			
			
			
		}//End of Method

		
		
		
		// method for print details for Employees
		public void printDetails() {
			System.out.println("Employee Details are:");
			System.out.println("Employee ID:" + Eid);
			System.out.println("Employee Name:" + Ename);
			System.out.println("Employee Department:" + department);
			System.out.println("Employee Salary:" + salary);
			

			
			
		}//End of Method

}//End of Class