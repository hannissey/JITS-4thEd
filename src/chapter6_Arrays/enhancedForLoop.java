package chapter6_Arrays;

public class enhancedForLoop {

	public static void main(String[] args)
	{
		int[] numberArray = {1, 2, 3, 4, 5};

		// We simply want to display the array on the screen:

		// for each number in the number array...
		for (int number : numberArray)
		{
			System.out.println(number);
		}
		
		// the variable used to store the value can be any name
		for (int sillyName : numberArray)
		{
			System.out.println(sillyName);
		}
	}
	
}
