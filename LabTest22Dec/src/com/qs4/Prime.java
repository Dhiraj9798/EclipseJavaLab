package com.qs4;

import java.util.Scanner;

public class Prime {
	
	public void prime() {
	int num;
	boolean flag = false;
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	for(int i=2; i<=num/2; i++)
	{
		if(num%i==0)
		{
			flag = true;
			break;
		}
	}
	if(!flag)
	{
		System.out.println(num+" is a Prime Number");
	}
	else
	{
		System.out.println(num+" is not a Prime Number");
	}

}
}