package chapter8_ImplementingClasses;

public class Q4_SensorTester {

	public static void main(String[] args)
	{
		// create 2 Sensor objects using two constructors
		Q4_Sensor blueSensor = new Q4_Sensor();
		Q4_Sensor redSensor = new Q4_Sensor(10);
		
		// set pressure of blueSensor
		blueSensor.setPressure(25);
		
		// try setting pressure with negative value
		System.out.println(redSensor.setPressure(-10));
		
		//get pressure of both sensors
		System.out.println(blueSensor.getPressure());
		System.out.println(redSensor.getPressure());
		
	}
}
