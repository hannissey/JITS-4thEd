package chapter9_Inheritance;

public class Q2_SafeSensorTester 
{
	public static void main(String[] args)
	{
		SafeSensor autoclave = new SafeSensor(20);
		SafeSensor incubator = new SafeSensor(15, 7);
		
		if(incubator.setPressure(13))
		{
			System.out.println("Pressure set successfully.");
		}
		else
		{
			System.out.println("Pressure too high. Retaining pressure value.");
		}
		
		System.out.println("The max temperature of the autoclave is: " + incubator.getMax() );
	
	}
	
	
}
