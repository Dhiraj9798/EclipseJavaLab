
	/*
 * @Name: Dhiraj KumAR
 * @Date: 03/11/2022
 * */

package com.ques3;
//importing packages
import java.util.Scanner;
//declaring a class
public class PiggiBankAmount {
	
//creating menu
	static void menu() {
		
		// method to display  the options
		System.out.println("1. Deposit Money");
		System.out.println("2. Exit");
		System.out.println("Enter Choice:");
}
	//main started
	public static void main(String[] args) {
		
		// creating an object of MyPiggiBank
		MyPiggiBank piggi= new MyPiggiBank();
		//creating an object of scanner 
		Scanner sc = new Scanner(System.in);
		//declaring a variable
		int choice = 0;
		//creating a do while loop
		do {
			//calling menu
			menu();
			//taking the choice of user
			choice = sc.nextInt();
			switch (choice) {
			
			case 1:
				// to deposit money
				System.out.println("Enter the amount that you want to add to the piggi bank:");
				double amount = sc.nextDouble();
				System.out.println("Balance :" + piggi.addMoney(amount));
				break;
			case 2:
				// to exit from the choice
				System.exit(0);
				break;
			default:
				//printing the choice
				System.out.println("please enter a valid choice");
			} //end of switch 
			
			//taking input from user to add more money
			System.out.println("Do you want to add more money:(1-yes/0-no)");
			choice = sc.nextInt();

		} while (choice == 1);
		// do while ends

		sc.close();

} //end of main method
		
		} // end of class