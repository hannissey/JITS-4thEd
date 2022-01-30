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
	
	// helper methods
	// return max number of rows
	private int getMaxDays() 
	{
		int maxDays = -999;
	
		for (int row = 0; row < times.length; row++)
		{
			maxDays = times.length;
		}		
		return maxDays;
	}
	
	// return max number of columns
	private int getMaxPeriods()
	{
		int maxPeriods = -999;
	
		for (int row = 0; row < times.length; row++)
		{
			for (int col = 0; col < times[row].length; col++)
			{
				maxPeriods = times[row].length;
			}
		}
		return maxPeriods;
	}
	
	// view Timetable
	public void viewTimetable()
	{
		int maxDays = -999;
		int maxPeriods = -999;
	
		for (int row = 0; row < times.length; row++)
		{
			maxDays = times.length;
			System.out.println("\nDay " + (row+1));
			for (int col = 0; col < times[row].length; col++)
			{
				maxPeriods = times[row].length;
				System.out.print(" Period " + (col+1) + " |");
			}
		}
		
		System.out.println();

	}
	

	
	// make booking
	// amend to return boolean, and take Booking object
	public boolean makeBooking(int dayIn, int periodIn, Q8_Booking bookingIn)
	{
		int maxDays = getMaxDays();
		int maxPeriods = getMaxPeriods();
		
		
		
		
		if(dayIn <= maxDays && periodIn <= maxPeriods && times[dayIn][periodIn] == null)
		{
			times[dayIn][periodIn] = bookingIn;
			System.out.println("Booking successful.");
			return true;
		}
		System.out.println("Must not exceed " + maxDays + " days.");
		System.out.println("Must not exceed " + maxPeriods + " periods.");	
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
