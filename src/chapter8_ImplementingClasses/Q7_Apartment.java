package chapter8_ImplementingClasses;

import java.util.ArrayList;

public class Q7_Apartment {

	// attributes (in this case, an ArrayList
	private ArrayList<Oblong> rooms = new ArrayList<>();
	
	// methods

	public int searchRooms(String nameIn)
	{
		for(int i = 0; i <= rooms.size() - 1; i++)
		{
			Oblong tempRoom = rooms.get(i); // finds the room
			String tempRoomName = tempRoom.getName(); // gets name of room
			if(tempRoomName.equals(nameIn)) // if this is the room we are looking for
			{
				return i; // return the index
			}
		}
		// if no room name exists
		return -999;
	}
	
	public void add(double lengthIn, double heightIn, String nameIn)
	{
		rooms.add(new Oblong(lengthIn, heightIn, nameIn));
	}
	
	public double getRoomArea(int indexIn)
	{
		double areaOut;
		areaOut = rooms.get(indexIn).calculateArea();
		return areaOut;
	}
	
	public double getRoomLength(int indexIn)
	{
		double lengthOut;
		lengthOut = rooms.get(indexIn).getLength();
		return lengthOut;
	}
	
	public double getRoomHeight(int indexIn)
	{
		double heightOut;
		heightOut = rooms.get(indexIn).getHeight();
		return heightOut;
	}
	
	public String getName(int indexIn)
	{
		String nameOut;
		nameOut = rooms.get(indexIn).getName();
		return nameOut;
	}
	
	public int getSize()
	{
		return rooms.size();
	}
	
	public void displayAll()
	{
		for (Oblong item : rooms)
		{
			System.out.println("Room name: " + item.getName());
			System.out.println("Room height: " + item.getHeight());
			System.out.println("Room length: " + item.getLength());
			System.out.println();
		}
	}
	
}
