package chapter6_Arrays;

import java.util.Scanner;

public class SomeUsefulArrayMethodsAttempt {
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
			case '1': fillArray(someArray);
			break;
			case '2': System.out.println(findMax(someArray));
			break;
			case '3': System.out.println(calculateSum(someArray));
			break;
			case '4': 
				System.out.println("Please enter value you wish to find: ");
				int value = keyboard.nextInt();
				System.out.println(findValue(someArray, value)); 
			break;
			case '5': 
				System.out.println("Please enter the value you wish to locate: ");
				int position = keyboard.nextInt();
				System.out.println(locate(someArray, position));
			break;
			case '6': displayArray(someArray);
			break;
			}
			
		} while (choice != '7');
		System.out.println("Goodbye.");
	}
	
	// methods
	
	// fill array 
	static int[] fillArray(int[] arrayIn)
	{
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 0; i < arrayIn.length; i++)
		{
			System.out.println("Please enter number " + (i+1) + " of " + arrayIn.length);
			arrayIn[i] = keyboard.nextInt();
		}
		
		return arrayIn;
	}
	
	// find maximum value
	
	/*
	 * 	SET result TO first value in array
	LOOP FROM second element in array TO last element in array
		BEGIN
		IF current element > result
			BEGIN
			SET result TO current element
			END
		END
	RETURN result
	 */
	
	static int findMax(int[] arrayIn)
	{
		int result = arrayIn[0];
		for (int i = 1; i < arrayIn.length; i++)
		{
			if (arrayIn[i] > result) result = arrayIn[i]; 
		}
		return result;
	}
	
	// calculate total
	
	/*
	 * 	SET total TO zero
	LOOP FROM first element in array TO last element in array
		BEGIN
			SET total TO total + value of current element
		END
	RETURN total
	 */
	
	static int calculateSum(int[] arrayIn)
	{
		int total = 0; // always initialise a running total to 0
		for (int item : arrayIn)
		{
			total = total + item;
		}
		return total;
	}
	
	// find value in array
	
	/*
	 *  LOOP FROM first element in array TO last element in array
			BEGIN
				IF current element = item to find
					BEGIN
						EXIT loop and RETURN true
					END
			END
		RETURN false
	 */
	
	static boolean findValue(int[] arrayIn, int valueIn)
	{
		// we can also use an enhanced for loop here
		for (int i = 0; i < arrayIn.length; i++)
		{
			if (arrayIn[i] == valueIn) return true;
		} 
		return false;
	}
	
	// locate position
	
	/*
	 * LOOP FROM first element in array TO last element in array
		BEGIN
		IF current element = item to find
		BEGIN
		EXIT loop and RETURN current index
		END
		END
		RETURN -999
	 */
	
	static int locate(int[] arrayIn, int valueIn)
	{
		for (int i = 0; i < arrayIn.length; i++)
		{
			if (arrayIn[i] == valueIn) return i;
		}
		return -999;
	}
	
	// display array
	static void displayArray(int[] arrayIn)
	{
		for (int item : arrayIn) 
		{
			System.out.println(item);
		}
	}

}
