package chapter4_Iteration;

public class DisplayEven2 {
	public static void main(String[] args)
	{
		System.out.println("*** Even Numbers from 10 to 1 ***");
		System.out.println();
		for (int i = 10; i >= 1; i-- )
		{
			if (i % 2 != 0) // if number is not divisible by 2, ie, odd
			{
				System.out.println("This would display " + i 
						+ " but the continue statement skips the iteration.");
				continue;
			}
			System.out.println(i); // this line only prints the even numbers
		}
	}
}

/*
 *  OUTPUT:
 
 *** Even Numbers from 10 to 1 ***

10
This would display 9 but the continue statement skips the iteration.
8
This would display 7 but the continue statement skips the iteration.
6
This would display 5 but the continue statement skips the iteration.
4
This would display 3 but the continue statement skips the iteration.
2
This would display 1 but the continue statement skips the iteration.

 */
