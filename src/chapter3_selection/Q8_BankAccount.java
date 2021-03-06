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

public class Q8_BankAccount {
	public static void main(String[] args)
	{
		char A, B, C, X, choice, response = 'W';
		double deposit, total, interest;
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
			
			System.out.println("Welcome to the HansBankel");
			System.out.println("We offer 4 different types of account:"
					+ "\nAccount A with interest rate of 1.5%"
					+ "\nAccount B with interest rate of 2%"
					+ "\nAccount C with interest rate of 1.5%"
					+ "\nand Account X with interest rate of 5%"
					+ "\n\nWhich account would you like?");
			choice = keyboard.next().charAt(0);

			if (choice == 'A' || choice == 'B' || choice == 'C' || choice == 'X')
			{
				
				
				System.out.println("How much would you like to invest?");
				deposit = keyboard.nextDouble();

				switch (choice) 
				{
				case 'A' : 
					if (deposit < 250) 
					{
						System.out.println("Sorry, the minimum deposit is ?250");
					} else {
						total = deposit + deposit * 0.015;
						interest = deposit * 0.015;
						System.out.println("Your balance after a year would be ?" + total);
						System.out.println("You will have earned " + interest + " in interest.");
					}
					break;
				case 'B' : 
					if (deposit < 1000) 
					{
						System.out.println("Sorry, the minimum deposit is ?250");
					} else {
						total = deposit + deposit * 0.02;
						interest = deposit * 0.02;
						System.out.println("Your balance after a year would be ?" + total);
						System.out.println("You will have earned " + interest + " in interest.");
					}
					break;
				case 'C' : 
					if (deposit < 250) 
					{
						System.out.println("Sorry, the minimum deposit is ?250");
					} else {
						total = deposit + deposit * 0.015;
						interest = deposit * 0.015;
						System.out.println("Your balance after a year would be ?" + total);
						System.out.println("You will have earned " + interest + " in interest.");
					}
					break;
				case 'X' : 
					if (deposit < 5000) 
					{
						System.out.println("Sorry, the minimum deposit is ?5000");
					} else {
						total = deposit + deposit * 0.05;
						interest = deposit * 0.05;
						System.out.println("Your balance after a year would be ?" + total);
						System.out.println("You will have earned " + interest + " in interest.");
					}
					break;
				default :
					System.out.println("Sorry, we do not offer that account.");
				} // switch	
				
				System.out.println("Would you like to continue? Y/N");
				response = keyboard.next().charAt(0);
			} else {
				System.out.println("Sorry, we do not offer that account.");
				System.out.println("Would you like to continue? Y/N");
				response = keyboard.next().charAt(0);
			}
		} while (response == 'Y' || response == 'y');
	} // main
} // class
