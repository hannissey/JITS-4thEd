package chapter9_Inheritance;

public class Vehicle {

	private String regNo;
	private String make;
	private int yearOfManufacture;
	private double value;
	
	public Vehicle(String regIn, String makeIn, int yearIn, double valueIn)
	{
		regNo = regIn;
		make = makeIn;
		yearOfManufacture = yearIn;
		value = valueIn;
	}
	
	public String getRegNo()
	{
		return regNo;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public int getYearOfManufacture()
	{
		return yearOfManufacture;
	}
	
	public double getValue()
	{
		return value;
	}
	
	public void setValue(double valueIn)
	{
		value = valueIn;
	}
	
	public int calculateAge(int yearIn)
	{
		return yearIn - yearOfManufacture;
	}
}
