package chapter4_Iteration;

import java.util.Scanner;

public class Q7_DisplayStars {

	public static void main(String[] args)
	{
		int size;
		char response;
		
		Scanner keyboard = new Scanner(System.in);
		
		do
		{			
			System.out.println("*** Welcome to our Star Square Generator! ***");
			System.out.println("Please enter how large you would like your Star Square to be: ");
			size = keyboard.nextInt();
			
			// remember the error response goes in the while loop!!
			while (size < 2 || size > 20)
			{
				System.out.println("Sorry, you need to pick a number between 2 and 20.");
				System.out.println("Please enter how large you would like your Star Square to be: ");
				size = keyboard.nextInt();	
			}
			for (int i = 1; i <= size; i++) {
				for (int j = 1; j <= size; j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			
			System.out.println("Would you like another go? Y/N");
			response = keyboard.next().charAt(0);
		} 
		while (response == 'Y' || response == 'y');
		System.out.println("Thank you, goodbye!");
	}
}
