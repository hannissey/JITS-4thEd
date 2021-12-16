package chapter2_BuildingBlocks;

import java.util.Scanner;

public class Q2stQ4GuessBirthYear 
{
	public static void main (String[] args)
		{
			Scanner keyboard = new Scanner(System.in);
			int age, bornIn, year = 2021;
			System.out.print("How old are you this year? ");
			age = keyboard.nextInt();
			bornIn = year - age;
			System.out.println("I think you were born in " + bornIn);
		}
}
