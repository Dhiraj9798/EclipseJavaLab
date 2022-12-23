package com.qs2;

import java.util.Scanner;

public class Palindrome {
	
	public void palindrome()
	{
		int num, temp, r, sum=0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		temp = num;
		while(num>0)
		{
			r = num%10;
			sum = (sum*10) + r;
			num = num/10;
		}
		if(temp == sum)
		{
			System.out.println(temp+" is a Palindrome Number");
		}
		else
		{
			System.out.println(temp+" is not a Palindrome Number");
		}
	}

}