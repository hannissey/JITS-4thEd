package chapter5_Methods;

import java.util.Scanner;

public class MethodOverloadingExample {
	
	public static void main(String[] args) {
	
		int first, second, third;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		first = keyboard.nextInt();
		
		System.out.println("Enter second number: ");
		second = keyboard.nextInt();
		
		System.out.println("Enter third number: ");
		third = keyboard.nextInt();
		
		System.out.println( max2(first, second, third) );
		
	}
	
	// my attempt, using logical operators
	static int max(int firstIn, int secondIn, int thirdIn)
	{ 
		if(firstIn > secondIn && firstIn > thirdIn)
		 { 
			return firstIn;
		 } 
		else if (secondIn > firstIn && secondIn > thirdIn)
		 { 
			return secondIn;
		 } 
		else 
		 {
			 return thirdIn;
		 }
	}
	
	// textbook solution
	static int max2(int firstIn, int secondIn, int thirdIn)
	{
		//SET result TO first number
		int result = firstIn;
		
		// IF second number > result
		// BEGIN
		//	SET result TO second number
		// END
		if (secondIn > result) result = secondIn;

		// IF third number > result
		// BEGIN
		//	SET result TO third number
		// END
		if (thirdIn > result) result = thirdIn;
		
		// RETURN result
		return result;
	}
	

}
