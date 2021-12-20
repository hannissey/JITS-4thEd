package chapter3_selection;

/*
 * BEGIN
 * 	DISPLAY prompt for first number
 * 	GET first number from user
 * 	SET number1 to first number
 * 	DISPLAY prompt for second number
 *  GET second number from user
 * 	SET number2 to second number
 * 	IF number1 == number2
 *  DISPLAY NUMBERS ARE EQUAL
 *  ELSE
 *  DISPLAY NUMBERS ARE NOT EQUAL
 * END
 */

import java.util.Scanner;

public class Q1_EqualNumbers {
	public static void main(String[] args) {
		
		int number1, number2;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Find out if a two numbers are equal.");
		System.out.println("Please enter a number: ");
		number1 = keyboard.nextInt();
		System.out.println("Please enter number to compare: ");
		number2 = keyboard.nextInt();
		if (number1 == number2)
		{
			System.out.println("NUMBERS ARE EQUAL");
		} else
		{
			System.out.println("NUMBERS ARE NOT EQUAL");
		}
		
		if (number1 > number2) {
			System.out.println("FIRST NUMBER BIGGER");
		} else if (number2 > number1)
		{
			System.out.println("SECOND NUMBER BIGGER");
		} 
	}
}
