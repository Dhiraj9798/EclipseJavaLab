/*
 * Employee Test 
 * @Author: Dhiraj kumar
 * @Date:26 Oct 2022
 */

package com.question3Test;

//Import Scanner Class
import java.util.Scanner;

//Creating a Class
public class LouberTest {

	public static void main(String[] args) {
		
		// Create the object of EmployeeDetails class
				LouberTest emp = new LouberTest();

				// Declare an object of Scanner class
				Scanner sc = new Scanner(System.in);

				// Declaring variables
				int id;
				String name, department;
				float salary;

				// Taking an input of employees details
				System.out.println("Enter Employee's Name:");
				name = sc.nextLine();
				System.out.println("Enter Employee's Id:");
				id = sc.nextInt();
				System.out.println("Enter Employee's Department:");
				department = sc.next();
				System.out.println("Enter Employee's Salary:");
				salary = sc.nextFloat();

				
				// call the method
				emp.getDetails(id, name, department,salary);

				

				System.out.println("**********************************************************");

				// Print the details
				emp.printDetails();

				sc.close();

	}//End of main

	private void printDetails() {
		// TODO Auto-generated method stub
		
	}

	private void getDetails(int id, String name, String department, float salary) {
		// TODO Auto-generated method stub
		
	}

}//End of class