/*
 * Program: multiply two Matrixes?
 * @Author:Dhiraj Kumar
 * @Date: 10/11/2022
 * */

package com.question1;

//Import scanner class

import java.util.Scanner;


//Create Class

public class MatrixMulti

{

	
	
	//Declaring Variables
	int a[][],b[][],i,j,m,n,k,c;
	
	
	
	
	//Scanner Class Object
	Scanner sc = new Scanner(System.in);
	
	
	
	//Method for Create two matrixes by entering rows and columns
	void create()
	
	
	{
		
		
		
		System.out.println("Enter no. of Rows you want:");
		m = sc.nextInt();
		System.out.println("Enter no. of Columns you want:");
		n = sc.nextInt();
		a = new int[m][n];
		b = new int[m][n];
		
		//Enter 1st Matrix Elements
		System.out.println("Enter 1st Matrix Elements:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		//Enter 2nd Matrix Elements
		System.out.println("Enter 2nd Matrix Elements:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
	}
	
	//Method for display Both the matrixes
	void display()
	{
		
		//For Display 1st Matrix
		System.out.println("\n\n1st Matrix Elements are:");
		for(i=0;i<m;i++)
		{
			
			for(j=0;j<n;j++)
				
				
			{
				
				System.out.print(a[i][j]+"\t");
				
			}
			
		System.out.println();
		}
		
		
		
		
	//For Display 2nd Matrix
		
	System.out.println("\n2nd Matrix Elements are:");
	for(i=0;i<m;i++)
		
		
	{
		
		for(j=0;j<n;j++)
			
			
		{
			
			System.out.print(b[i][j]+"\t");
			
			
		}
	System.out.println();
	}
	
	
	}
	
	
	
	//Method for multiplying both the matrixes and dispaly the output.
	void mul()
	
	
	
	{
		
		
		System.out.println("\n\nMultiply of both Matrixes are:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				c=0;
				for(k=0;k<n;k++)
				{
					c = c+a[i][k]*b[k][j];
				}
			System.out.print(c+"\t");
			}
	System.out.println();
		}
	}
	
	
	
	//Main Method
	public static void main(String args[])
	{
		//Creating the object of class
		MatrixMulti obj = new MatrixMulti();
		
		//Method Calling
		obj.create();
		obj.display();
		obj.mul();
	}//End of Main Method

}//End of Class