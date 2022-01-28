package chapter8_ImplementingClasses;

import java.util.Scanner;

public class EasyScanner {
	
	public static int nextInt()
	{
		Scanner keyboard = new Scanner(System.in);
		int i = keyboard.nextInt();
		return i;
	}
	
	public static double nextDouble()
	{
		Scanner keyboard = new Scanner(System.in);
		double d = keyboard.nextDouble();
		return d;
	}
	
	public static String nextString()
	{
		Scanner keyboard = new Scanner(System.in);
		String s = keyboard.nextLine();
		return s;
	}
	
	public static char nextChar()
	{
		Scanner keyboard = new Scanner(System.in);
		char c = keyboard.next().charAt(0);
		return c;
	}
	
	public static byte nextByte()
	{
		Scanner keyboard = new Scanner(System.in);
		byte b = keyboard.nextByte();
		return b;
	}
	
	public static long nextLong()
	{
		Scanner keyboard = new Scanner(System.in);
		long l = keyboard.nextLong();
		return l;
	}
}
