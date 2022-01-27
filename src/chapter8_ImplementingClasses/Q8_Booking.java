package chapter8_ImplementingClasses;

public class Q8_Booking {

	// attributes
	private String room;
	private String name;
	
	// methods
	// constructor
	public Q8_Booking(String roomIn, String nameIn)
	{
		room = roomIn;
		name = nameIn;
	}
	
	public String getRoom()
	{
		return room;
	}
	
	public String getName()
	{
		return name;
	}
}
