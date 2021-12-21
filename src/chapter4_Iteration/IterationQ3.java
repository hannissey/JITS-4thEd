package chapter4_Iteration;
import java.util.Scanner;

public class IterationQ3
{
	public static void main(String[] args)
	{
		int num;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num = keyboard.nextInt();
		
		for (int i = 1; i < num; i++)
		{
			System.out.println("YES");
			System.out.println("NO");
		}
		System.out.println("OK");
	}
}
