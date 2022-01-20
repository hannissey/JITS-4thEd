package chapter7_ClassesAndObjects;

// Repeat Question 6 making use of the ArrayList class.

// import ArrayList
import java.util.ArrayList;

public class Q6_ApartmentRoomsWithArrayList {
	
	public static void main(String[] args)
	{
		// declare arraylist
		ArrayList<Oblong> apartmentRooms = new ArrayList<>(); 

		int rooms = 0;

		
		System.out.println("Hello! How many rooms does your apartment have?");
		rooms = EasyScanner.nextInt();
		
		inputDimensions(apartmentRooms, rooms);


		for (Oblong item : apartmentRooms)
		{
				System.out.print("\n\nRoom "
						+ "\n\nLength: " + item.getLength()
						+ "\nHeight: " + item.getHeight()

				);
		}		
	}
	
	// METHODS
	// input values
	public static void inputDimensions(ArrayList<Oblong> apartmentRoomsIn, int roomsIn)
	{
		double length = 0, height = 0;
		for (int i = 0; i < roomsIn; i++)
		{
			System.out.println("Please enter length for room " + i);
			length = EasyScanner.nextDouble();
			System.out.println("Please enter height for room " + i);
			height = EasyScanner.nextDouble();
			
			apartmentRoomsIn.add(new Oblong(length, height));	

		}	
	}
	
	
}
