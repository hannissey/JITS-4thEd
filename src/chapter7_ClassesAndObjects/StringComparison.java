package chapter7_ClassesAndObjects;

import java.util.Scanner;

public class StringComparison {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String string1, string2;
		
		
		// get two strings from the user
		System.out.println("Enter a string: ");
		string1 = keyboard.next();
		System.out.println("Enter another string: ");
		string2 = keyboard.next();
		
		compareStrings(string1, string2);
		

	}
	
	static void compareStrings(String string1In, String string2In)
	{
		// compare the strings
		// remember that compareTo() returns an integer on whether an object comes
		// before or after it in the alphabet. it will go through each letter until 
		// finding a difference. If the strings are identical, it returns 0
		int comparison;
		comparison = string1In.compareTo(string2In);
		if(comparison < 0) // compareTo returned a negative number
		{
			System.out.println(string1In + " comes before " + string2In + " in the alphabet ");
		} else if(comparison > 0)
		{
			System.out.println(string2In + " comes before " + string1In + " in the alphabet ");
		} else // compareTo returned 0
		{
			System.out.println("The strings are identical.");
		}	
	}
}
