package chapter8_ImplementingClasses;

public class Q8_BookingTester {

	public static void main(String[] args)
	{
		Q8_TimeTable university = new Q8_TimeTable(5,7);
		int choice = -999;
		
		// pre-booked periods
		Q8_Booking booking1 = new Q8_Booking("Yellow Room","Colonel Mustard");
		bookingRequest(university, 1, 0, booking1);
		
		Q8_Booking booking2 = new Q8_Booking("Red Room","Lady Scarlet");
		bookingRequest(university, 3, 2, booking2);
		
		Q8_Booking booking3 = new Q8_Booking("Green Room","Reverend Green");
		bookingRequest(university, 4, 4, booking3);
		
		Q8_Booking booking4 = new Q8_Booking("Blue Room","Lord Navy");
		bookingRequest(university, 1, 3, booking4);
		
		Q8_Booking booking5 = new Q8_Booking("White Room","Mrs White");
		bookingRequest(university, 1, 2, booking5);
		
		do
		{
			System.out.println("Welcome to University Equipment Lending Service");
			System.out.println("Please choose an option from the menu below: ");
			System.out.print(
					"[1] Make a booking" + "\n" +
					"[2] Cancel a booking" + "\n" +
					"[3] Check if a slot is free" + "\n" +
					"[4] Retrieve a booking" + "\n" +
					"[5] View timetable" + "\n" +
					"[6] Quit" + "\n\n"
					);
			
			choice = EasyScanner.nextInt();
			
			switch (choice)
			{
			case 1 : option1(university);
			break;
			case 2 : option2(university);
			break;
			case 3 : option3(university);
			break;
			case 4 : option4(university);
			break;
			case 5 : option5(university);
			break;
			case 6 : break;
			default : System.out.println("Invalid entry.");
			}
			
		} while (choice != 6 );
		System.out.println("Goodbye now!");
	}
	
	public static void option1(Q8_TimeTable timetableIn)
	{
		int dayIn = -999;
		int periodIn = -999;
		boolean success;
		Q8_Booking bookingOut;
		String roomIn;
		String nameIn;
		
		System.out.println("Which day would you like? ");
		dayIn = EasyScanner.nextInt();
		System.out.println("Which period?");
		periodIn = EasyScanner.nextInt();
		System.out.println("What is your name?");
		nameIn = EasyScanner.nextString();
		System.out.println("Which room?");
		roomIn = EasyScanner.nextString();

		bookingOut = new Q8_Booking(roomIn, nameIn);	
		
		success = timetableIn.makeBooking(dayIn, periodIn, bookingOut);
		
		if (success)
		{
			System.out.println("Equipment booked successfully: " + "\n"
					+ bookingOut.getName() + "\n"
					+ bookingOut.getRoom() + "\n"
					);		
		}
		else
		{
			System.out.println("Equipment not booked.");
		}	
	}
	
	public static void option2(Q8_TimeTable timetableIn)
	{
		// cancel booking
		int dayIn;
		int periodIn;
		boolean success;
		
		System.out.println("Which booking would you like to cancel? ");
		dayIn = EasyScanner.nextInt();
		System.out.println("Which period?");
		periodIn = EasyScanner.nextInt();		
		
		success = timetableIn.cancelBooking(dayIn, periodIn);
		if (success)
		{
			System.out.println("Booking cancelled successfully.");
		}
		else
		{
			System.out.println("An issue occurred.");
		}
	}
	
	public static void option3(Q8_TimeTable timetableIn)
	{
		// check if slot is free
		int dayIn;
		int periodIn;
		boolean success;
		
		System.out.println("Which booking would you like to cancel? ");
		dayIn = EasyScanner.nextInt();
		System.out.println("Which period?");
		periodIn = EasyScanner.nextInt();
		
		success = timetableIn.isFree(dayIn, periodIn);
		
		if(success)
		{
			System.out.println("Day " + dayIn + " period " + periodIn + " is free.");	
		}
		else
		{
			System.out.println("Equipment unavailable for that period.");
		}
	}
	
	public static void option4(Q8_TimeTable timetableIn)
	{
		// get booking
		int dayIn;
		int periodIn;
		Q8_Booking bookingOut;
		
		System.out.println("Which booking would you like to view? ");
		dayIn = EasyScanner.nextInt();
		System.out.println("Which period?");
		periodIn = EasyScanner.nextInt();
		
		bookingOut = timetableIn.getBooking(dayIn, periodIn);
		
		System.out.println("Slot booked by: " + "\n"
				+ bookingOut.getName() + "\n"
				+ bookingOut.getRoom() + "\n"
				);		
	}
	
	public static void option5(Q8_TimeTable timetableIn)
	{
		// return number of days
		System.out.println("Number of days in timetable: " + 
				+ timetableIn.numberOfDays());
		
		// return number of periods
		System.out.println("Number of periods in timetable: " +
				+ timetableIn.numberOfPeriods());
		
		// view visual timetable
		timetableIn.viewTimetable();
	}
	
	// initial pre-booking methods to populate timetable quickly
	public static void bookingRequest(Q8_TimeTable timetableIn, int dayIn, int periodIn, Q8_Booking bookingIn)
	{
		boolean success;
		success = timetableIn.makeBooking(dayIn, periodIn, bookingIn);
		
		if (success)
		{
			System.out.println("Equipment booked successfully: " + "\n"
					+ bookingIn.getName() + "\n"
					+ bookingIn.getRoom() + "\n"
					);		
		}
		else
		{
			System.out.println("Equipment unavailable for that period.");
		}		
	}
	

}
