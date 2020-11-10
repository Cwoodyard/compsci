/*
 * want to have a function where it will first run for 1000+ times,
 * next want to have a function that will edit/create a file that will log results
 * finally want to build a categorization tool to seperate each breed of cat
 * if it detects a Sphynx cat, it will reset the overall trial count and build from there
 * 
 * Sphynx
 * Calico
 * Persian
 * Siamese
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class AnimalPopulation {
	//identifying the needed variables as public since they will be used in more than 1 function
	public static int Calico = 0; // rolls a 1
	public static int Persian = 0; // rolls a 2
	public static int Siamese = 0; // rolls a 3
	public static int Siberian = 0; // rolls a 4
	public static int Ocicat = 0; // rolls a 5
	public static int Sphynx = 0; // rolls a 6
	public static int totalCounter = 0; // Used to count a total
	public static String animal = "Cat";
	public static String detected = " ";
	
	//Identifying needed functions before the main to make it more organized for myself
	public static void writer(int trial) throws FileNotFoundException { //plan to use this as a way to write to the file
		PrintWriter rawFile = new PrintWriter(new File("raw.txt"));
		rawFile.println("Trial " + trial + " had: ");
		rawFile.println(" Calico: " + Calico);
		rawFile.println(" Persian: " + Persian);
		rawFile.println(" Siamese: " + Siamese);
		rawFile.println(" Siberian: " + Siberian);
		rawFile.println(" Ocicat: " + Ocicat);
		rawFile.println(" Sphynx: " + Sphynx);
		rawFile.close( );
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		for (int trial = 1; trial <= 1000; trial++) {
			
			detected = " ";
			totalCounter = 0;
			System.out.println("******************************");
			System.out.println("Trial: " + trial);
			while(!detected.equalsIgnoreCase("Sphynx")) {
				int diceRoll = (int) (Math.random() * 6) + 1; // Roll Dice 
					
				if((int)diceRoll == 1) { // Calico
					totalCounter++;
					Calico++;
					System.out.println("Number: " + diceRoll);
					System.out.println("Found a Calico");
					
					
				} else if ((int)diceRoll == 2) { // Persian
					totalCounter++;
					Persian++;
					System.out.println("Number: " + diceRoll);
					System.out.println("Found a Persian");
					
					
				} else if ((int)diceRoll == 3) { // Siamese
					totalCounter++;
					Siamese++;
					System.out.println("Number: " + diceRoll);
					System.out.println("Found a Siamese");
					
					
				} else if ((int)diceRoll == 4) { // Siberian
					totalCounter++;
					Siberian++;
					System.out.println("Number: " + diceRoll);
					System.out.println("Found a Siberian");
					
					
				} else if ((int)diceRoll == 5) { //Ocicat
					totalCounter++;
					Ocicat++;
					System.out.println("Number: " + diceRoll);
					System.out.println("Found a Ocicat");
					
					
				} else { // Sphynx
					totalCounter++;
					Sphynx++;
					detected = "Sphynx";
					System.out.println("Number: " + diceRoll);
					System.out.println("Found a Sphynx");
					
					
				}
				System.out.println("Round: " + totalCounter);
				
			}
			System.out.println("******************************");
			System.out.println();
			writer(trial);
			
			
		}
	}
}
