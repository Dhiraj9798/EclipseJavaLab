
/* 
 * @Author: Dhiraj Kumar
 * @Date: 01/12/2022
 * */
package com.qs3;

public class Vehicle 

{

	public static void main(String[] args)
	
	{
		
		Thread M = new Thread();
		Thread N = new Thread();
		Thread O = new Thread();
		Thread P = new Thread();
		Thread Q = new Thread();
		M.start();
		try {
			Thread.sleep(100);
			System.out.println("BIKE");
			System.out.println("Start ");
			Thread.sleep(200);
			System.out.println("Arrived l");
			Thread.sleep(100);
			System.out.println("Entered ");
			Thread.sleep(100);
			System.out.println("Exited ");
			System.out.println("Cross the Bridge");
			Thread.sleep(5000);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		N.start();
		try {
			Thread.sleep(5600);
			System.out.println("BIKE B");
			System.out.println("Start ");
			Thread.sleep(5800);
			System.out.println("Arrived");
			Thread.sleep(5900);
			System.out.println("Entered ");
			Thread.sleep(6000);
			System.out.println("Exited ");
			System.out.println("Cross the Bridge");
			Thread.sleep(11000);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		O.start();
		try {
			Thread.sleep(11100);
			System.out.println("BIKE C");
			System.out.println("Start ");
			Thread.sleep(11300);
			System.out.println("Arrived ");
			Thread.sleep(11400);
			System.out.println("Entered ");
			Thread.sleep(11500);
			System.out.println("Exited ");
			System.out.println("Cross the Bridge");
			Thread.sleep(16500);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		P.start();
		try {
			Thread.sleep(16600);
			System.out.println("BIKE D");
			System.out.println("Start ");
			Thread.sleep(16800);
			System.out.println("Arrived ");
			Thread.sleep(16900);
			System.out.println("Entered ");
			Thread.sleep(17000);
			System.out.println("Exited ");
			System.out.println("Cross the Bridge");
			Thread.sleep(22000);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Q.start();
		try {
			Thread.sleep(22100);
			System.out.println("BIKE E");
			System.out.println("Start ");
			Thread.sleep(22300);
			System.out.println("Arrived ");
			Thread.sleep(22400);
			System.out.println("Entered ");
			Thread.sleep(22500);
			System.out.println("Exited ");
			System.out.println("Cross the Bridge");
			Thread.sleep(27500);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}