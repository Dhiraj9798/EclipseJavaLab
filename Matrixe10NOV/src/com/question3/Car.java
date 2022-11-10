/*
 * Program: get car model and name ,then print as constant
 * @Author: Dhiraj Kumar
 * @Date: 10/11/2022
 * */
package com.question3;




import java.util.Scanner;



public class Car

{
	static Scanner sc = new Scanner(System.in);
	
	
	String name,model;
	
	//Method to enter Car Details
	void getCarDetails()
	{
		System.out.println("Enter Car Company Name:");
		name = sc.next();
		System.out.println("Enter Car Model Name:");
		model = sc.next();
	}
	
	//Method for display Car Details
	void display()
	{
		System.out.println("Company: "+name+"\nModel:"+model);
	}

	public static void main(String[] args) {
		
		//Declaring Variables
				int i,n;
				System.out.println("Enter no. of car do you want to enter:");
				n = sc.nextInt();
				
				//Creating object of CarModel class
				Car obj[] = new Car[n];
				
				//This loop is for entering car details
				for(i=0;i<n;i++)
				{
					obj[i] = new Car();	//creating obj[0],obj[1],obj[2]......as object of StudentRecord class
					System.out.println("\nEnter data of Car "+(i+1)+"\n");
					obj[i].getCarDetails();
				}
				
				
				System.out.println("****************************************************");
				System.out.println("Car Details:");
				System.out.println("----------------------------------------------");
				
				//This loop is for display car Details
				for(i=0;i<n;i++)
				{
					obj[i].display();
					System.out.println("-------------------------------------------");
				}

	}

}