package chapter2_BuildingBlocks;

import java.util.Scanner;

public class Q3stQ7RectangleCalculator {
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
		
		double length, height, perimeter, area;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to RECTANGLE CALCULATOR!");
		System.out.println("Please enter length: ");
		length = keyboard.nextDouble();
		System.out.println("Please enter height: ");
		height = keyboard.nextDouble();
		area = length * height;
		perimeter = (length + height) * 2;
		System.out.println("Area of rectangle: " + area);
		System.out.println("Perimeter of rectangle: " + perimeter);
		
	}
}
