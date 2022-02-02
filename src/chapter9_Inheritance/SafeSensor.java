package chapter9_Inheritance;

public class SafeSensor extends Sensor {
	
	private double max;
	
	// this constructor sets the max safe value to parameter input
	public SafeSensor(double maxIn)
	{
		super(10);
		max = maxIn;
	}
	
	// this constructor sets a max safe value & sets initial value for sensor reading
	public SafeSensor(double maxIn, double pressureIn)
	{
		super(pressureIn);
		max = maxIn;
	}
	
	public boolean setPressure(double pressureIn)
	{
		if(pressureIn > max)
		{
			return false;
		}
		return true;
		
	}
	
	public double getMax()
	{
		return max;
	}
	

}
