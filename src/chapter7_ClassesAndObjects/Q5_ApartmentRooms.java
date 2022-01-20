package chapter7_ClassesAndObjects;

// 5. Write a program that creates an array of Oblong objects to represent the
// dimensions of rooms in an apartment as described in self test question 6. The
// program should allow the user to:

public class Q5_ApartmentRooms {

	public static void main(String[] args)
	{
		// attributes
		char choice = 'a';
		Oblong[] apartmentRooms = inputDimensions();
		
		System.out.println("Hi! Welcome to our Room Dimensions Program");
		
		do
		{
			
			System.out.println("What would you like to do?");
			
			System.out.print("\n*** MENU ***\n"     
					+ "\n[1] Input room dimensions"
					+ "\n[2] Retrieve area and dimensions of any room"
					+ "\n[3] Display Dimensions"
					+ "\n[4] Quit"
					);		
			
			choice = EasyScanner.nextChar();
			
			switch (choice)
			{
				case '1' : inputDimensions(); 	
							break;
				case '2' : retrieveDimensions(apartmentRooms); break;
				case '3' : displayDimensions(apartmentRooms); break;
				case '4' : break;
				default : System.out.println("Not a valid choice.");
						
			}
			
		} while (choice != '4');	
		System.out.println("Goodbye!");
	}
		
	// methods
	
	static Oblong[] inputDimensions()
	{
		// method attributes
		int rooms = 0;
		double length = 0, height = 0;
		
		System.out.println("Hello! How many rooms does your apartment have?");
		rooms = EasyScanner.nextInt();
		
		Oblong[] apartmentRoomsOut = new Oblong[rooms];
		
		for (int i = 0; i < apartmentRoomsOut.length; i++)
		{
			System.out.println("Please enter length for room " + (i+1));
			length = EasyScanner.nextDouble();
			System.out.println("Please enter height for room " + (i+1));
			height = EasyScanner.nextDouble();
			
			apartmentRoomsOut[i] = new Oblong(length, height);				
		}		
		
		return apartmentRoomsOut;
	}
	
	static void retrieveDimensions(Oblong[] apartmentRoomsIn)
	{
		System.out.println("Which room dimensons would you like to view?");
		int i = EasyScanner.nextInt();
		
		System.out.println("\n\nRoom " + i);
		System.out.println("Area: " + apartmentRoomsIn[i].calculateArea());
		System.out.println("Perimeter: " + apartmentRoomsIn[i].calculatePerimeter());
		
	}
	
	static void displayDimensions(Oblong[] apartmentRoomsIn)
	{
		for (Oblong item : apartmentRoomsIn)
		{
				System.out.print("\n\nRoom "
						+ "\n\nLength: " + item.getLength()
						+ "\nHeight: " + item.getHeight()

				);
		}		
	}

}
