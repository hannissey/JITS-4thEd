package chapter2_BuildingBlocks;

import java.util.Scanner;

public class Q6_StudentGroups {
	
	/*
	 * BEGIN
	 * 	DISPLAY program name
	 * 	DISPLAY prompt for amount of students
	 *  SET students to input
	 *  DISPLAY prompt for max number in a group
	 *  SET maxNumber to input
	 *  SET groups to students / maxNumber
	 *  SET remainder to students % maxNumber
	 *  DISPLAY amount of groups that can be created
	 *  DISPLAY amount of students left over
	 */
	
	public static void main (String[] args) {
		// attributes
		int students, maxNumber, groups, remainder;
		
		// new Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Group Decider");
		System.out.println("Please input number of students: ");
		students = keyboard.nextInt();
		
		System.out.println("Please input max number of group: ");
		maxNumber = keyboard.nextInt();
		
		groups = students / maxNumber;
		remainder = students % maxNumber;
		
		System.out.println("You can create " + groups + " with "
				+ remainder + " left over.");
		
	}

	
	

}
