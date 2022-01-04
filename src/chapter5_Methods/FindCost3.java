package chapter5_Methods;

import java.util.Scanner;

public class FindCost3 
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double price, tax;
		
		System.out.println("*** Product Price Check ***");
		System.out.println("Enter initial price: ");
		price = keyboard.nextDouble();
		System.out.println("Enter tax rate: ");
		tax = keyboard.nextDouble();
		
		// We've replaced this line with a method, below
		//price = price * (1 + tax / 100);
		
		System.out.println("Cost after tax is = " + calculateTax(price, tax));
	}
	
	static double calculateTax(double priceIn, double taxIn)
	{
		return priceIn * (1 + taxIn / 100);
	}
}
