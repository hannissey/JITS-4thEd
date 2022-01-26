package chapter8_ImplementingClasses;

import java.util.Scanner;

public class Q3_TestProg {
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Scanner keyboardString = new Scanner(System.in);
		String tempNumber;
		String tempName;
		double tempPrice;
		
		System.out.print("Enter the stock number: ");
		tempNumber = keyboardString.nextLine();
		System.out.print("Enter the name of the item: ");
		tempName = keyboardString.nextLine();
		System.out.print("Enter the price of the item: ");
		tempPrice = keyboard.nextDouble();
		
		// Create a new item of stock using the values that were entered by the user 
		Q3_StockItem item = new Q3_StockItem(tempNumber, tempName, tempPrice);
		
		
		// Increase the total number of items in stock by 5 
		item.increaseTotalStock(5);
		
		int total = item.getTotalStock();
		// doesn't work for trousers though :(
		String s = useS(total);
		String g = useCorrectGrammar(total);
		
		// Display the stock number 
		System.out.print("There " + g + " " + total+ " "
				+ item.getName() + s + " in stock."
				+ "\n\n");
		
		// Display the total price of all items in stock 
		System.out.println(item.calculateTotalPrice());
		
		// Set sales tax for all objects to 10
		Q3_StockItem.setSalesTax(3.5);
		
	}
	
	// method
	public static String useS(int stockIn)
	{
		if (stockIn > 1) 
			{
				return "s";
			}

		return "";
	}
	
	public static String useCorrectGrammar(int stockIn)
	{
		if (stockIn > 1) return "are";
		return "is";
	}

}
