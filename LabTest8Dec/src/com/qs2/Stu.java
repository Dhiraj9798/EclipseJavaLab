/*
 * Program: Identify the student(name) with the help of thier id(unique) from the 
 * 			generic list of students
 * @Author:Dhiraj kumar
 * @Date: 08/12/2022
 * */
package com.qs2;

import java.util.ArrayList;
import java.util.List;

public class Stu

{

	public static void main(String[] args) 
	
	
	{
		List<Integer> id = new ArrayList<>();
		
		List<String> name = new ArrayList<>();
		
		id.add(1);
		name.add("Dhiraj");
		id.add(2);
		name.add("Rohit");
		id.add(3);
		name.add("Suvam");
		id.add(4);
		name.add("Arya");
		id.add(5);
		name.add("Mahi");
		System.out.println("ID's: "+id+"\n"+"Name: "+name);
		

	}

}