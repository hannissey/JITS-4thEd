package chapter6_Arrays;

import java.util.Scanner;

public class TemperatureReadings {
	public static void main(String[] args)
	{
		
		// create array
		double[] temperature;
		// allocate memory to the array
		temperature = new double[7];
		
		// call enter temps method
		enterTemps(temperature);
		
		// call display temps method
		displayTemps(temperature);
		
	}
	
	// enter temps method
	// This method uses the array syntax []
	static void enterTemps(double[] temperatureIn)
	{
		// enter temperatures
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < temperatureIn.length; i++)
		{
			System.out.println("Enter max temperature for Day " + (i + 1));
			temperatureIn[i] = keyboard.nextDouble();
		}		
	}
	
	// display temps method
	// This method uses the varargs syntax ...
	static void displayTemps(double... temperatureIn)
	{
		// display temperatures
		System.out.println("\n*** TEMPERATURES ENTERED ***\n");
		for (int i = 0; i < temperatureIn.length; i++)
		{
			System.out.println("Day " + (i + 1) + " " + temperatureIn[i]);
		}
	}
}
