package chapter9_Inheritance;

import java.util.Scanner;
import java.util.ArrayList;

public class Q4_SecondHandCarSales {
	
	public static void main(String[] arg)
	{
		// Write a menu-driven program that uses an ArrayList to hold Vehicles
		ArrayList<SecondHandVehicle> vehicleList = new ArrayList<>();
		char choice;
		
		do {
			
			System.out.print("*** Car Sales Admin Program **" + "\n\n"
					+ "Please select an option: " + "\n"
					+ "[1] Add a vehicle" + "\n"
					+ "[2] Display a list of vehicle details" + "\n"
					+ "[3] Delete a vehicle" + "\n"
					+ "[4] Quit" + "\n\n"
					+ "Please select an option."
			);
			
			Scanner keyboard = new Scanner(System.in);
			choice = keyboard.next().charAt(0);
			
			switch (choice)
			{
				case '1' : option1(vehicleList);
				break;
				case '2' : option2(vehicleList);
				break;
				case '3' : option3(vehicleList);
				break;
				case '4' : break;
			}		
		} while (choice != '4');
		// quit
		System.out.println("Thank you, goodbye.");
	}
	
	// add vehicle
	public static void option1(ArrayList listIn)
	{
		String regIn, makeIn;
		int yearIn, ownersIn;
		double valueIn;
		
		// public SecondHandVehicle(String regIn, String makeIn, int yearIn, double valueIn, int ownersIn)
		System.out.println("Please input the vehicle details below: " + "\n");
		System.out.println("Registration Number: ");
		regIn = EasyScanner.nextString();
		System.out.println("Car make: ");
		makeIn = EasyScanner.nextString();
		System.out.println("Year manufactured: ");
		yearIn = EasyScanner.nextInt();
		System.out.println("Value of car: ");
		valueIn = EasyScanner.nextDouble();
		System.out.println("Number of previous owners: ");
		ownersIn = EasyScanner.nextInt();
		
		listIn.add(new SecondHandVehicle(regIn, makeIn, yearIn, valueIn, ownersIn));
		
	}
	
	// display list of vehicle details
	public static void option2(ArrayList listIn)
	{
		
	}
	
	// delete a vehicle
	public static void option3(ArrayList listIn)
	{
		
	}
	

}
