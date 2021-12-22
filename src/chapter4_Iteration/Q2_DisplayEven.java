package chapter4_Iteration;

import java.util.Scanner;

public class Q2_DisplayEven {
	public static void main(String[] args)
	{
		int num;
		
		System.out.println("*** Even Numbers From 1 to 20 ***");
		System.out.println();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input a number: ");
		num = keyboard.nextInt();
		
		for (int i = 1; i <= num; i++) // as long as i is greater than or equal to 1, 
			//decrement counter each loop
		{
			if (i % 2 == 0) // if number is divisible by 2
			{
				System.out.println(i + " is even.");
			} else {
				System.out.println(i + " is odd.");
			}
			
		}
		
	}
}
