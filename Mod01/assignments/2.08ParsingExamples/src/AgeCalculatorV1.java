/**
 * The purpose of this program is to calculate your age in minutes
 *
 * @author Ada Lovelace
 * @version 7/1/2019
 */
import java.util.Scanner;
public class AgeCalculatorV1
{
    public static void main(String[] args)
    {
    	//construct a Scanner object called in
        Scanner in = new Scanner(System.in);

		//ask user for input
        System.out.print("Please enter your name (first last): ");
        String firstName = in.next();
        System.out.println(firstName);
        String lastName = in.nextLine();
        System.out.println(lastName);
        System.out.print("\n");
        System.out.print("Please your age in years: ");
        String userAge = in.nextLine();
        System.out.println(userAge);
        double ageInYears = Integer.parseInt(userAge);
        System.out.println(ageInYears);

		//calculate age in minutes
        double approxAgeInDays = ageInYears * 365.25;
        System.out.println(approxAgeInDays); //
        double ageInHours = approxAgeInDays * 24;
        System.out.println(ageInHours); //
        double ageInMinutes = ageInHours * 60;
        System.out.println(ageInMinutes); //

        String firstInitial = firstName.substring(0,1);
        String name =  firstInitial + ". " + lastName;

		// display name and minutes to screen
        System.out.print("\t Age in Minutes: " + (int)ageInMinutes + "\n");
        System.out.print("Name: " + name);
        System.out.print("\t\t Age in Minutes: " + (int)ageInMinutes + "\n");
    }
}