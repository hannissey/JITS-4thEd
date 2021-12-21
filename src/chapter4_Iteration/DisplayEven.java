package chapter4_Iteration;

public class DisplayEven {
	public static void main(String[] args)
	{
		System.out.println("*** Even Numbers From 10 to 1");
		System.out.println();
		for (int i = 10; i >= 1; i--) // as long as i is greater than or equal to 1, 
			//decrement counter each loop
		{
			if (i % 2 == 0) // if number is divisible by 2
			{
				System.out.println(i);
			}
		}
		
	}
}
