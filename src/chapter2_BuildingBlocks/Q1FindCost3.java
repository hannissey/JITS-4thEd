package chapter2_BuildingBlocks;

import java.util.Scanner;

public class Q1FindCost3 
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
		price = price * (1 + tax / 100);
		System.out.println("Cost after tax is = " + price);
	}
}
