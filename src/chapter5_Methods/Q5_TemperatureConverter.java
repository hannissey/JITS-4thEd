package chapter5_Methods;

import java.util.Scanner;

public class Q5_TemperatureConverter {
	
	/*
	 * Write a menu-driven program that provides three options:
		• the first option allows the user to enter a temperature in Celsius and displays
			the corresponding Fahrenheit temperature;
		• the second option allows the user to enter a temperature in Fahrenheit and
			displays the corresponding Celsius temperature;
		• the third option allows the user to quit.
	 */
	
	// DISPLAY program name
	// DISPLAY menu of options
	// GET menu option from user
	// OPTION 1 
	//		GET Celsius
	//		CONVERT to fahrenheit
	//			(9 * Celsius) / 5 + 32
	//		RETURN Farenheit
	// OPTION 2
	//		GET Fahrenheit
	//		CONVERT to Celsius
	//			(5 * (Fahrenheit - 32) / 9)
	//		RETURN Celsius
	// OPTION 3
	//		Quit
	
	public static void main(String[] args)
	{
		char choice;
		
		do {
			System.out.println("\nWelcome to our temperature converter!"
					+ "\nWhat would you like to do?"
					+ "\n[1] Convert Celsius to Fahrenheit"
					+ "\n[2] Convert Fahrenheit to Celsius"
					+ "\n[3] Quit"
				);	
			
			Scanner keyboard = new Scanner(System.in);
			choice = keyboard.next().charAt(0);
			
			
			
			switch(choice) 
			{
			case '1' : System.out.println("Celsius converted to Fahrenheit is " + celsiusToF());
			break;
			case '2' : System.out.println("Fahrenheit converted to Celsius is " + fahrenheitToC());
			break;
			case '3' : System.out.println("Thank you, goodbye!");
			break;
			default : System.out.println("Please enter 1 - 3");
			}
			
		} while (choice != '3');
		

		
	}
	
	static double celsiusToF() 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter temperature in Celsius: ");
		double celsius = keyboard.nextDouble();
		if (celsius < -273.15) 
			{
				System.out.println("Please enter a number greater than absolute zero: ");
				celsius = keyboard.nextDouble();
			}
		celsius = ((9 * celsius) / 5 ) + 32;
		return celsius;

	}
	
	static double fahrenheitToC()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter temperature in Fahrenheit: ");
		double fahrenheit = keyboard.nextDouble();
		if (fahrenheit < -459.67) 
		{
			System.out.println("Please enter a number greater than absolute zero: ");
			fahrenheit = keyboard.nextDouble();
		}
		fahrenheit = (5 * (fahrenheit - 32) / 9);
		return fahrenheit;	
	}

}
