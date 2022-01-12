package chapter6_Arrays;

import java.util.Scanner;

public class TemperatureReadings3 {
	public static void main(String[] args)
	{
		double[] temperature;
		temperature = enterTemps();
		displayTemps(temperature);
		wasHot(temperature);
	}
	
	// method to enter temperatures returns an array
	static double[] enterTemps()
	{
		Scanner keyboard = new Scanner(System.in);
		double[] temperatureOut = new double[7];
		for (int i = 0; i < temperatureOut.length; i++)
		{
			System.out.println("Enter max temperature for day " + (i+1));
			temperatureOut[i] = keyboard.nextDouble();
		}
		return temperatureOut;
	}
	
	// this method is unchanged from TemperatureReadings2
	static void displayTemps(double[] temperatureIn)
	{
		System.out.println("\n*** TEMPERATURES ENTERED ***\n");
		for (int i = 0; i < temperatureIn.length; i++)
		{
			System.out.println("day " + (i+1) + " " + temperatureIn[i]);
		}
	}
	
	// this method only shows temperature over a certain value
	static void wasHot(double[] arrayIn)
	{
		for (int temp = 0; temp < arrayIn.length; temp++)
		{
			if (arrayIn[temp] > 18)
			{
				System.out.println("Day " + (temp+1 )+ " was hot standing at " + arrayIn[temp] + " degrees");
			}
		}
	}
}
