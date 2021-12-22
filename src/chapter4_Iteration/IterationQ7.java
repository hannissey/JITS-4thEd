package chapter4_Iteration;

import java.util.Scanner;

public class IterationQ7
{
	public static void main(String[] args)
	{
		int num, square;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = keyboard.nextInt();
		System.out.print("Enter the square of this number: ");
		square = keyboard.nextInt();
		// loop to check answer
		while (square * square != num)
		{
			System.out.println("Wrong answer, try again.");
			square = keyboard.nextInt();
		}
		System.out.println("Well done, right answer!");
	}
}
