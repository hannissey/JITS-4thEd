package chapter4_Iteration;

public class IterationQ5
{
	public static void main(String[] args)
	{
		for (int i = 5; i >=2; i++)
		{
			switch (i)
			{
				case 1: case 3: System.out.println("YES" + i); break;
				case 2: case 4: System.out.println("NO" + i);
			}
		}
		System.out.println("OK");
	}
}