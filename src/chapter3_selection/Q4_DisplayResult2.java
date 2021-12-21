package chapter3_selection;

import java.util.Scanner;

public class Q4_DisplayResult2 
{
	public static void main (String[] args)
	{
		int mark;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What exam mark did you get?");
		mark = keyboard.nextInt();
		if (mark >= 70) 
		{
			System.out.println("Congratulations, you have been awarded a distinction!");
		}
		else if (mark >= 40 && mark < 70)
		{
			// executed when test is true
			System.out.println("Congratulations, you passed!");
		} 
		else 
		{
			// executed when test is false
			System.out.println("I'm sorry, but you failed.");
		}
		System.out.println("Good luck with your other exams.");
	}
}
