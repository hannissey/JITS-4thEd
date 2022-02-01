package chapter9_Inheritance;

public class EmployeeTester2 {

	public static void main(String[] args)
	{
		FullTimeEmployee fte = new FullTimeEmployee("A123", "Ms Full-Time", 2500);
		PartTimeEmployee pte = new PartTimeEmployee("B456", "Mr Part-Time", 30);
		
		testMethod(fte);
		testMethod(pte);
	}
	
	static void testMethod(Employee employeeIn)
	{
		System.out.println(employeeIn.getStatus());
	}
}
