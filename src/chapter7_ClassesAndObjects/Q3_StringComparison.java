package chapter7_ClassesAndObjects;

import java.util.Scanner;

/*
 * 3. Adapt the StringComparison program from Sect. 7.6.3, which compares
	two strings, in the following ways:
	(a) Rewrite the program so that it ignores case;
	(b) Rewrite the program, using the equals method, so that all it does is to test
	whether the two strings are the same;
	(c) Repeat (b) using the equalsIgnoreCase method;
	(d) Use the trim method so that the program ignores leading or trailing spaces.
 */

public class Q3_StringComparison {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String string1, string2;
		
		// get two strings from the user
		System.out.println("Enter a string: ");
		string1 = keyboard.next();
		System.out.println("Enter another string: ");
		string2 = keyboard.next();
		
		// ignore case using equalsIgnoreCase
		boolean match = string1.equalsIgnoreCase(string2);
		System.out.println("Are the strings the same ignoring case? " + match);
		
		// ignore case using equalsIgnoreCase
		boolean same = string1.equals(string2);
		System.out.println("Are the strings the same? " + same);
				
		
		// ignore case by changing inputs to lowercase
		string1 = string1.toLowerCase();
		string2 = string2.toLowerCase();
		// remove any white space
		string1 = string1.trim();
		string2 = string2.trim();
		
		// then passes these to the compareTo method
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
