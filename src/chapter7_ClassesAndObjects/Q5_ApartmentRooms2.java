package chapter7_ClassesAndObjects;

public class Q5_ApartmentRooms2 {

	public static void main(String[] args)
	{
		// attributes
		int rooms = 0;
		double length = 0, height = 0;
		
		// Request size of array from user
		System.out.println("How many rooms? Pick 3 for now");
		rooms = EasyScanner.nextInt();
		
		// create array of references
		Oblong[] apartmentRooms = new Oblong[rooms];
		
		// Room 1
		System.out.println("Room 1");
		System.out.println("Please input length:");
		length = EasyScanner.nextDouble();
		System.out.println("Please input height:");
		height = EasyScanner.nextDouble();
		apartmentRooms[0] = new Oblong(length, height);
		
		// Room 2
		System.out.println("Room 2");
		System.out.println("Please input length:");
		length = EasyScanner.nextDouble();
		System.out.println("Please input height:");
		height = EasyScanner.nextDouble();
		apartmentRooms[1] = new Oblong(length, height);
		
		// Room 3
		System.out.println("Room 3");
		System.out.println("Please input length:");
		length = EasyScanner.nextDouble();
		System.out.println("Please input height:");
		height = EasyScanner.nextDouble();
		apartmentRooms[2] = new Oblong(length, height);
		
		// print array
		for (int i = 0; i < apartmentRooms.length; i++)
		{
			System.out.println("Room " + (i+1));
			System.out.println(" Length: " + length);
			System.out.println(" Height: " + height);
			
		}
		
	}
	

	
}
