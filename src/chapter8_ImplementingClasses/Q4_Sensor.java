package chapter8_ImplementingClasses;

public class Q4_Sensor {
	
	// attributes
	private double pressure = 0;
	
	// methods
	
	// constructors
	public Q4_Sensor()
	{	
	}
	
	public Q4_Sensor(double pressureIn)
	{
		pressure = pressureIn;
	}
	
	public boolean setPressure(double pressureIn)
	{	
		if (pressureIn <= 0)
		{
			return false;
		}
		pressure = pressureIn;
		return true;

	}
	
	public double getPressure()
	{
		return pressure;
	}

}
