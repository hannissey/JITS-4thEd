package chapter9_Inheritance;

public class Q3_SecondHandVehicleTester {

	public static void main(String[] args)
	{
		
		SecondHandVehicle ka = new SecondHandVehicle("MA58 WEV", "Ford", 2003, 5000, 2);
		SecondHandVehicle ibiza = new SecondHandVehicle("KE67 QAY", "Seat", 2017, 6000, 1);
		SecondHandVehicle mondeo = new SecondHandVehicle("AS23 UIP", "Ford", 2005, 8000, 3);
		
		System.out.print( 
				"Car on sale! A " + mondeo.getMake() + " Reg Number " + mondeo.getRegNo() 
				+ " manufactured in " + mondeo.getYearOfManufacture() + ". With only " +
				mondeo.getNumberOfOwners() + " previous owners. Now only £"
				+ mondeo.getValue()
				);
	}
	
}
