package chapter8_ImplementingClasses;

public class Q8_BookingTester {

	public static void main(String[] args)
	{
		Q8_TimeTable university = new Q8_TimeTable(5,7);

		Q8_Booking booking1 = new Q8_Booking("Yellow Room","Colonel Mustard");
		Q8_Booking booking2 = new Q8_Booking("Red Room","Lady Scarlet");
		Q8_Booking booking3 = new Q8_Booking("Green Room","Reverend Green");
		Q8_Booking booking4 = new Q8_Booking("Blue Room","Lord Navy");
		Q8_Booking booking5 = new Q8_Booking("White Room","Mrs White");
	
		//make booking
		bookingRequest(university, 1, 0, booking1);
		bookingRequest(university, 3, 2, booking2);
		bookingRequest(university, 4, 4, booking3);
		bookingRequest(university, 1, 3, booking4);
		bookingRequest(university, 1, 0, booking5);
		
		// cancel booking
		//university.cancelBooking(3, 2);
		
		// check if slot is free
		// university.isFree(1, 5);
		
		// get booking
		// university.getBooking(4, 2);
		
		// return number of days
		System.out.println("Number of days in timetable: " + 
				+ university.numberOfDays());
		
		// return number of periods
		System.out.println("Number of periods in timetable: " +
				+ university.numberOfPeriods());		
		

	}
	
	// make booking
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
