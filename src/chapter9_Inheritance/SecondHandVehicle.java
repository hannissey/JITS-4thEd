package chapter9_Inheritance;

public class SecondHandVehicle extends Vehicle {

	private int numberOfOwners;
	
	public SecondHandVehicle(String regIn, String makeIn, int yearIn, double valueIn, int ownersIn)
	{
		super(regIn, makeIn, yearIn, valueIn);
		numberOfOwners = ownersIn;
	}
	
	public int getNumberOfOwners()
	{
		return numberOfOwners;
	}
	
	public boolean hasMultipleOwners()
	{
		if (numberOfOwners > 1)
		{
			return true;
		}
		return false;
	}
	

}
