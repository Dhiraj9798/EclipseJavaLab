/*
 * Program: wap to to print duplicate characters in a given string.
 * @Name: Dhiraj Kumar
 * @Date: 29/12/2022
 * */

package com.qs2;

import java.util.Scanner;

public class Duplicate

{

	void duplicate(String string) {
		String dup = "";
		for (int i = 0; i < string.length(); i++) {

			for (int j = 0; j < string.length(); j++) {
				if (string.charAt(i) == string.charAt(j)) {
					dup = dup + string.charAt(i);
				}

			}
		}
		System.out.print("Duplicate Characters: " + dup);
	}

	public static void main(String[] args) {
//		scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.next();

//		class object
		Duplicate obj = new Duplicate();

//		function calling
		obj.duplicate(str);
		sc.close();

	}

}