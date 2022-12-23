package com.qs1;

import java.util.Scanner;

public class Test


{

	public static void main(String[] args)
	
	
	
	{
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Enter Employee Name: ");
		emp.name = sc.next();
		System.out.println("Enter Employee Age: ");
		emp.age = sc.nextInt();
		System.out.println("Enter Employee Phone Number: ");
		emp.PhoneNumber = sc.nextInt();
		System.out.println("Enter Employee Address: ");
		emp.address = sc.next();
		System.out.println("Enter Employee Specialization: ");
		emp.Specialization = sc.next();
		System.out.println("Enter Employee Department: ");
		emp.Department = sc.next();

		System.out.println("------------Employee Details-----------");
		System.out.println("Name: " + emp.name);
		System.out.println("Age: " + emp.age);
		System.out.println("Phone Number: " + emp.PhoneNumber);
		System.out.print("Salary: ");
		emp.printSalary(900000);
		System.out.println("Specialization: " + emp.Specialization);
		System.out.println("Department: " + emp.Department);
		System.out.println("------------------------------------------");

		Manager man = new Manager();
		System.out.println("Enter Manager Name: ");
		man.name = sc.next();
		System.out.println("Enter Manager Age: ");
		man.age = sc.nextInt();
		System.out.println("Enter Manager Phone Number: ");
		man.PhoneNumber = sc.nextInt();
		System.out.println("Enter Manager Address: ");
		man.address = sc.next();
		System.out.println("Enter Manager Specialization: ");
		man.Specialization = sc.next();
		System.out.println("Enter Manager Department: ");
		man.Department = sc.next();

		System.out.println("------------Manager Details-----------");
		System.out.println("Name: " + man.name);
		System.out.println("Age: " + man.age);
		System.out.println("Phone Number: " + man.PhoneNumber);
		System.out.print("Salary: ");
		man.printSalary(1200000);
		System.out.println("Specialization: " + man.Specialization);
		System.out.println("Department: " + man.Department);
		System.out.println("------------------------------------------");

		sc.close();

	}

}