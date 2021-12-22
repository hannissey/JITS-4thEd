package chapter4_Iteration;

import java.util.Scanner;

public class Q8_CircleCalc {

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
		double radius = 0, area, circumference;
		final double PI = 3.1416;
		char choice;
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hello! Welcome to our circle calculator.");
		
		do
		{
			System.out.print("MENU"
					+ "\n[1] Set radius"
					+ "\n[2] Display radius"
					+ "\n[3] Display area"
					+ "\n[4] Display perimeter"
					+ "\n[5] Quit\n"
					);
			
			System.out.println("What would you like to do?");
			choice = keyboard.next().charAt(0);
			
			switch (choice)
			{
			case '1' :
				System.out.println("Please input the radius of your circle.");
				radius = keyboard.nextDouble();
				
				while (radius < 0)
				{
					System.out.println("Please enter a radius larger than 0: ");
					radius = keyboard.nextDouble();
				}	
				break;
			case '2' :
				System.out.println("The radius of your circle is " + radius);
				break;
			case '3' :
				area = PI * (radius * radius);
				System.out.println("The area of your circle is " + area);
				break;
			case '4' :
				circumference = 2 * PI * radius;
				System.out.println("The circumference of your circle is " + circumference);
				break;
			}
		} while (choice != '5');

		System.out.println("Thank you for using our Circle Calculator. Goodbye.");
	
	}
}


