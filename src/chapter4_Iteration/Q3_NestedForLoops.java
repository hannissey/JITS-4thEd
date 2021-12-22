package chapter4_Iteration;

public class Q3_NestedForLoops {

	public static void main(String[] args)
	
	{
		// question 3a
		System.out.println("Answer to Question 3a");
		
		for (int a = 0; a < 3; a++)
		{
			for (int b = 0; b < 6; b++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		// question 3b
		
		System.out.println("Answer to Question 3b");
		
		for (int c = 0; c < 4; c++)
		{
			if (c == 2) {
				
				for (int d = 0; d < 2; d++)
				{
					for (int e = 0; e < 9; e++)
					{
						System.out.print("* ");
					}
					System.out.println();		
				}
			}
			
			for (int f = 0; f < 3; f++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		// question 3c
		
		System.out.println("Answer to Question 3c");
		System.out.println();
		
		// I was stuck on this for a long time! If ever in doubt, write down the
		// code if you wanted to display it without a loop, then replace that section
		// with the appropriate loop. It breaks down the problem so you can focus more
		// clearly on each individual problem.
		
		
		// runs once
		for (int w = 0; w >= 0; w--) {
			// prints 4 stars
			for (int s = 3; s >= 0; s--) {
				System.out.print("* ");
			}
			System.out.println();
			
			// runs once
			for (int x = 0; x >= 0; x--) {
				// prints 3 stars
				for (int p = 2; p >= 0; p--) {
					System.out.print("* ");
				}
				
				System.out.println();
				
				// runs once
				for (int y = 0; y >= 0; y--) {
					// prints 2 stars
					for (int q = 1; q >= 0; q--) {
						System.out.print("* ");
					}
					System.out.println();
					
					// runs once
					// prints 1 star
					for (int z = 0; z >= 0; z--) {
						System.out.print("* ");
						System.out.println();
					}
				}
			}
		} 
	}
}
