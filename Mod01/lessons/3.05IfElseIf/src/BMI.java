/* Author: Cole Woodyard
 * Description: To calculate you BMI and make you sad about your weight
 * Version: 10.14.2020
 */

import java.util.Scanner;
public class BMI {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("What is your first and Last Name? (first last): ");
		String firstName = in.next();
		String lastName = in.nextLine();
		System.out.println("What is your height? (inches): ");
		int heightIn = in.nextInt();
		System.out.println("What is your weight? (pounds): ");
		int weightLbs = in.nextInt();

		double heightM = heightIn / 39.37;
        double weightKg = weightLbs / 2.2;

		double BMI = (double)(weightKg)/(Math.pow(heightM, 2));
//		double BMI = 25.54;
		
		String status = " ";
		if(BMI <= 18.5)
			status = "underweight";
		else if(BMI <= 24.9)
			status = "Normal";
		else if(BMI <= 29.9)
			status = "Overweight";
		else
			status = "Obese";
		
		System.out.println("\nCurrent BMI Status");
		System.out.println("=====================");
		System.out.println("Name: " + firstName + lastName);
		System.out.println("Height (m): " + (int)heightM);
		System.out.println("Weight (kg): " + (int)weightKg);
		System.out.println("BMI: " + (int)BMI);
		System.out.println("Category: " + status);
//		System.out.println(status);
//		System.out.println(BMI);
//		System.out.println(heightM);
//		System.out.println(weightKg);
		
		
	}
}
