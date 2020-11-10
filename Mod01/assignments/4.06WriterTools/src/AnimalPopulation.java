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
public class AnimalPopulation {
	public static int Sphynx = 0;
	public static int Calico = 0;
	public static int Persian = 0;
	public static int Siamese = 0;
	public static int Siberian = 0;
	public static int Ocicat = 0;
	public static String animal = "Cat";
	public static String detected = " ";
	
	public static void main(String[] args) {
		
		for (int trial = 0; trial < 1000; trial++) {
			
			while(Sphynx != 1) {
				if(detected.equalsIgnoreCase("Calico")) {
					Calico++;
				} else if(detected.equalsIgnoreCase("Persian")) {
					Persian++;
				} else if(detected.equalsIgnoreCase("Siamese")) {
					Siamese++;
				} else if(detected.equalsIgnoreCase("Siberian")) {
					Siberian++;
				} else {
					Ocicat++;
				}
			} 
			Sphynx++;
			trial = 0;
			
		}
	}
}
