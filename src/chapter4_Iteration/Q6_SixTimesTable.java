package chapter4_Iteration;

import java.util.Scanner;

public class Q6_SixTimesTable {
	
	public static void main(String[] args)
	{
		int sum, table;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of the mutiplication table you would like to see: ");
		table = keyboard.nextInt();
		
		// remember to put the undesirable input response INSIDE the while loop
		while (table < 2 || table > 12) 
		{
			System.out.println("Please enter a number between 1 and 12: ");
			table = keyboard.nextInt();	
		}

		for (int i = 1; i <= 12; i++)
		{
			sum = i * table;
			System.out.println(i + " x " + table + " = " + sum);
		}	
	}
	

}
