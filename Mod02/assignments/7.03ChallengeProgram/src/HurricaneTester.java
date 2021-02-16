
/**
 * Starter code for the Hurricane Tester
 * APCS Team 2020
 * @note Code was initially formatted by FLVS directors and has been modified to complete the needed assignment
 * @author Cole Woodyard
 * @version 2/15/2021
 *
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HurricaneTester

{

    public static void main(String[] args) throws IOException {
        // read data from text file & put in an array
        File fileName = new File("hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;

        // count number of lines in text file
        while (inFile.hasNextLine()) {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();

        // initialize arrays based on lines counted in text file
        int[] years = new int[numValues];
        String[] months = new String[numValues];
        int[] pressures = new int[numValues];
        double[] windSpeeds = new double[numValues];
        String[] names = new String[numValues];

        // read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while (inFile.hasNext()) {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();

        // convert the windspeed, determine categories, calculate sums
        double conversionFormula = 1.150779;

        for (int i = 0; i < windSpeeds.length; i++) {
            windSpeeds[i] = windSpeeds[i] * conversionFormula;
        }

        // create a Hurricane ArrayList using the data above
        ArrayList<Hurricane> caneBoi = new ArrayList<Hurricane>();
        for (int i = 0; i < index; i++) {
            caneBoi.add(new Hurricane(years[i], names[i], months[i], 0, pressures[i], windSpeeds[i]));
        }
        int i = 0;
        for (Hurricane dataRecord : caneBoi) {
            dataRecord.setYear(years[i]);           // set year in array
            dataRecord.setName(names[i]);           // set name in array
            dataRecord.setPressure(pressures[i]);   // set pressure in array
            dataRecord.setWindspeed(windSpeeds[i]); // set windspeed in array
            dataRecord.setMonth(months[i]);         // set month in array

            if (windSpeeds[i] >= 74 && windSpeeds[i] <= 95) {  // set category in array
                dataRecord.setCat(1);
            } else if (windSpeeds[i] >= 96 && windSpeeds[i] <= 110) {
                dataRecord.setCat(2);
            } else if (windSpeeds[i] >= 111 && windSpeeds[i] <= 129) {
                dataRecord.setCat(3);
            } else if (windSpeeds[i] >= 130 && windSpeeds[i] <= 156) {
                dataRecord.setCat(4);
            } else if (windSpeeds[i] >= 157) {
                dataRecord.setCat(5);
            }
            i++;
        }

        // user prompted for range of years
        Scanner range = new Scanner(System.in);
        System.out.println("What is the first year you would you like to see?");
        int firstYear = range.nextInt();
        System.out.println("What is the last year you would you like to see?");
        int lastYear = range.nextInt();
        // print the data
        int cat1 = 0;
        int cat2 = 0;
        int cat3 = 0;
        int cat4 = 0;
        int cat5 = 0;

        double minCat = Double.MAX_VALUE;
        double maxCat = Double.MIN_VALUE;
        int avCat = 0;
        double minPressure = Double.MAX_VALUE;
        double maxPressure = Double.MIN_VALUE;
        int avPressure = 0;
        double minWind = Double.MAX_VALUE;
        double maxWind = Double.MIN_VALUE;
        int avWind = 0;
        int outCount = 0;

        System.out.printf("%-10s %-13s %-12s %-14s %-10s ", "Year", "Hurricane", "Category", "Pressure (mb)", "Wind Speed (MPH)");
        System.out.println("");
        System.out.println("=====================================================================");
        for (Hurricane output : caneBoi) { // if hurricane year >= firstYear && hurricane year <= lastYear
            if (output.getYear() >= firstYear && output.getYear() <= lastYear) { // then Output said year
                System.out.println(output);
                if (output.getCat() < minCat) minCat = output.getCat();
                if (output.getCat() > maxCat) maxCat = output.getCat();
                avCat += output.getCat();
                if (output.getCat() == 1) cat1++;
                if (output.getCat() == 2) cat2++;
                if (output.getCat() == 3) cat3++;
                if (output.getCat() == 4) cat4++;
                if (output.getCat() == 5) cat5++;
                if (output.getPressure() < minPressure) minPressure = output.getPressure();
                if (output.getPressure() > maxPressure) maxPressure = output.getPressure();
                avPressure += output.getPressure();
                if (output.getWindspeed() < minWind) minWind = output.getWindspeed();
                if (output.getWindspeed() > maxWind) maxWind = output.getWindspeed();
                avWind += output.getWindspeed();
                outCount++;
            }
        }
        System.out.println("=====================================================================");
        System.out.println("");
        System.out.printf("%-24s %-12.1f %-14.1f %-10.2f", "           Average:", (double) avCat / outCount, (double) avPressure / outCount, (double) avWind / outCount);
        System.out.println("");
        System.out.printf("%-24s %-12.1f %-14.1f %-10.2f", "           Minimum:", minCat, minPressure, minWind);
        System.out.println("");
        System.out.printf("%-24s %-12.1f %-14.1f %-10.2f", "           Maximum:", maxCat, maxPressure, maxWind);
        System.out.println("");
        System.out.println("");
        System.out.println("Summary of Categories: ");
        System.out.println("  Cat 1: " + cat1);
        System.out.println("  Cat 2: " + cat2);
        System.out.println("  Cat 3: " + cat3);
        System.out.println("  Cat 4: " + cat4);
        System.out.println("  Cat 5: " + cat5);
    }
}
