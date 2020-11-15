
/*
 * Author: Cole Woodyard
 * Version: r11.15.20
 * 
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AnimalPopulation {
    // identifying the needed variables as public since they will be used in more
    // than 1 function

    private static int totalCounter = 0; // Used to count a total

    public static enum Cats { // used enums rather than a sting list to make life a bit easier and less memory
                              // being used instead of identifying what each math.random int is within main
                              // code (more organized and clean)
        CALICO,
        PERSIAN,
        SIAMESE,
        SIBERIAN,
        OCICAT,
        SPHYNX;

        public int count;
    }

    public static void main(String[] args) throws FileNotFoundException { // started the function main
        int totalRounds = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome, how many trials would you like to conduct?\n" + "We only accept over 1000 trials: ");
        int trialRequestAmount = in.nextInt();
        if (trialRequestAmount <= 1000) { // identifies if the requested amount is less than 1000, if so it terminates
                                          // the program and requests the user to restart
            System.out.println("That value was incorrect, please try again. How many trials would you like to conduct?\n" + "We only accept over 1000 trials: ");
            trialRequestAmount = in.nextInt();
        }
        in.close(); // closes the Scanner to prevent memory leak
        System.out.println("Thank you, Processing: "); // outputs a processing message to the console

        PrintWriter pw = new PrintWriter(new File("results.txt")); // used printwriter to state this is our document

        for (int trial = 1; trial <= trialRequestAmount; trial++) { // started a for loop for a thousand trials

            totalCounter = 1; // sets the total amount of cats to 0 every trial loop
//            System.out.println("******************************"); // part of the console output as divider
//            System.out.println("Trial: " + trial); // states in console what trial we are on
            while (totalCounter <= 20) { // set a max and told it to stop if it hits the max
                Cats result = Cats.values()[ThreadLocalRandom.current().nextInt(Cats.values().length)]; // ThreadLocalRandom is used instead of the math.random (better memory) | states
                                                                                                        // that each item within the enum is an int
                result.count++; // tells that for each result it is to increase the counter for that result

                pw.println("Trial " + trial + " had: "); // prints the "trial (trial Number) had: " to the output file
                for (Cats breed : Cats.values()) { // starts a for loop where it tells that each enum line is a breed and that each
                                                   // breed has a value
                    pw.print(breed.name()); // prints the breed name to the file
                    pw.print(" had "); // prints had to the output file
                    pw.print(breed.count); // prints the count of how many times that breed/cat has been counted up
                    pw.println(); // prints a new line to make it more readable
                }
                pw.println(); // prints a new line to make it more readable
                totalRounds++;

                if (result == Cats.SPHYNX) { // told that if there is a sphynx detected, it will end the loop
                    break; // ends the loop
                }
                totalCounter++; // tells the function that there has been a full loop
            }
//            System.out.println("Rounds: " + totalCounter); // prints how many rounds each loop had in console
//
//            System.out.println("******************************"); // another divider for console
//            System.out.println(); // new line break to make the output readable in console

        }
        pw.close(); // closes the PrintWriter to prevent memory leaks
        double finalAverage = (int) (((double) totalRounds / trialRequestAmount) * 100) / 100.0; // calculates the average of all the trials
        System.out.println("The Average number of cats found before a Sphynx was found is:  " + finalAverage); // posts the final message into the console with the final average
    }
}
