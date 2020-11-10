/* Author: Cole Woodyard
 * Version: 11.7.2020
 * Description: A tool to take in text files and will calculate the percentage 
 * of families with a certain gender group of kids. 
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Family {
	public static File fileName = new File("maleFemaleInFamily.txt");
	public static double twoBoyPercentageMain = 0.0;
	public static double twoGurlsPercentageMain = 0.0;
	public static double mixedPercentageMain = 0.0;
	public static int twoBoys = 0;
	public static int twoGurls = 0;
	public static int mixed = 0;
	public static int arrayPos = 0;
	public static String token = "";
	public static String twoBoyPercentage = "0.0";
	public static String twoGurlsPercentage = "0.0";
	public static String mixedPercentage = "0.0";
	
	public static void counting() throws FileNotFoundException {
		
        Scanner inFile = new Scanner(fileName);

        while( inFile.hasNext() )
        {
        	arrayPos++;
            token = inFile.next( );      
//            System.out.println(token);   
            
            if(token.equalsIgnoreCase("GB") || token.equalsIgnoreCase("BG")) {
            	mixed++;
//            	System.out.println("Counted: " + token + " as Mixed");
            } else if(token.equalsIgnoreCase("BB")) {
            	twoBoys++;
//            	System.out.println("Counted: " + token + " as Two Boys");
            } else {
            	twoGurls++;
//            	System.out.println("Counted: " + token + " as Two Girls");
            	
            }
        
        }//end while
        inFile.close();      //close input file

        //Calculating the Doubles
        twoBoyPercentageMain = ((double)twoBoys / (double)arrayPos) * 100;
        twoGurlsPercentageMain = ((double)twoGurls / (double)arrayPos) * 100;
        mixedPercentageMain = ((double)mixed / (double)arrayPos) * 100;
        
//        mixedPercentage = Double.parseDouble(mixedPercentageMain);
	
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		counting();
		
		System.out.println("Composition statistics for families with 2 children.");
		System.out.println("");
		System.out.println("Total number of families: " + arrayPos);
		System.out.println("");
		System.out.println("Number of Families with");
		System.out.println("\n 2 boys: " + twoBoys + " represents " + (int)twoBoyPercentageMain + " % ");
		System.out.println("\n 2 gurls: " + twoGurls + " represents " + (int)twoGurlsPercentageMain + " % ");
		System.out.println("\n 1 boy and 1 gurl: " + mixed + " represents " + (int)mixedPercentageMain + " % ");
		System.out.println("");
		System.out.println("");
	}
}
