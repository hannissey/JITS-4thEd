package chapter3_selection;

/*
 * DISPLAY program name
 * DISPLAY prompt for first number
 * SET number1 to first number
 * DISPLAY prompt for second number
 * SET number2 to second number
 *  * create a number of calculated results
 * SET guess to guess of sum
 * compare sum with guess
 * IF guess == sum DISPLAY congratulatory message
 * ELSE display COMMISERATION alongside correct answer
 */

import java.util.Scanner;

public class Q3_GuessSum {

	
	public static void main(String[] args)
	{
		int number1, number2, guess, sum;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Guess the result game!");
		System.out.println("Enter first number: ");
		number1 = keyboard.nextInt();
		System.out.println("Enter second number: ");
		number2 = keyboard.nextInt();
		sum = number1 + number2;
		System.out.println("What's your guess?");
		guess = keyboard.nextInt();
		if (guess == sum) {
			System.out.println("You're correct, " + number1 + 
					" + " + number2 + " equals " + sum);
		} else {
			System.out.println("You're wrong! The correct answer is " + sum);
		}
		
	}

}
