  /*
* Program: WAP to generate a table of a given no.
 * @Author: Dhiraj Kumar
 * @Date:28 Oct 2022
 */

package com.Table2;

//Import Scanner Class
import java.util.Scanner;

//Creating a class
public class Table2 {
	
	//Method of generating a table
	static void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" x "+i+" = "+(i*n));//It prints the table
		}
	}// end of method

	
	//Main method starts
	public static void main(String[] args) {
		
		//Object of Scanner class
		Scanner sc=new Scanner(System.in);
		
		//Delaring Variables
		int num;
		System.out.println("Enter a no. to generate table: ");
		num=sc.nextInt();
		
		//Method Calling
		printTable(num);
	}

}