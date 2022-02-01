package chapter9_Inheritance;

public class EmployeeTester {

	public static void main(String[] args)
	{
		FullTimeEmployee fte = new FullTimeEmployee("A123", "Ms Full-Time", 25000);
		PartTimeEmployee pte = new PartTimeEmployee("B456", "Mr Part-Time", 30);
		testMethod(fte);
		testMethod(pte);
		
	}
	
	// we can call any object of either the Employee, PartTimeEmployee or FullTimeEmployee class
	// using the superclass name in the method call. 
	static void testMethod(Employee employeeIn)
	{
		System.out.println(employeeIn.getName());
		//The below won't compile because the method belongs to a subclass of Employee
		//System.out.println(employeeIn.getAnnualSalary());
	}
}
