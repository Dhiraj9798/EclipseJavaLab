
/*
 * Program: Create a calculator application in Java that will accept two numbers. 
 * @Author: Dhiraj kumar
 * 
 * */

package com.ques4;

import java.util.Scanner;
public class Cal


 {
	public static void main(String args[])
	{
		int x,y,z;
		
		Scanner sc = new Scanner(System.in);
		try 
		{
		System.out.println("Enter two nos. : ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Choose the following operations :-");
		System.out.println("Addition: 1\n"+"Subtraction: 2\n"+"Multiplication: 3\n"+"Division: 4");
		z = sc.nextInt();
		switch(z)
		
		{
			case 1:
				System.out.println("Add: "+ (x+y));
				break;
			case 2:
				System.out.println("Sub: "+ (x-y));
				break;
			case 3:
				System.out.println("Mul: "+ (x*y));
				break;
			case 4:
				System.out.println("Div: "+ (x/y));
				break;
			default:
				System.out.println("Invalid Choice");
				break;
		}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		sc.close();
		
	}
}