package chapter5_Methods;

import java.util.Scanner;

public class ExamplesOfMethods {
	
	public static void main(String[] args)
	{
		int number1, number2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please type in a number: ");
		number1 = keyboard.nextInt();
		
		System.out.println("Please type in another number: ");
		number2 = keyboard.nextInt();
		
		System.out.println("Here we will call some methods that will do some calculations.");
		
		System.out.println("Here is your first number squared: " + square(number1));
		compare(number1, number2);
		System.out.println("This method returns the larger of the two numbers: " + max(number1, number2));
		isEven(number1); // this displays nothing
		System.out.println("Is the number even? " + isEven(number1));
	}
	
	static int square(int numberIn)
	{
		return numberIn * numberIn;
	}

	static void compare(int firstIn, int secondIn)
	{
		if(firstIn > secondIn)
		{
			System.out.println("The first number is larger than the second.");
		}
		else if(secondIn > firstIn)
		{
			System.out.println("The second number is larger than the first.");
		}
		else if(secondIn == firstIn)
		{
			System.out.println("The numbers are the same.");
		}
	}
	
	static int max(int firstIn, int secondIn)
	{ 
		if(firstIn > secondIn)
		 { 
			return firstIn;
		 } 
		else
		 { 
			return secondIn;
		 } 
	} 
	
	static boolean isEven(int numberIn)
	{
		// this expression evaluates to a boolean value
		return (numberIn % 2 == 0);
	}
	


	

}
