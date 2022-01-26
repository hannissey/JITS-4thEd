package chapter8_ImplementingClasses;

/*
 *  Write a tester class to test out your Student class; it should create two or
three students (or even better an ArrayList of students), and use the
methods of the Student class to test whether they work according to the
specification
 */

import java.util.ArrayList;

public class Q2_StudentTester {

	public static void main(String[] args)
	{
		// declare ArrayList
		ArrayList<Q2_Student> studentBody = new ArrayList<>();
		
		// create new students
		studentBody.add(new Q2_Student("12345", "Jacob Crackers"));
		studentBody.add(new Q2_Student("12346", "Dale Lewis"));
		studentBody.add(new Q2_Student("12347", "Queenie Charatan"));
		
		// test methods
		// enter marks for Jacob
		studentBody.get(0).enterMarks(79,99,92);
		// enter marks for Dale
		studentBody.get(1).enterMarks(82,97,80);
		// enter marks for Queenie
		studentBody.get(2).enterMarks(88, 100, 97);
		
		// increase fee
		Q2_Student.setFee(3500);		
		
		// display ArrayList
		
		for (Q2_Student item : studentBody)
		{
			System.out.println("***** Student Details *****" + "\n"
						+ "Name:" + item.getName() + "\n"
						+ "Number: " + item.getNumber() + "\n\n"
						+ "Grades: " + "\n"
						+ "Maths: " + item.getMathsMark() + "\n"
						+ "English: " + item.getEnglishMark() + "\n"
						+ "Science: " + item.getScienceMark() + "\n"
						+ "Average Grade: " + item.calculateAverageMark() + "\n\n"
						+ "Fee paid: £" + Q2_Student.getFee() + "\n\n"
						
						);		
		}
		
		
	}
	
}
