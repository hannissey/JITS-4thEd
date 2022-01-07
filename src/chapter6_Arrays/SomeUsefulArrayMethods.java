package chapter6_Arrays;

import java.util.Scanner;

public class SomeUsefulArrayMethods {
	public static void main(String[] args)
	{
		char choice;
		Scanner keyboard = new Scanner(System.in);
		int[] someArray; // declare integer array
		System.out.print("How many elements to store?"); // requests length of array
		int size = keyboard.nextInt();
		// use the user specified size to allocate memory to array
		someArray = new int[size];
		
		
		
		do
		{
			// menu
			System.out.print("\n" 
					+ "[1] Enter values"
					+ "\n[2] Find maximum"
					+ "\n[3] Calculate sum"
					+ "\n[4] Check membership"
					+ "\n[5] Search array"
					+ "\n[6] Display values"
					+ "\n[7] Exit"
			);
			
			// get choice
			System.out.println("Enter choice 1-7: ");
			choice = keyboard.next().charAt(0);
			
			// switch statement to process user choice by calling appropriate methods
			switch(choice)
			{
			case '1': // methodName(someArray);
			break;
			case '2': // methodName(someArray);
			break;
			case '3': // methodName(someArray);
			break;
			case '4': // methodName(someArray);
			break;
			case '5': // methodName(someArray);
			break;
			case '6': // methodName(someArray);
			break;
			}
			
		} while (choice != '7');
		System.out.println("Goodbye.");
	}
	
	// methods
}
