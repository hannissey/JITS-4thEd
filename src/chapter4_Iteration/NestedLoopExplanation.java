package chapter4_Iteration;

public class NestedLoopExplanation {
	public static void main(String[] args)
	{
		for(int i = 1; i <= 5; i++)
		{
			// note the new int counter name
			// we can't use i again
			for (int j = 1; j <= 1; j++)
			{
				System.out.println("Inside loop");
			}
			System.out.println("Outside loop");
		}
	}
}

// This will print:
//Inside loop
//Outside loop
//Inside loop
//Outside loop
//Inside loop
//Outside loop
//Inside loop
//Outside loop
//Inside loop
//Outside loop