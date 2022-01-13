package chapter6_Arrays;

public class RaggedArrayTriangle {
	public static void main(String[] args)
	{
		// declare and initialise ragged array
		int[][] triangle =	{
				{1},
				{6,78},
				{3,45,2},
				{89,5,0,8}
		};
		
		findMax(triangle);
	}
	
	static void findMax(int[][] arrayIn)
	{
		int max = 0;
		
		for (int row = 0; row < arrayIn.length; row++)
		{
			for (int col = 0; col < arrayIn[0].length; col++)
			{
				if (arrayIn[row][col] > max) max = arrayIn[row][col];
			}
		}
		System.out.println("The largest number in the triangle is " + max);
	}
}

