/*
 * @Author: Dhiraj Kumar
 * @Date: 15/12/2022
 * */


package com.qs1;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Product


{

	// Main Method
	public static void main(String[] args) throws IOException {

		// Scanner Class Object
		Scanner sc = new Scanner(System.in);

		// Enter Details of product
		System.out.println("Enter Product ID: ");
		String productID = sc.next();
		System.out.println("Enter Product Name: ");
		String productName = sc.next();
		System.out.println("Enter Product Price: ");
		String productPrice = sc.next();

	
		FileWriter fw = new FileWriter("D:\\Details Directory/ProductDetails.txt");

		// Calling FileWriter with his object for writing in a file
		fw.write(productID + "\n" + productName + "\n" + productPrice);
		fw.close();
		sc.close();

	}

}