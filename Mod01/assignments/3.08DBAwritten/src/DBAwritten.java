/* Author: Cole Woodyard
 * Version: 10/28/2020
 */
import java.util.Scanner;
public class DBAwritten {
	public static Scanner in = new Scanner(System.in);
	public static double age;
	public static double price;
	public static String studentReq;
	
 	public static void mathSec() {
		double baby = 2.0;
		double preschool = 9.0;
		double schoolage = 11.0;
		double adult = 12.0;
		double seniorDiscount = 1.0;
		double studentDiscount = 1.0;
		
		if (age < 3) {
			price = baby;
			
		} else if(3 <= age && age <= 5) {
			price = preschool;
			
		} else if(6 <= age && age <= 18) {
			System.out.println("Are you a student?: y or n ");
			studentReq = in.nextLine();
			if(studentReq.equalsIgnoreCase("y")) {
				price = schoolage - studentDiscount;
			} else {
				price = schoolage;
			}
			
		} else if(18 < age && age < 65) {
			System.out.println("Are you a student?: y or n ");
			studentReq = in.nextLine();
			if(studentReq.equalsIgnoreCase("y")) {
				price = adult - studentDiscount;
			} else {
				price = adult;
			}
			
		} else if(65 <= age) {
			//give senior discount
			price = adult - seniorDiscount;
		}
		
	}
	
	
	
	public static void main(String[] args) {
			System.out.println("Please enter your full name (Ex. John Appleseed): ");
		String name = in.nextLine();
			System.out.println("Welcome to the Cool Kids Carnival, " + name);
			System.out.println("Please enter your age (ex. 15): ");
		String ageInput = in.nextLine();
		age = Double.parseDouble(ageInput);
//		System.out.println(age); //debug
		mathSec();
		
		//Substringing the name
		int positionOfSpace = name.indexOf(" ");
		String firstInit = name.substring(0,1);
		String lastName = name.substring(positionOfSpace + 1);
//		System.out.println(firstInit); //debug
//		System.out.println(lastName); //debug
		
		String userID = firstInit + lastName + ((int)(Math.random() * 999) + 1);
			System.out.println("Your userID is: " + userID);
			System.out.println("The Total will be: $" + price);
			System.out.println("Enjoy the Carnival!");

	}
}
