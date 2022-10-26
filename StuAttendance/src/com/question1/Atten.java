/*
 * Program: . A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not."
*@Author: Dhiraj kumar
*@Date: 26 Oct 2022
* */

package com.question1;

//import Scanner Class
import java.util.Scanner;

//Create Class
public class Atten {
	
	//Method Calling
		 static void per(float tc,float ca)
		 {
			 float percent=(ca*100)/tc;//Calculating the percentage
			 
			 if(percent>=75)
				 System.out.println("Your Attendance is "+percent+"% So you are eligiable in exams.");
			 else
				 System.out.println("Your Attendance is "+percent+"% So you are not eligiable in exams.");
		 } //Method End

	public static void main(String[] args) {
		 //Scanner class object 
		 Scanner sc=new Scanner(System.in);
		 
		 //Declaring Variables
		 int totalclass,classatd;
		 System.out.println("Enter no. of classes happed:");
		 totalclass=sc.nextInt();
		 System.out.println("Enter no. of classes you've attend:");
		 classatd=sc.nextInt();
		 
		 per(totalclass,classatd);

	}//Main method ends

}//End of class