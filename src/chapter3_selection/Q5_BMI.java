package chapter3_selection;

/*
 * BEGIN
 * 	DISPLAY program name
 * 	DISPLAY prompt for weight
 * 	SET weight TO input
 * 	DISPLAY prompt for height
 * 	SET height TO input
 * 	SET bmi TO weight / height squared
 * 	DISPLAY bmi
 */

import java.util.Scanner;

public class Q5_BMI
{
	public static void main (String[] args)
	{
		double weight, height, bmi;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to our BMI calculator!");
		System.out.println("Please input weight (in kgs): ");
		weight = keyboard.nextDouble();
		System.out.println("Please input height (in meters): ");
		height = keyboard.nextDouble();
		bmi = weight / (height * height);
		System.out.println("Your BMI is: " + bmi);
		
		if (bmi < 18.5) {
			System.out.println("Underweight");
		} else if (bmi >= 18.5 && bmi < 24.9) {
			System.out.println("Healthy");
		} else if (bmi > 24.9) {
			System.out.println("Overweight");
		}
	}
	
	
}
