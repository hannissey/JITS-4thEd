package chapter4_Iteration;

import java.util.Scanner;

// This program demonstrates the use of the 'break' statement inside a 'for' loop

public class SecretNumber {

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		final int SECRET = 27; // secret number
		int num; // to hold user's guess
		boolean guessed = false; // so far number not guessed
		
		System.out.println("You have 3 goes to guess the secret number!");
		System.out.println("HINT: It is a number less than 50.");
		System.out.println();
		
		// look carefully at this loop
		for (int i = 1; i <= 3; i++) // loop repeats 3 times
		{
			System.out.println("Enter guess: ");
			num = keyboard.nextInt();
			if (num == SECRET)
			{
				// to determine that the number guessed is correct, we do two things:
				// set a boolean variable to true to indicate correct guess
				guessed = true;
				// terminate the loop, because the user got the number correct
				break;
			}
		}
		
		// now check to see if the number was guessed correctly or not
		if (guessed) 
		{
			System.out.println("Number guessed correctly!");
		} else {
			System.out.println("Number NOT guessed.");
		}
	}
}
