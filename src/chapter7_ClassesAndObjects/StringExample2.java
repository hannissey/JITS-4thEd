package chapter7_ClassesAndObjects;

import java.util.Scanner;

public class StringExample2 {

	public static void main(String[] args)
	{
		double d;
		int i;
		String s;
		
		Scanner keyboardString = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a double: ");
		d = keyboard.nextDouble();
		
		System.out.println("Enter an integer: ");
		i = keyboard.nextInt();
		
		System.out.println("Enter a string: ");
		s = keyboardString.nextLine();
		
		System.out.print("\nYou entered: "
				+ "\nA double: " + d
				+ "\nAn integer: " + i
				+ "\nA string: " + s
				);

	}

}
