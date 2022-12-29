
package com.qs3;

//import scanner class
import java.util.Scanner;

//Class Declaration
public class Sum {

//	method for add digits of number
	void integerSum(int n) {
		int sum = 0;
		for (int i = n; i > 0; i = i / 10) {
			sum = sum + (i % 10);
		}
		System.out.println("Sum of Digits: " + sum);
	}

//	main method
	public static void main(String[] args) {

		// Class Object
		Sum obj = new Sum();

		// Scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int num = sc.nextInt();

//		calling function
		obj.integerSum(num);

	}// main ends

}// class ends