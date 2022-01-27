package chapter8_ImplementingClasses;

public class Q7_ApartmentTester {

	public static void main(String[] args)
	{
		
		int choice = -999;
		
		Q7_Apartment apartment1 = new Q7_Apartment();
		
		apartment1.add(5, 5, "lobby");
		apartment1.add(6, 8, "living room");
		apartment1.add(5, 4, "kitchen");		
		
		do
		{
			System.out.println("Welcome to the Apartment Management Database");
			System.out.println();
			System.out.print("MENU" + "\n"
					+ "[1] Add room" + "\n"
					+ "[2] Get room area" + "\n"
					+ "[3] Get room length" + "\n"
					+ "[4] Get room height" + "\n"
					+ "[5] Pick a room to view" + "\n"
					+ "[6] View all rooms" + "\n"
					+ "[7] Search for a room" + "\n"
					+ "[8] Quit" + "\n\n"
					);
			System.out.println("What would you like to do?");
			choice = EasyScanner.nextInt();
			
			switch (choice)
			{
			// add room
			case 1 : option1(apartment1);
			break;
			// get room area
			case 2 : option2(apartment1);
			break;
			// get room length
			case 3 : option3(apartment1);
			break;
			// get room height
			case 4 : option4(apartment1);
			break;
			// get room details
			case 5 : option5(apartment1);
			break;
			// view all rooms
			case 6 : option6(apartment1);
			break;
			case 7 : option7(apartment1);
			break;
			case 8 : break;
			default : System.out.println("Invalid choice.");
			
			}			
		} while (choice != 8);
		System.out.println("Thank you, bye now!");
		
	}
	
	// add room
	static void option1(Q7_Apartment apartmentIn)
	{
		double lengthIn = 0;
		double heightIn = 0;
		String nameIn = null;
		
		System.out.println("Please enter room name: ");
		nameIn = EasyScanner.nextString();
		System.out.println("Please enter length: ");
		lengthIn = EasyScanner.nextDouble();
		System.out.println("Please enter height: ");
		heightIn = EasyScanner.nextDouble();
		apartmentIn.add(lengthIn, heightIn, nameIn);

	}
	
	static void option2(Q7_Apartment apartmentIn)
	{
		int result = -999;
		String roomIn = null;
		
		System.out.println("Which room area would you like to view?");
		roomIn = EasyScanner.nextString();
		result = apartmentIn.searchRooms(roomIn);
		if(result == -999)
		{
			System.out.println("Room does not exist.");
		}
		else
		{
			System.out.println("Area of " + apartmentIn.getName(result)
			+ " is " + apartmentIn.getRoomArea(result));			
		}
	}
	
	static void option3(Q7_Apartment apartmentIn)
	{
		int result = -999;
		String roomIn = null;
		
		System.out.println("Which room length would you like to view?");
		roomIn = EasyScanner.nextString();
		result = apartmentIn.searchRooms(roomIn);
		if(result == -999)
		{
			System.out.println("Room does not exist.");
		}
		else 
		{
			System.out.println("Length of " + apartmentIn.getName(result)
			+ " is " + apartmentIn.getRoomLength(result));				
		}	
	}
	
	static void option4(Q7_Apartment apartmentIn)
	{
		int result = -999;
		String roomIn = null;
		
		System.out.println("Which room height would you like to view?");
		
		roomIn = EasyScanner.nextString();
		result = apartmentIn.searchRooms(roomIn);
		
		if (result == -999)
		{
			System.out.println("Room does not exist.");
		}
		else
		{
			System.out.println("Height of " + apartmentIn.getName(result)
			+ " is " + apartmentIn.getRoomHeight(result));			
		}

	}
	
	
	static void option5(Q7_Apartment apartmentIn)
	{
		int result = -999;
		String roomIn = null;
		char choice = 'a';
		
		do
		{
			System.out.println("Which room would you like to view? ");
			roomIn = EasyScanner.nextString();
			result = apartmentIn.searchRooms(roomIn);
			
			if(result == -999) {	
				System.out.println("Room does not exist");
			} 
			else
			{
				System.out.println("Area of " + apartmentIn.getName(result)
				+ " is " + apartmentIn.getRoomArea(result));	
				System.out.println("Height of " + apartmentIn.getName(result)
				+ " is " + apartmentIn.getRoomHeight(result));
				System.out.println("Length of " + apartmentIn.getName(result)
				+ " is " + apartmentIn.getRoomLength(result)	);	
			}
	
					
			System.out.println("Would you like to view another room? Y to go again or N to return to main menu.");
			choice = EasyScanner.nextChar();			
		} while (choice == 'y' || choice == 'Y');
		

	}
	
	static void option6(Q7_Apartment apartmentIn)
	{
		apartmentIn.displayAll();
	}
	
	static void option7(Q7_Apartment apartmentIn)
	{
		int result = -999;
		String searchIn = null;
		
		System.out.println("Which room would you like to search for?");
		searchIn = EasyScanner.nextString();
		result = apartmentIn.searchRooms(searchIn);
		if (result == -999)
		{
			System.out.println("Room does not exist.");
		}
		else
		{
			System.out.println("Room exists at index: " + result);
		}
		
	}
	
}
