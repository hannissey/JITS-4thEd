package chapter6_Arrays;

import java.util.Scanner;

public class Processing2DArrays {
	
	public static void main(String[] args)
	{
		
		// declare array
		double[][] temperature = new double[4][7];
		
		// create Scanner object for user input
		Scanner keyboard = new Scanner(System.in);
		
		// the outer loop controls the week row
		// the .length attribute returns the length of the index (ie, the rows)
		for (int week = 1; week <= temperature.length; week++)
		{
			// the inner loop controls the day column
			for (int day = 1; day <= temperature[0].length; day++)
			{
				System.out.println("Enter temperature for week " + week + " and day " + day);
				// as array indices start at zero, and not 1, we must take one off the loop counters
				temperature[week-1][day-1] = keyboard.nextDouble();
			}
		}		
	}
	

}
