package chapter5_Methods;

public class OverloadingDemo
{
	public static void main(String[] args)
	{
		int maxOfTwo, maxOfThree;
		maxOfTwo = max(2, 10);		// call the first version of max
		maxOfThree = max(-5, 5, 3);	// call the second version of max
		System.out.println(maxOfTwo);
		System.out.println(maxOfThree);
		
	}
	
	// this version of max accepts two integers and returns the greater of the two
	static int max(int firstIn, int secondIn)
	{
		if(firstIn > secondIn)
		{
			return firstIn;
		} 
		else
		{
			return secondIn;
		}
	}
	
	// this version of max accepts three integers and returns the greatest of the three
	static int max(int firstIn, int secondIn, int thirdIn)
	{
		int result = firstIn;
		if (secondIn > result) result = secondIn;
		if (thirdIn > result) result = thirdIn;
		return result;
	}
	
	// Alternatively, we can also call the first version of max to help us find the 
	// greater number. This is an example of how a method can call another method.
	
	// Despite method overloading, we have to call this max2 because there is another
	// method with the same signature ie, has three formal parameters, and the compiler
	// is unable to distinguish between these two.
	
	static int max2(int firstIn, int secondIn, int thirdIn)
	{
		int step1, result;
		step1 = max(firstIn, secondIn);		// call the first version of max
		result = max(step1, thirdIn);		// call first version of max again 
		return result;
	}
	
	
}