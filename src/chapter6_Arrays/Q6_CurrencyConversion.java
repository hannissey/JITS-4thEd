package chapter6_Arrays;

import java.util.Scanner;

/*
 * PSEUDO CODE
 * BEGIN
 * 	CREATE array[5];
 * 	INVOKE method fillArray
 *		PROMPT user for 5 £ prices to fill array
 *		do I have to RETURN array?
 *	INVOKE method convertCurrency using poundsArray
 *		CALCULATE price from £ to $
 *	DISPLAY poundsArray and dollarsArray
 *	 
 * 	
 */

public class Q6_CurrencyConversion {
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to our Currency Converter!");
		
		int size = getSize();
		// call fillArray
		double[] pounds = fillArray(size);
		double[] dollars = convertArray(pounds, size);
		
		System.out.println("\nProduct Prices in Pounds\n");
		displayArray(pounds);
		double totalPounds = getTotal(pounds);
		System.out.println("TOTAL: £" + totalPounds);
		
		System.out.println("\nProduct Prices in Dollars\n");
		displayArray(dollars);
		double totalDollars = getTotal(dollars);
		System.out.println("TOTAL: $" + totalDollars);
	}
	
	static int getSize()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many product prices would you like to convert?");
		int sizeOut = keyboard.nextInt();
		return sizeOut;
	}
	
	static double[] fillArray(int sizeIn)
	{
		double[] poundsArray = new double[sizeIn];
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 0; i < poundsArray.length; i++)
		{
			System.out.println("Please enter product price " + (i+1) + " in £: ");
			poundsArray[i] = keyboard.nextDouble();
		}
		return poundsArray;
	}
	
	static double[] convertArray(double[] arrayIn, int sizeIn) 
	{
		double[] poundsArray = arrayIn;
		double[] dollarsArray = new double[sizeIn];
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the exchange rate of pounds to dollars: ");
		double exchangeRate = keyboard.nextDouble();
		
		for (int i = 0; i < poundsArray.length; i++)
		{
			for (int j = 0; j < dollarsArray.length; j++)
			{
				dollarsArray[j] = poundsArray[j] * exchangeRate;
			}
		}
		return dollarsArray;
		
	}
	
	static void displayArray(double[] arrayIn)
	{
		for (double item : arrayIn)
		{
			System.out.println(item);
		}
	}
	
	static double getTotal(double[] arrayIn)
	{
		double sumOut = 0;
		for (double item : arrayIn)
		{
			sumOut = sumOut + item;
		}
		return sumOut;
	}
}
