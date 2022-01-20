package chapter7_ClassesAndObjects;

public class Q5_ApartmentRoomsWithMethods {
	
	public static void main(String[] args)
	{
		Oblong[] apartmentRooms; 
		apartmentRooms = enterDimensions(); // call new version of this method
		displayTemps(apartmentRooms);
	}
	
	// method to enter temperatures returns an array 
	static Oblong[] enterDimensions()
	{ 
		// method attributes
		int rooms = 0;
		double height = 0, length =0;

		System.out.println("How many rooms?");
		rooms = EasyScanner.nextInt();
		
		Oblong[] dimensionsOut = new Oblong[rooms]; 
		for (int i = 0; i < dimensionsOut.length; i++)
		{
			System.out.println("Please enter length for room " + (i+1));
			length = EasyScanner.nextDouble();
			System.out.println("Please enter height for room " + (i+1));
			height = EasyScanner.nextDouble();
			
			dimensionsOut[i] = new Oblong(length, height);	
		}
		return dimensionsOut;
	}
	
	// this method is unchanged 
	static void displayTemps(Oblong[] apartmentRoomsIn)
	{
		System.out.println();
		System.out.println("***ROOM DIMENSIONS***"); 
		System.out.println();
		for (int i = 0; i < apartmentRoomsIn.length; i++)
		{
			System.out.print("\n\nRoom "+(i+1)+" "
					+ "\nHeight " + apartmentRoomsIn[i].getHeight()
					+ "\nLength " + apartmentRoomsIn[i].getLength()				
					);
		}
	}
}
