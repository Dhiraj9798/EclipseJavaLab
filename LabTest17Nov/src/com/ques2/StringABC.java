/*
 * Program: write 5 functions of string in java program
 * @Author: Dhiraj kumar
 * @Date: 17/11/2022
 * */

package com.ques2;

import java.util.Scanner;

public class StringABC


{
	Scanner sc = new Scanner(System.in);
	
	
	
	void upperCase()
	{
		String str1="c&c++ is a easy programming Language";
		System.out.println(str1.toUpperCase());
	}
	
	
	void Length()
	
	
	{
		String str2="I am going to Ranchi";
		System.out.println("Length of String: "+str2.length());
	}
	
	
	void IndexOf()
	{
		
		
		String str3 = "We are going to puri";
		System.out.println(str3.indexOf("going"));
	}
	
	
	void CharAt()
	{
		
		
		String str4 = "Java is object oriented programming language";
		System.out.println(str4.charAt(6));
	}
	
	void Equals()
	
	
	{
		
		
		String Str5 = "Hi";
		String Str6 = "Hello";
		String Str7 = "what is your name";
		System.out.println(Str5.equals(Str6)); // Returns true because they are equal
		System.out.println(Str5.equals(Str7)); // false
	}

	
	
	public static void main(String[] args) {
		
		
		 StringABC obj = new  StringABC();
		obj.upperCase();
		obj.Length();
		obj.IndexOf();
		obj.CharAt();
		obj.Equals();
		

	}

}