package chapter3_selection;

import java.util.Scanner;

public class Timetable {
	public static void main(String[] args) 
	{
		char group; 
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("*** Lab Times ***");
		System.out.println("Enter your group (A, B or C)");
		group = keyboard.next().charAt(0);
		
		// check tutorial group and display relevant time
		if (group == 'A')
		{
			System.out.println("10.00 am");
		}
		else
		{
			if (group == 'B')
			{
				System.out.println("11.00 am");
			}
			else 
			{
				if (group == 'C')
				{
					System.out.print("11.00 am");
				}
				else
				{
					System.out.print("No such group.");
				}
			}
		}
	}
}
