package chapter7_ClassesAndObjects;

import java.util.Scanner;

public class StringMethods 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		// create a new string
		String str;
		
		// get the user to enter a string
		System.out.println("Please enter a string without spaces: ");
		str = keyboard.next();
		
		// display the length of the users string
		System.out.println("The length of the string is: " + str.length());
		
		// display the 3rd character of the user's string
		System.out.println("The 3rd character of the string is: " + str.charAt(2));
		
		// display a selected part of the user's string
		System.out.println("The middle of the string is: " + str.substring(3,9));
		
		// display the user's string joined to another string
		System.out.println("Your string joined with my string is: " + str.concat("bollocks"));
		
		// display the user's string in uppercase
		System.out.println("Your string in uppercase is: " + str.toUpperCase());
		
		// display the user's string in lowercase
		System.out.println("Your string in lowercase is: " + str.toLowerCase());
	}
}
