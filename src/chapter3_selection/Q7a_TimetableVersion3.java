package chapter3_selection;

import java.util.Scanner;

public class Q7a_TimetableVersion3 {
	public static void main(String[] args)
	{
		char group;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("*** Lab Times ***");
		System.out.println("Enter your group (A, B or C)");
		group = keyboard.next().charAt(0);
		
		if (group == 'A' || group == 'a')
		{
			System.out.println("10.00am");
		}
		else if (group == 'B' || group == 'B')
		{
			System.out.println("1.00pm");
		}
		else if (group == 'C' || group == 'C')
		{
			System.out.println("11.00am");
		}
		else
		{
			System.out.println("No such group.");
		}
	}
}
