package chapter5_Methods;

import java.util.Scanner;

public class Q3_RectangleCalculator {
/*
 * 	BEGIN
		DISPLAY program title
		DISPLAY prompt for length
		ENTER length
		DISPLAY prompt for height
		ENTER height
		SET area TO length * height
		SET perimeter TO (length + height) * 2
		DISPLAY area
		DISPLAY perimeter
	END
 */
	
	public static void main (String[] args) {
		
		double length, height;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to RECTANGLE CALCULATOR!");
		System.out.println("Please enter length: ");
		length = keyboard.nextDouble();
		System.out.println("Please enter height: ");
		height = keyboard.nextDouble();
		
		
		System.out.println("Area of rectangle: " + area(length, height));
		System.out.println("Perimeter of rectangle: " + perimeter(length, height));
		
	}
	
	static double area(double lengthIn, double heightIn)
	{
		double area = lengthIn * heightIn;
		return area;
	}
	
	static double perimeter(double lengthIn, double heightIn)
	{
		double perimeter = (lengthIn + heightIn) * 2;
		return perimeter;
	}
}
