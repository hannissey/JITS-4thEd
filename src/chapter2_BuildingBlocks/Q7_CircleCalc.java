package chapter2_BuildingBlocks;

import java.util.Scanner;

public class Q7_CircleCalc {

	/*
	 * BEGIN
	 * 	DISPLAY program name
	 * 	PROMPT for value of radius of circle
	 * 	SET radius TO input
	 * 	SET area to 3.1416 * (radius * radius)
	 * 	SET circumference to 2 * 3.1416 * radius
	 * 	DISPLAY area of circle
	 * 	DISPLAY circumference of circle
	 * END
	 */
	
	public static void main (String[] args) 
	{
		// attributes
		double radius, area, circumference;
		final double PI = 3.1416;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello! Welcome to our circle calculator.");
		System.out.println("Please input the radius of your circle.");
		radius = keyboard.nextDouble();
		area = PI * (radius * radius);
		circumference = 2 * PI * radius;
		System.out.println("The area of your circle is " + area);
		System.out.println("The circumference of your circle is " + circumference);
	
	}
}


