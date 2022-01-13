package chapter6_Arrays;

import java.util.Scanner;

public class Q8_RaggedArrayTriangle {
	public static void main(String[] args)
	{
		// declare and initialise ragged array
		int[][] triangle =	{
				{0},
				{0,0},
				{0,0,0},
				{0,0,0,0}
		};
		
		fillArray(triangle);
		findMax(triangle);
		displayArray(triangle);
	}
	
	static void fillArray(int[][] arrayIn)
	{
		Scanner keyboard = new Scanner(System.in);
		for (int row = 0; row < arrayIn.length; row++)
		{
			for (int col = 0; col < arrayIn[row].length; col++)
			{
				System.out.println("Please input value for " +row+ "," +col);
				arrayIn[row][col] = keyboard.nextInt();
			}
		}
	}
	
	static void findMax(int[][] arrayIn)
	{
		int max = 0;
		
		for (int row = 0; row < arrayIn.length; row++)
		{
			for (int col = 0; col < arrayIn[row].length; col++)
			{
				if (arrayIn[row][col] > max) max = arrayIn[row][col];
			}
		}
		System.out.println("The largest number in the triangle is " + max);
	}
	
	static void displayArray(int[][] arrayIn)
	{
		System.out.println("\nThe Triangle!\n");
		for (int row = 0; row < arrayIn.length; row++)
		{
			for (int col = 0; col < arrayIn[row].length; col++)
			{
				System.out.print(arrayIn[row][col] + " ");
			}
		System.out.println();
		}
	}
	

}

