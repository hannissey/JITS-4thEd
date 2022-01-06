package chapter6_Arrays;

import java.util.Scanner;

public class TemperatureReadingsAttempt {
	
	public static void main(String[] args)
	{
		
		// declared the array variable
		// This states 'data type array called temperature'
		double[] temperature;
		// This allocates memory for the array elements
		temperature = new double[7];
		// This does both
		// double[] temperature = new double[7];
		
		for(int i = 0; i < temperature.length; i++)
		{
			System.out.println("Please input temperature for Day " + (i + 1));
			Scanner keyboard = new Scanner(System.in);
			temperature[i] = keyboard.nextDouble();
		}
		
		// this prints out the memory address (reference), not the values
		System.out.println(temperature);
		
		// this prints out the value stored in the first element, index 0
		System.out.println(temperature[0]);
		
		// this prints out how many elements are in the array
		System.out.println(temperature.length);

		
	}
	

}
