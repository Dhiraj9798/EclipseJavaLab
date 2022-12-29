/*
 * Program: Write a Java program to reverse a string without using StringBuffer and StringBuilder
 * @Date: 29/12/2022
 * */

package com.qs4;

//import scanner class
import java.util.Scanner;

//Class declare
public class Rev {

//	function for reversing string
	void revString(String string) {
		System.out.print("Reversed String: ");
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
	}

//	main method
	public static void main(String[] args) {

//		scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.next();

//		class object
		Rev ob = new Rev();


		ob.revString(str);
		sc.close();
	}

}