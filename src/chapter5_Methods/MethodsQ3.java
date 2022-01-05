package chapter5_Methods;

public class MethodsQ3 {
	public static void main(String[] args)
	{
		System.out.println(myMethod(3, 5));
		System.out.println(myMethod(3, 5, 10));
	}
	
	static int myMethod(int firstIn, int secondIn, int thirdIn)
	{
		return firstIn + secondIn + thirdIn;
	}
	
	static int myMethod(int firstIn, int secondIn)
	{
		return firstIn - secondIn;
	}
}
