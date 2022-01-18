package chapter7_ClassesAndObjects;

import java.util.Scanner;

public class StringExampleWithMethods {

	public static void main(String[] args)
	{
		double d = 0;
		int i = 0;
		String s = "null";
		
		d = enterDouble(d);
		i = enterInt(i);
		s = enterString(s);
		
		displayAll(d,i,s);
	}
	
	static double enterDouble(double doubleIn)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a double: ");
		doubleIn = keyboard.nextDouble();	
		
		return doubleIn;
	}
	
	static int enterInt(int integerIn)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		integerIn = keyboard.nextInt();
		
		return integerIn;
	}
	
	static String enterString(String stringIn)
	{
		Scanner keyboardString = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		stringIn = keyboardString.nextLine();	
		
		return stringIn;
	}
	
	static void displayAll(double doubleIn, int integerIn, String stringIn)
	{
		System.out.print("\nYou entered: "
				+ "\nA double: " + doubleIn
				+ "\nAn integer: " + integerIn
				+ "\nA string: " + stringIn
				);	
	}

}
