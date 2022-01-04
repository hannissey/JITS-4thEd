package chapter5_Methods;

import java.util.Scanner;

public class FindCost4 {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double price, tax;
		
		System.out.println("*** Product Price Check ***");
		
		System.out.println("Enter initial price: ");
		price = keyboard.nextDouble();
		System.out.println("Enter tax rate: ");
		tax = keyboard.nextDouble();
		
		price = addTax(price, tax); // call the addTax method
		// here we have assigned the method to a variable, so whatever the
		// method returns will be stored in price.
		System.out.println("Cost after tax = " + price);
	}
	
	static double addTax(double priceIn, double taxIn)
	{
		return priceIn * (1 + taxIn/100);
	}
}
