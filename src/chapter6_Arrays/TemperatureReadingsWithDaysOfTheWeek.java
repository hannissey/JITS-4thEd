package chapter6_Arrays;

import java.util.Scanner;

public class TemperatureReadingsWithDaysOfTheWeek {
	public static void main(String[] args)
	{
		
		// create array
		double[] temperature;
		// allocate memory to the array
		temperature = new double[7];
		
		// challenge: use days of the week instead of day 1
		String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		enterTemps(temperature, daysOfTheWeek);
		displayTemps(temperature, daysOfTheWeek);
	
	}
	
	static void enterTemps(double[] temperatureIn, String[] daysOfTheWeekIn)
	{
		// enter temperatures
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < temperatureIn.length; i++)
		{
			System.out.println("Enter max temperature for " + daysOfTheWeekIn[i]);
			temperatureIn[i] = keyboard.nextDouble();
		}
	}
	
	static void displayTemps(double[] temperatureIn, String[] daysOfTheWeekIn)
	{
		// display temperatures
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\n*** TEMPERATURES ENTERED ***\n");
		for (int i = 0; i < temperatureIn.length; i++)
		{
			System.out.println(daysOfTheWeekIn[i] + " " + temperatureIn[i]);
		}
	}
}
