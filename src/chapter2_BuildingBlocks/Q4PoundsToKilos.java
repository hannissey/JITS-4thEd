package chapter2_BuildingBlocks;

import java.util.Scanner;

public class Q4PoundsToKilos 
{
	/* 
	 * BEGIN
	 * 	PROMPT for value in pounds
	 * 	ENTER value in pounds
	 * 	SET value to old value / 2.2
	 * 	DISPLAY value in kilos
	 * BEGIN
	 */
	
	
	public static void main (String[] args)
	{
		double pounds, kilos;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to our Pounds to Kilo converter!");
		System.out.println("Please enter the value in pounds: ");
		pounds = keyboard.nextDouble();
		kilos = pounds / 2.2;
		System.out.println(pounds + " in kilos is " + kilos);
	}
	
}
