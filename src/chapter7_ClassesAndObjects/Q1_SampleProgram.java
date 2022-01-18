package chapter7_ClassesAndObjects;

/*
 * Adapt the program so that the user is able to set the length and height of the two
 * oblongs. Make use of the EasyScanner class to read in the user input.
 */

public class Q1_SampleProgram {
	
	public static void main(String[] args)
	{ 
		double length, height;
		Oblong oblong1, oblong2;
		
		System.out.println("Please enter details for Oblong1");
		length = getLength();
		height = getHeight();
		oblong1 = createOblong(length, height);
		
		System.out.println("Please enter details for Oblong2");
		length = getLength();
		height = getHeight();
		oblong2 = createOblong(length, height);
		
		System.out.println("The area of oblong1 is " + oblong1.calculateArea());
		System.out.println("The area of oblong2 is " + oblong2.calculateArea()); 
	} 
	
	// methods
	static double getLength()
	{
		System.out.println("Please enter the length of the oblong:");
		double lengthOut = EasyScanner.nextDouble();
		return lengthOut;
	}
	
	static double getHeight()
	{
		System.out.println("Please enter the height of the oblong:");
		double heightOut = EasyScanner.nextDouble();
		return heightOut;		
	}
	
	static Oblong createOblong(double lengthIn, double heightIn)
	{
		Oblong oblongOut = new Oblong(lengthIn, heightIn);
		return oblongOut;
	}
}
