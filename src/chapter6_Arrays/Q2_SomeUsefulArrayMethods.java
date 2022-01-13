package chapter6_Arrays;

import java.util.Scanner;

public class Q2_SomeUsefulArrayMethods {
	public static void main(String[] args)
	{
		char choice;
		double averageNumber = 0;
		Scanner keyboard = new Scanner(System.in);
		int[] someArray; // declare integer array
		System.out.print("How many elements to store?:"); // requests length of array
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
					+ "\n[5] Search array with varargs"
					+ "\n[6] Search array"
					+ "\n[7] Display values"
					+ "\n[8] Find average"
					+ "\n[9] Show values greater than average"
					+ "\n[Q] Exit"
			);
			
			// get choice
			System.out.println("\nEnter choice 1-9 or Q to quit: ");
			choice = keyboard.next().charAt(0);
			
			// switch statement to process user choice by calling appropriate methods
			switch(choice)
			{
			case '1': 	fillArray(someArray);
						break;
						
			case '2': 	int max = findMax(someArray);
						// it is better practice to assign the method call to a variable
						// and print the variable
						System.out.println("Maximum array value = " + max);
						break;
						
			case '3': 	int sum = calculateSum(someArray);
						System.out.println("Sum of array values = " + sum);
						break;
						
			case '4': 	System.out.println("Please enter value you wish to find: ");
						int value = keyboard.nextInt();
						boolean found = contains(value, someArray);
						if (found) 
						{
							System.out.println(value + " is in the array.");
						}
						else
						{
							System.out.println(value + " is not in the array.");
						}
						break;
						
			case '5': 	System.out.println("Guess a number in the array: ");
						// here we can call the method using a single value as Case 4
						int guess = keyboard.nextInt();
						containsVarargs(guess, guess, guess);
						break;
						
						
			case '6': 	System.out.println("Please enter the value you wish to locate: ");
						int position = keyboard.nextInt();
						int index = locate(position, someArray);
						if (index == -999)
						{
							System.out.println("This value is not in the array.");
						}
						else 
						{
							System.out.println("This value is located at array index " + index);
						}
						break;
			case '7': 	System.out.println("Array Values");
						displayArray(someArray);
						break;
			case '8': 	averageNumber = findAverage(someArray);
						System.out.println("The average of the array is: " + averageNumber);
						//break; 
						//don't want a break here as the below is relevant
			case '9':	averageValues(averageNumber, someArray);
			}
			
		} while (choice != 'Q');
		System.out.println("Goodbye.");
	}
	
	// methods
	
	// fill array 
	static int[] fillArray(int... arrayIn)
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
	
	static int findMax(int... arrayIn)
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
	
	static int calculateSum(int... arrayIn)
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
	
	static boolean contains(int valueIn, int[] arrayIn)
	{
		// we can also use an enhanced for loop here
		for (int i = 0; i < arrayIn.length; i++)
		{
			if (arrayIn[i] == valueIn) return true;
		} 
		return false;
	}
	
	// FIND VALUE USING VARARGS
	// we need to swap the parameter list round, so the varargs is last in the list
	static void containsVarargs(int... arrayIn)
	{
		System.out.println("\n*** This returns the items in a list ***\n");

		for (double item : arrayIn)
		{
			System.out.println("Item:" + item);
		}
		
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
	
	static int locate(int valueIn, int... arrayIn)
	{
		for (int i = 0; i < arrayIn.length; i++)
		{
			if (arrayIn[i] == valueIn) return i;
		}
		return -999;
	}
	
	// display array
	static void displayArray(int... arrayIn)
	{
		for (int item : arrayIn) 
		{
			System.out.println(item);
		}
	}
	
	// add an additional method to return the average from the array of integers
	// (make use of the sum method to help you calculate the average);
	static double findAverage(int... arrayIn)
	{
		int total = 0; // always initialise running total to 0
		for (int item : arrayIn)
		{
			total = total + item;
		}
		double average = total / arrayIn.length;
		return average;
		
	}
	
	// add one more method to display on the screen all those values greater than
	// or equal to the average.
	static void averageValues(double averageIn, int... arrayIn)
	{
		for (int item : arrayIn)
		{
			if(item >= averageIn) {
				System.out.println("Items greater or equal to the average: " + item);
			}
		}
	}

}
