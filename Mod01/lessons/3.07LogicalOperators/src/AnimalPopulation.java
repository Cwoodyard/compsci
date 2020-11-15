 

/**
 * This program uses the Monte Carlo sampling method to estimate the average
 * number of animals observed before spotting one you are tracking
 * within a particular ecosystem.
 *
 * @author Denielle Kirk Abaquita
 * @version 13 September 2017
 *
 */

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class AnimalPopulation {

    public static void main(String[] args) throws IOException {

        // Object and Variable Declarations and Initializations
        Scanner input = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter(new File("observations.txt"));
        File fileName = new File("observations.txt");
        Scanner inFile = new Scanner(fileName);

        int numOfTrials;
        int randomNum;
        int totalCountPerTrial;

        int trialObservation;
        int totalSquirrelsObserved = 0;
        double averageNumOfSquirrels;


        // Processing 1 (Creating text file and data within)
        System.out.println("Welcome to the Fox Squirrel Simulator\n");
        System.out.print("How many trials should be simulated?\n"
                            + "Enter a value greater than 1000: ");
        String tempStr = input.next();                                  // Holds string input value temporarily

        if (Integer.parseInt(tempStr) <= 1000) {                        // checks if number is less than 1000, prompts if it is

            System.out.println("\nPlease try again. Enter a number greater than 1000.\n");

            System.out.print("How many trials should be simulated?\n"
                    + "Enter a value greater than 1000: ");
            tempStr = input.next();

        }

        System.out.println("\nsimulating trials now... one moment please...\n");

        for(numOfTrials = Integer.parseInt(tempStr); numOfTrials > 0; numOfTrials--) {        // converts and assigns to integer number of trials which is used to num of interations for loop
            boolean foxSquirrel = false;                                // initially false until there is a spotting of foxSquirrel at value of 10
            totalCountPerTrial = 0;                                     // initially 0 until trial starts in while loop

            while (!foxSquirrel) {                                      // while loop iterates until foxSquirrel is true

                randomNum = (int) (Math.random() * 11) + 1 ;                 // random number is generated

                if (randomNum == 10) {                                  // if the number is 10, a fox squirrel was spotted
                    foxSquirrel = true;
                } else {
                    totalCountPerTrial++;                                   // total count in the trial until fox squirrel was spotted
                }

            } // end of while loop

            outFile.println(totalCountPerTrial);                        // stores the count on a new line in observations.txt

        } // end of for loop

        outFile.close();                                                // closes observation.txt


        // Processing 2 (Data handling from observations.txt)
        while (inFile.hasNextInt()) {                                   // continues until all tokens are read

            trialObservation = inFile.nextInt();                        // stores Int data into a variable
            // System.out.println(trialObservation);

            totalSquirrelsObserved += trialObservation;                 // totals the number of squirrels observed when a fox squirrel is spotted

        } // end of while loop

        // System.out.println(totalSquirrelsObserved);

        inFile.close();                                                 // closes observation.txt

        numOfTrials = Integer.parseInt(tempStr);                        // parse integer value from tempStr
        averageNumOfSquirrels = (int) ( ((double) totalSquirrelsObserved / numOfTrials) * 100 ) / 100.0;     // average number of squirrels to 2 decimal places

        // Overall output
        System.out.println("The results!");
        System.out.println("The average number of squirrels observed until"
                            + " spotting a fox squirrel at the city park is: " + averageNumOfSquirrels);


    } // end of main

} // end of class
