package chapter4_Iteration;

public class IterationQ6
{
	public static void main(String[] args)
	{
		for(int i = 1; i <= 3; i++)
		{
			for(int j = 1; j <= 7; j++)
			{
				System.out.print("*");
				// System.out.println("inner loop" + j);
			}
			System.out.println();
			// System.out.println("Outer loop" + i);
		}
	}
}
