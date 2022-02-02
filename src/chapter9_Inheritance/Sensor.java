package chapter9_Inheritance;

public class Sensor {
	
	// attributes
	private double pressure = 0;
	
	// methods
	
	// constructors
	// objects created with this constructor set initial pressure to 0
	public Sensor()
	{	
	}
	
	// objects created with this constructor set initial pressure to parameter input
	public Sensor(double pressureIn)
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
