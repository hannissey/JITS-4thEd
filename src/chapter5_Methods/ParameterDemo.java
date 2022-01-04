package chapter5_Methods;

public class ParameterDemo {

		public static void main(String[] args)
		{
			int x = 10;
			// You cannot println a void method output
			// Uncomment the line below to see:
			// System.out.println( demoMethod(x) );
			demoMethod(x);
			System.out.println("The original variable: " + x);
		}
		
		static void demoMethod(int xIn)
		{
			xIn = 25;
			System.out.println(xIn);
		}
}
