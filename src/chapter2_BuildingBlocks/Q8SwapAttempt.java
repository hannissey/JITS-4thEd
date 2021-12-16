package chapter2_BuildingBlocks;

import java.util.Scanner;

public class Q8SwapAttempt {
	
		public static void main (String[] args)
		{
			Scanner keyboard = new Scanner(System.in);
			
			// declare variables
			int x, y, temp = 0;
			// enter values
			System.out.print("Enter value for x ");
			x = keyboard.nextInt();
			System.out.print("Enter value for y ");
			y = keyboard.nextInt();
			
			// code attempting to swap two variables
			
			temp = x; 	// temp now holds 1
			x = y;		// x now holds 2
			y = temp;	// y now holds 1
			
			// display results
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}

}
