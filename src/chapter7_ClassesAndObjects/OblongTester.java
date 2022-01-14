package chapter7_ClassesAndObjects;

import java.util.Scanner;

class OblongTester {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		// declare two variables to hold the length and height of the Oblong as input by the user
		double oblongLength, oblongHeight;
		
		// declare a reference to an Oblong object
		Oblong myOblong;
		
		// now get the values from the user
		System.out.print("Please enter the length of your Oblong: ");
		oblongLength = keyboard.nextDouble();
		System.out.print("Please enter the height of your Oblong: ");
		oblongHeight = keyboard.nextDouble();
		
		// create a new Oblong object
		myOblong = new Oblong(oblongLength, oblongHeight);
		
		// use the various methods of the Oblong class
		System.out.println("Oblong length is: " + myOblong.getLength()); // display length
		System.out.println("Oblong height is: " + myOblong.getHeight()); // display height
		System.out.println("Oblong area is: " + myOblong.calculateArea()); // display area
		System.out.println("Oblong perimeter is: " + myOblong.calculatePerimeter()); // display perimeter
	}
}
