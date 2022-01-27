package chapter8_ImplementingClasses;

import java.util.ArrayList;

public class Q8_TimeTable {

	// attributes
	// declares a 2D array of Q8_Booking objects
	private Q8_Booking[][] times;
	// https://www.geeksforgeeks.org/multidimensional-collections-in-java/
	
	// methods
	// constructor
	// day = column, period = row
	public Q8_TimeTable(int dayIn, int periodIn)
	{
		times = new Q8_Booking[dayIn][periodIn];
	}
	
	// make booking
	// amend to return boolean, and take Booking object
	public boolean makeBooking(int dayIn, int periodIn, Q8_Booking bookingIn)
	{
		if (times[dayIn][periodIn] == null)
		{
			times[dayIn][periodIn] = bookingIn;
			return true;
		}
		return false;

	}
	
	// cancel booking
	public boolean cancelBooking(int dayIn, int periodIn)
	{
		if (times[dayIn][periodIn] != null)
		{
			times[dayIn][periodIn] = null;
			return true;
		}
		return false;
	}
	
	public boolean isFree(int dayIn, int periodIn)
	{
		if (times[dayIn][periodIn] == null)
		{
			return true;
		}
		return false;		
	}
	
	public Q8_Booking getBooking(int dayIn, int periodIn)
	{
		return times[dayIn][periodIn];
	}
	
	public int numberOfDays()
	{
		return times.length;
	}
	
	public int numberOfPeriods()
	{
		int result = 0;
		for (int row = 0; row < times.length; row++)
		{
			result++;
			for (int col = 1; col < times[row].length; col++)
			{
				result++;
			}
		}
		return result;
	}
	

	


	

}
