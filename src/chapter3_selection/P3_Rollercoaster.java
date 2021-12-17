package chapter3_selection;

import java.util.Scanner;

public class P3_Rollercoaster {
	public static void main (String[] args)
	{
		// declare variables
		int age;
		Scanner keyboard = new Scanner(System.in);
		
		// four instructions to process information
		System.out.println("How old are you? ");
		age = keyboard.nextInt();
		if (age <= 13) {
			System.out.println("Hello Junior!");
		} else {
			System.out.println("Hello Adult!");
		}
		
		System.out.println("Enjoy your ride!");
	}
}
