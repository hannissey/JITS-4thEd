package chapter6_Arrays;

import java.util.Scanner;

public class Q3_StudentScores {
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to EXAMAC, storing and manipulating grades!");
		int[] results = enterExamMarks();
		displayMarks(results);
		increaseMarks(results);
		displayMarks(results);
		boolean success = allHavePassed(results);
		System.out.println("Did everyone pass? " + success);
	}
	
	// Methods
	
	static int[] enterExamMarks()
	{
		int[] examMarksOut = new int[10];
		
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 0; i < examMarksOut.length; i++)
		{
			System.out.println("Please enter exam mark for Student " + (i + 1) + " : ");
			examMarksOut[i] = keyboard.nextInt();
		}
		
		return examMarksOut;
	}
	
	static void displayMarks(int[] examMarksIn)
	{
		System.out.println("\nStudent marks: ");
		for (int item : examMarksIn)
		{
			System.out.println(item);
		}
	}
	
	static void increaseMarks(int[] examMarksIn)
	{
		for(int i = 0; i < examMarksIn.length; i++)
		{
			examMarksIn[i] = examMarksIn[i] + 5;
		}
	}
	
	static boolean allHavePassed(int[] examMarksIn)
	{
		System.out.println("Has everyone passed?");
		int sum = 0;
		
		for(int i = 0; i < examMarksIn.length; i++)
		{
			sum = sum + examMarksIn[i];
		}
		
		double result = sum / examMarksIn.length;
		return (result >= 40);
	}
}
