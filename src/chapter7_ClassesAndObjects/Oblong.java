package chapter7_ClassesAndObjects;

public class Oblong {

	// page 212
	// the attributes
	private double length;
	private double height;
	private String name;
	
	// the methods
	
	//the constructor
	public Oblong(double lengthIn, double heightIn)
	{
		length = lengthIn;
		height = heightIn;
	}
	
	// this method allows us to read the length attribute
	public double getLength()
	{
		return length;
	}
	
	// this method allows us to read the height attribute
	public double getHeight()
	{
		return height;
	}
	
	// this method allows us to write to the length attribute
	
	// this method allows us to write to the height attribute
	
	// this method returns the area of the Oblong
	public double calculateArea()
	{
		return length * height;
	}
	
	// this method returns the perimeter of the Oblong
	public double calculatePerimeter()
	{
		return (length * height) * 2;
	}
	
	
}
