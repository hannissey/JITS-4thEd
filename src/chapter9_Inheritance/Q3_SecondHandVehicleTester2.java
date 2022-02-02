package chapter9_Inheritance;

import java.util.ArrayList;

public class Q3_SecondHandVehicleTester2 {

	public static void main(String[] args)
	{
		
		ArrayList<SecondHandVehicle> carSales = new ArrayList<>();
		
		carSales.add(new SecondHandVehicle("MA58 WEV", "Ford", 2003, 5000, 2));
		carSales.add(new SecondHandVehicle("KE67 QAY", "Seat", 2017, 6000, 1));
		
		System.out.println( 
				"Car on sale! A " + carSales.get(1).getMake() + " Reg Number " + carSales.get(1).getRegNo() 
				+ " manufactured in " + carSales.get(1).getYearOfManufacture() + ". With only " +
				carSales.get(1).getNumberOfOwners() + " previous owners. Now only £"
				+ carSales.get(1).getValue()
				);	

		SecondHandVehicle mondeo = new SecondHandVehicle("AS23 UIP", "Ford", 2005, 8000, 3);
		
		System.out.println( 
				"Car on sale! A " + mondeo.getMake() + " Reg Number " + mondeo.getRegNo() 
				+ " manufactured in " + mondeo.getYearOfManufacture() + ". With only " +
				mondeo.getNumberOfOwners() + " previous owners. Now only £"
				+ mondeo.getValue()
				);
		
		System.out.println("Does our Mondeo have previous owners? " + mondeo.hasMultipleOwners()
				+ " But it's in great condition!");
	}
	
}
