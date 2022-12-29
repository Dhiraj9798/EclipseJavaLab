/*
 * Program: Write a Java program to convert a decimal number to binary number.
 * @Name:Dhiraj Kumar
 * @Date: 29/12/2022
 * */

package com.qs1;


import java.util.Scanner;


public class Binary 


{


	void decToBin(int n) {
		// array to store binary number
		int[] binNum = new int[30];

		// counter for binary array
		int i = 0;
		while (n > 0) {
			binNum[i] = n % 2;
			n = n / 2;
			i++;
		}

		for (int j = i - 1; j >= 0; j--)
			System.out.print(binNum[j]);
	}

	// main method
	public static void main(String[] args) {

		// Object of class
		Binary obj = new Binary();

		// Scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a decimal no.: ");
		int num = sc.nextInt();
		System.out.println("Decimal No.: " + num);
		System.out.print("Binary No.: ");

		// function calling
		obj.decToBin(num);
		sc.close();
	} // main ends

} // class ends