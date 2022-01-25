package chapter8_ImplementingClasses;

/*
 * Write a program to test out your class. This program should allow the user
to enter a value for the radius of the circle, and then display the area,
circumference and diameter of this circle on the screen by calling the
appropriate methods of the CircularShape class.
 */

public class Q1_CircularShapeTester {

	public static void main(String[] args)
	{
		// attributes
		double radius = 0;
		char choice = 'a';
		
		do {
			System.out.println("*** Circle Calculation Program ***");
			
			Q1_CircularShape myCircle;
			
			System.out.println("Please enter radius of circle: ");
			radius = EasyScanner.nextDouble();
			
			myCircle = new Q1_CircularShape(radius);
			
			System.out.print("Your circle details:" + "\n" 
				+ "The area of the circle is: " + myCircle.calculateArea()  + "\n" 
				+ "The circumference of the circle is: " + myCircle.calculateCircumference() + "\n" 
				+ "The diameter of the circle is: " + myCircle.calculateDiameter() + "\n" 			
			);
			
			System.out.println("Would you like another go? y/n");	
			choice = EasyScanner.nextChar();
		} while (choice == 'y' || choice == 'Y' );
		System.out.println("Thanks, goodbye now!");

	}
	
}
