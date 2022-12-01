/*
 * @Program: The application must fulfill the following requirements:
Initially, when the application is executed, only the RED light must be ON.
After 3 seconds, the RED light should turn off and only the GREEN light should turn ON for 5 seconds.
Then, the GREEN light should turn off and only the YELLOW light should turn ON for 2 seconds.
Then, the YELLOW light should turn to RED.
The preceding process should continue, infinitely.
You also need to display the remaining time for each light.
 * 
 * @Author: Dhiraj Kumar
 * @Date: 01/12/2022
 * */

package com.qs2;

public class extend1

{
	public void run()
	{
		System.out.println("RED LIGHT IS ON");
		try {
			Thread.sleep(3000);
			System.out.println("RED LIGHT IS OFF");
			System.out.println("GREEN LIGHT IS ON");
		} catch (InterruptedException e) {
			
			
			
			e.printStackTrace();
		}
		try {
			Thread.sleep(8000);
			System.out.println("GREEN LIGHT IS OFF");
			System.out.println("YELLOW LIGHT IS ON");
		} catch (InterruptedException e) {
			
			
			
			
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(10000);
			System.out.println("YELLOW LIGHT IS OFF");
			System.out.println("RED LIGHT IS ON");
		} catch (InterruptedException e) {
			
			
			
			
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		Thread t1 = new Thread();
	
		t1.start();
		
		

	}

}