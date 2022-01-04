package chapter5_Methods;

import java.util.Scanner;

public class DataEntry2 {
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int year, month, day;
		
		System.out.println("Please enter the year of your birth:");
		displayMessage();
		year = keyboard.nextInt();
		
		System.out.println("Please enter the month of your birth as a number from 1 to 12");
		displayMessage();
		month = keyboard.nextInt();
		
		System.out.println("Please enter the day of your birth as a number from 1 to 31");
		displayMessage();
		day = keyboard.nextInt();
		
		// Verification
		/*
		 * 30 days has September, April, June & November
		 * All the rest have 31
		 * Except February alone
		 * Which has 28 days clear
		 * And 29 in each leap year
		 */
		
		if (month == 2 && day > 29)
			{
				System.out.println("Sorry that date is invalid.");
				System.out.println("Please enter the day of your birth as a number from 1 to 31");
				displayMessage();
				day = keyboard.nextInt();
			}
		else if (month == 9 || month == 4 || month == 6 || month == 11 && day > 30)
		{
			System.out.println("Sorry that date is invalid.");
			System.out.println("Please enter the day of your birth as a number from 1 to 31");
			displayMessage();
			day = keyboard.nextInt();		
				
		}
		
		// more code here
		
		System.out.println("Your information:");
		System.out.println(day + "/" + month + "/" + year);
		
		
		
	}
	
	static void displayMessage()
	{
		System.out.println("Please note that all information supplied is confidential");
		System.out.println("No personal details will be shared with any third party");
	}

}
