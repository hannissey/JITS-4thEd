package chapter7_ClassesAndObjects;

public class Q5_ApartmentRoomsWithMethods {
	
	public static void main(String[] args)
	{
		int rooms = 0;
		String[] apartmentNames;	
		Oblong[] apartmentRooms; 
		
		
		rooms = enterRooms();
		apartmentNames = enterNames(rooms);
		apartmentRooms = enterDimensions(rooms, apartmentNames); // call new version of this method
		displayRooms(apartmentRooms, apartmentNames);
	}
	
	// method to enter number of rooms
	static int enterRooms()
	{
		int roomsOut = 0;
		System.out.println("How many rooms?");
		roomsOut = EasyScanner.nextInt();
		return roomsOut;
	}
	
	
	// method to enter names of rooms, returns an array
	static String[] enterNames(int roomsIn)
	{
		String[] namesOut = new String[roomsIn];	
		for(int i = 0; i < namesOut.length; i++)
		{
			System.out.println("Please enter name for room " + (i+1));
			namesOut[i] = EasyScanner.nextString();			
		}

	return namesOut;
		
	}
	
	// method to enter temperatures returns an array 
	static Oblong[] enterDimensions(int roomsIn, String[] apartmentNamesIn)
	{ 
		// method attributes
		double height = 0, length =0;
		
		Oblong[] dimensionsOut = new Oblong[roomsIn]; 
		for (int i = 0; i < dimensionsOut.length; i++)
		{
			System.out.println(apartmentNamesIn[i]);
			System.out.println("Please enter length:");
			length = EasyScanner.nextDouble();
			System.out.println("Please enter height:");
			height = EasyScanner.nextDouble();
			
			dimensionsOut[i] = new Oblong(length, height);	
		}
		return dimensionsOut;
	}
	
	// this method is unchanged 
	static void displayRooms(Oblong[] apartmentRoomsIn, String[] apartmentNamesIn)
	{
		System.out.println();
		System.out.println("***ROOM DIMENSIONS***"); 
		System.out.println();
		for (int i = 0; i < apartmentRoomsIn.length; i++)
		{
			System.out.print("\n\nRoom: " + apartmentNamesIn[i]
					+ "\nHeight " + apartmentRoomsIn[i].getHeight()
					+ "\nLength " + apartmentRoomsIn[i].getLength()				
					);
		}
	}
}
