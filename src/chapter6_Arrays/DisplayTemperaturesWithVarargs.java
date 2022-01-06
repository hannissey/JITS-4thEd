package chapter6_Arrays;

public class DisplayTemperaturesWithVarargs {
	public static void main(String[] args)
	{
		// create an array with 5 elements
		double[] temperature = {7.5, 8.2, 7.7, 11.3, 10.75};
		
		System.out.println("\nSending Array\n");
		
		// call method with a single array
		displayTemps(temperature);
		
		System.out.println("\nSending individual items\n");
		displayTemps(7.5, 8.2, 7.7, 11.3, 10.75);
		displayTemps(9.9);
		displayTemps( );
	}
	
	// method to display temperatures using varargs
	static void displayTemps(double... temperatureIn)
	{
		System.out.println("\n*** TEMPERATURES ***\n");
		// count items and display number
		System.out.println("Number of temperatures: " + temperatureIn.length) ;
		// display items
		for (int i = 0; i < temperatureIn.length; i++)
		{
			System.out.println(temperatureIn[i]+ " ");
		}
	}
}
