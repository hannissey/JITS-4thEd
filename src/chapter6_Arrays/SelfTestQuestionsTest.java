package chapter6_Arrays;

import java.util.Scanner;

public class SelfTestQuestionsTest {

	public static void main(String[] args)
	{
		//int[] someArray = {2,5,1,9,11};
		
		int[] someArray = new int[5];
		
		someArray[0] = 2;
		someArray[1] = 5;
		someArray[2] = 1;
		someArray[3] = 9;
		someArray[4] = 11;	
		
		System.out.print(someArray.length
				+ "\n" + someArray[2]
				//+ "\n" + someArray[6]					
				);
		
		
		System.out.println("\n\nOnly displays items greater than 2");
		for (int item : someArray)
		{
			if (item > 2)
			{
				System.out.println(item);
			}
		}
		
		System.out.println("\n\nDoubles the value!");
		
		for (int i = 0; i < someArray.length; i++)
		{
			// This modifies the array
			System.out.println(someArray[i] = someArray[i] * 2);
		} 
		
		System.out.println();
		
		for (int item : someArray)
		{
			// This does not modify the array
			System.out.println(item = item * 2);
		}
		
		for (int item : someArray)
		{
			System.out.println(item);
		}		
	
	}
	
}
