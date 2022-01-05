package chapter5_Methods;

/*
 *  
 * 	Design and implement a program that converts a sum of money to a different
	currency. The amount of money to be converted, and the exchange rate, are
	entered by the user. The program should have separate methods for:
	• obtaining the sum of money from the user;
	• obtaining the exchange rate from the user;
	• making the conversion;
	• displaying the result.
	
		// Pseudocode
	
	// DISPLAY program name
	// DISPLAY prompt for amount
	// METHOD getAmount
	// 	GET input
	// 	SET amount to input
	//	RETURN amount
	// DISPLAY prompt for exchange rate
	// METHOD getRate
	//	GET input
	// 	SET exchange rate to input
	//	RETURN rate
	// METHOD convert (amount, rate)
	// 	MULTIPLY amount BY exchange rate
	//	RETURN result
	// METHOD displayResult
	//	RETURN result
	// DISPLAY result
	
	/*
	 * To convert from the base currency, we multiply by the exchange rate.
	 * 10.00 converted from GBP to EUR is 11.95
	 * Exchange rate is 1.19
	 *
 */

import java.util.Scanner;

public class Q4_CurrencyConverter {
	
	public static void main(String[] args) {
		
		char choice;
		double amount, rate;
		
		do {
			System.out.print("Welcome to our Currency Converter!\n");
			amount = getAmount();
			rate = getRate();
			convert(amount, rate);
			System.out.println("Your converted currency is: " + displayResult(amount, rate));
			System.out.println("Would you like to convert another sum of money? Y/N");
			Scanner keyboard = new Scanner(System.in);
			choice = keyboard.next().charAt(0);
		} while (choice == 'Y' || choice =='y');
		System.out.println("Thank you, goodbye.");

	}
	
	static double getAmount()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the amount you wish to convert: ");
		double amount = keyboard.nextDouble();	
		return amount;
	}
	
	static double getRate()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the exchange rate: ");
		double rate = keyboard.nextDouble();	
		return rate;
	}
	
	static double convert(double amountIn, double rateIn)
	{
		double result = amountIn * rateIn;
		return result;
	}
	
	static double displayResult(double amountIn, double rateIn)
	{
		double result = convert(amountIn, rateIn);
		return result;
	}

}
