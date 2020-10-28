/*	Author: Cole Woodyard
 *  Version: 10/28/2020
 *  Description: Calculate your TDEE based on gender, and BMR
 */
import java.util.Scanner;
public class TDEE {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double activityFactor = 0.0;
		double TDEE = 0.0;
		
		System.out.println("What is your Name? (First Last): ");
		String fName = in.next();
		String lName = in.nextLine();
		System.out.println("What is your gender? (M or F): ");
		String gender = in.nextLine();
		System.out.println("What is your BMR? (round to the nearest tenth): ");
		double bmr = in.nextInt();
		
		System.out.println("Hello. Welcome to the activity selection menu.");
		System.out.println("[A] Resting (Sleeping, reclining)");
		System.out.println("[B] Sedentary (Minimal movement, mainly sitting/lying down)");
		System.out.println("[C] Light (Office work, sitting)");
		System.out.println("[D] Moderate (Light manual labor)");
		System.out.println("[E] Very Active (Hard manual labor)");
		System.out.println("[F] Extremely Active (Heavy manual labor)");
		System.out.println("Please select an acivity above for your TDEE: ");
		String activitySelect = in.next();
		System.out.println();

			if(activitySelect.equalsIgnoreCase("A")) //resting
	        {
				if(gender.equalsIgnoreCase("M")) {
					TDEE = bmr * 1;
					activityFactor = 1.0;
	        	} 
				else {
					TDEE = bmr * 1;
					activityFactor = 1.0;
	        	}
	        }
			else if(activitySelect.equalsIgnoreCase("B")) //sedentary
	        {
	        	if(gender.equalsIgnoreCase("M")) {
	        		TDEE = bmr * 1.3;
	        		activityFactor = 1.3;
	        	} 
				else {
					TDEE = bmr * 1.3;
					activityFactor = 1.3;
	        	}
	        }
	        else if(activitySelect.equalsIgnoreCase("C")) //light
	        {
	        	if(gender.equalsIgnoreCase("M")) {
	        		TDEE = bmr * 1.6;
	        		activityFactor = 1.6;
	        	} 
				else {
					TDEE = bmr * 1.5;
					activityFactor = 1.5;
	        	}
	        }
	        else if(activitySelect.equalsIgnoreCase("D")) //moderate
	        {
	        	if(gender.equalsIgnoreCase("M")) {
	        		TDEE = bmr * 1.7;
	        		activityFactor = 1.7;
	        	} 
				else {
					TDEE = bmr * 1.6;
					activityFactor = 1.6;
	        	}
	        }
	        else if(activitySelect.equalsIgnoreCase("E")) //very Active
	        {
	        	if(gender.equalsIgnoreCase("M")) {
	        		TDEE = bmr * 2.1;
	        		activityFactor = 2.1;
	        	} 
				else {
					TDEE = bmr * 1.9;
					activityFactor = 1.9;
	        	}
	        }
	        else if(activitySelect.equalsIgnoreCase("F")) //Extremely active
	        {
	        	if(gender.equalsIgnoreCase("M")) {
	        		TDEE = bmr * 2.4;
	        		activityFactor = 2.4;
	        	} 
				else {
					TDEE = bmr * 2.2;
					activityFactor = 2.2;
	        	}
	        }
	        else
	        {
	             System.out.println("You did not choose a valid menu option!");
	             
	        }
		
		System.out.println("==================");
		System.out.println("The Results are in");
		System.out.println("Name: " + fName + lName + "	Gender: " + gender);
		System.out.println("BMR: " + bmr + "		Activity Factor: " + activityFactor);
		System.out.println("TDEE: " + TDEE + " Calories");	
	}
}
