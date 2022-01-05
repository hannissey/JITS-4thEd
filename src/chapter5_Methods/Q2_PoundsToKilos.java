package chapter5_Methods;

import java.util.Scanner;

public class Q2_PoundsToKilos 
{
	/* 
	 * BEGIN
	 * 	PROMPT for value in pounds
	 * 	ENTER value in pounds
	 * 	SET value to old value / 2.2
	 * 	DISPLAY value in kilos
	 * BEGIN
	 */
	
	/*	CHAPTER 2 Methods Exercise
	 * 	For one of the programming exercises in Chap. 2, you wrote a program that
		converted pounds to kilograms. Rewrite this program, so that the conversion
		takes place in a separate method which is called by the main method.
	 */
	
	
	public static void main (String[] args)
	{
		double pounds, kilos;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to our Pounds to Kilo converter!");
		System.out.println("Please enter the value in pounds: ");
		pounds = keyboard.nextDouble();
		System.out.println(pounds + " in kilos is " + poundsToKilos(pounds));
	}
	
	static double poundsToKilos(double poundsIn)
	{
			double kilos = poundsIn / 2.2;
			return kilos;
	}
	
}
