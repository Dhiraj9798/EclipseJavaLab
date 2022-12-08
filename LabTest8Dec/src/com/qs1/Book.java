/*
 * Program: Anna wants to create a Contact book of friends.
 * She needs name,contact number and email of her friends.
 * She don't want duplicates.Help Anna achieve the task.
 * @Author: Dhiraj kumar
 * @Date: 08/12/2022
 * */

package com.qs1;

import java.util.ArrayList;

public class Book

{

	public static void main(String[] args)
	
	{
		ArrayList<String> name = new ArrayList<>();
		
		ArrayList<String> no = new ArrayList<>();
		
		ArrayList<String> email  = new ArrayList<>();
		
		name.add("Dhiraj");
		
		no.add("9798431078");
		
		email.add("dhirajkr474@gmail.com");
		
		name.add("ABC");
		
		no.add("1234567910");
		
		email.add("abc@gmail.com");
		
		System.out.println(name);
		
		System.out.println(no);
		
		System.out.println(email);
		
		
		

	}

}