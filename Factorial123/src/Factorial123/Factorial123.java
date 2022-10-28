/*
 * Program: WAP in java to find the factorial of a given no.?
 * @Name: Dhiraj Kumar
 * @Date: 28/10/2022
 * */

package Factorial123 ;

//Import Scanner Class
import java.util.Scanner;

//Create Class
public class Factorial123 {
	
	//Method Calling
	static void factorial(int number)
	{
		int fact=1;
		for(int i=2;i<=number;i++)
			fact=fact*i;//Condition to find Factorial
		System.out.println("The Factorial of "+number+" is "+fact);
	}

	//Main Method
	public static void main(String[] args) {
		
		//Scanner Class Object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. to find factorial:");
		int num=sc.nextInt();
		factorial(num);
		

	}//End of main

}//End of class