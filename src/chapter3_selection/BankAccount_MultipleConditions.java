package chapter3_selection;

/*
 * BEGIN
 * 	DISPLAY program name
 * 	DISPLAY list of options (accounts)
 * 	DISPLAY prompt for account choice
 * 	SET choice to account choice
 * 	DISPLAY prompt for deposit amount
 * 	SET deposit to deposit amount
 * 	SWITCH choice
 * 		DISPLAY deposit * interest rate / 100
 * END
 * 	
 */

import java.util.Scanner;

public class BankAccount_MultipleConditions {
	public static void main(String[] args)
	{
		char A, B, C, X, choice;
		double deposit, total, interest;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to the HansBankel");
		System.out.println("We offer 4 different types of account:"
				+ "\nAccount A with interest rate of 1.5%"
				+ "\nAccount B with interest rate of 2%"
				+ "\nAccount C with interest rate of 1.5%"
				+ "\nand Account X with interest rate of 5%"
				+ "\n\nWhich account would you like?");
		choice = keyboard.next().charAt(0);
		
		if (choice != 'A') 
		{
			System.out.println("Sorry, we do not offer that account.");
		} else {
			System.out.println("How much would you like to invest?");
			deposit = keyboard.nextDouble();
			
			if (choice == 'A' && deposit < 1000) {
				System.out.println("Sorry, you need a minimum deposit of £1000.");
				System.out.println("How much would you like to invest?");
				deposit = keyboard.nextDouble();
			} else {
				total = deposit + deposit * 0.015;
				interest = deposit * 0.015;
				System.out.println("Your balance after a year would be £" + total);
				System.out.println("You will have earned " + interest + " in interest.");
			}
			
			switch (choice) 
			{
			case 'A' : 

				break;
			case 'B' : 
				total = deposit + deposit * 0.02;
				interest = deposit * 0.02;
				System.out.println("Your balance after a year would be £" + total);
				System.out.println("You will have earned " + interest + " in interest.");
				break;
			case 'C' : 
				total = deposit + deposit * 0.015;
				interest = deposit * 0.015;
				System.out.println("Your balance after a year would be £" + total);
				System.out.println("You will have earned " + interest + " in interest.");
				break;
			case 'X' : 
				total = deposit + deposit * 0.05;
				interest = deposit * 0.05;
				System.out.println("Your balance after a year would be £" + total);
				System.out.println("You will have earned " + interest + " in interest.");
				break;
			default :
				System.out.println("Sorry, we do not offer that account.");
			}		
		}
	
	}
}
