package chapter6_Arrays;

import java.util.Scanner;

public class MonthlyTemperatures {

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		char choice;
		
		// create 2d array
		double[][] temperature = new double [4][7];
		
		// offer menu
		do
		{
			System.out.println("\n*** MENU ***"
				+ "\n[1] Enter temperatures"
				+ "\n[2] Display all"
				+ "\n[3] Display one week"
				+ "\n[4] Display day of the week"
				+ "\n[5] Exit"
				+ "\nEnter choice [1-5]"
			);
			
			choice = keyboard.next().charAt(0);
			
			// process choice by calling methods
			switch (choice)
			{
				case '1': 	enterTemps(temperature);
							break;
				case '2': 	displayAllTemps(temperature);
							break;
				case '3': 	displayWeek(temperature);
							break;
				case '4': 	displayDays(temperature);
							break;
				case '5': 	System.out.println("Goodbye");
							break;
				default: System.out.println("\nError! Options 1-5 only");
			}
				
		} while(choice != 5);
	}
	
	// methods
	
	// method to enter temperatures into the 2D array requires a nested loop
	static void enterTemps(double[][] temperatureIn)
	{
		Scanner keyboard = new Scanner(System.in);
		// the outer loop controls the week number
		for (int week = 1; week <= temperatureIn.length; week++)
		{
			// the inner loop controls the day number
			for (int day = 1; day <= temperatureIn[0].length; day++)
			{
				System.out.println("Enter temperature for week " + week + " and day " + day);
				temperatureIn[week-1][day-1] = keyboard.nextDouble();
			}
		}
	}
	
	// method to display all temperatures in the 2D array requires a nested loop
	static void displayAllTemps(double[][] temperatureIn)
	{
		System.out.println("\n*** TEMPERATURES ENTERED ***\n");
		// the outer loop controls the week number
		for (int week = 1; week <= temperatureIn.length; week++)
		{
			// the inner loop controls the day number
			for (int day = 1; day <= temperatureIn[0].length; day++) 
			{
				System.out.println("week " + week + " day " + day + ": " + temperatureIn[week-1][day-1]);
			}
		}
	}
	
	// method to display temperatures for a single week requires a single loop
	static void displayWeek(double[][] temperatureIn)
	{
		Scanner keyboard = new Scanner(System.in);
		int week;
		// enter week number
		System.out.println("Enter week number 1 - 4: ");
		week = keyboard.nextInt();
		// input validation, week number should be between 1 and 4
		while(week < 1 || week > 4)
		{
			System.out.println("Invalid week number!!\nEnter again (1-4 only)");
			week = keyboard.nextInt();
		}
		// display temperatures for given week
		System.out.println("\n***TEMPERATURES ENTERED FOR WEEK " + week + "***\n");
		// week number is fixed so loop required to process day numbers only
		for (int day = 1; day <= temperatureIn[0].length; day++)
		{
			System.out.println("week " + week + "day " + day + ":" + "temperatureIn[week-1][day-1]");
		}
	}
	
	// method to display temperatures for a single day of each week requires a single loop
	static void displayDays(double[][] temperatureIn)
	{
		Scanner keyboard = new Scanner(System.in);
		int day;
		// enter day number
		day = keyboard.nextInt();
		
		// input validation
		while (day < 1 || day > 7)
		{
			System.out.println("Invalid day number!! \nEnter Again (1-7 only)");
			day = keyboard.nextInt();
		}
		
		// display temperatures for given day of the week
		System.out.println("\n*** TEMPERATURES ENTERED FOR DAY " + day + "***\n");
		
		// day number is fixed so loop required to process week numbers only
		for (int week = 1; week <= temperatureIn.length; week++)
		{
			System.out.println("Week " + week + " day " + day + ": " + temperatureIn[week-1][day-1]);
		}
	}
}
