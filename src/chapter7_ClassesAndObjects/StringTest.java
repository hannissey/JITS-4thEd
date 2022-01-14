package chapter7_ClassesAndObjects;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String name; // declaration of a String object called name
		int age;
		System.out.println("What is your name? ");
		name = keyboard.next(); // the next() method is for String input
		System.out.println("What is your age?");
		age = keyboard.nextInt();
		System.out.println("\nHello " + name);
		// now comes the joke!
		System.out.println("When I was your age I was " + (age + 1));
		
	}
}
