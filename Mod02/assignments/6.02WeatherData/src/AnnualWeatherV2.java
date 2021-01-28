import java.util.Scanner;

/*  Author: Cole Woodyard
 *  Desc: Main code to run for declaring what parameters you want for the 
 *  project and outputting the results
 *  Version: 1/25/2021
 */
public class AnnualWeatherV2 {
    public static void main(String[] args) {
        // initializing the calls for imperial and metric classes
        ImperialVals impVals = new ImperialVals();
        MetricMath metMath = new MetricMath();

        // adding in Scanner
        Scanner scan = new Scanner(System.in);

        // Declaration Code
        String[] months = { // made the months array
                "Jan.",
                "Feb.",
                "Mar.",
                "Apr.",
                "May",
                "Jun.",
                "Jul.",
                "Aug.",
                "Sep.",
                "Oct.",
                "Nov.",
                "Dec."
        };

        // Selection Process
        System.out.println("How would you like your temperature data provided to you today?");
        System.out.println("C for celcius or F for Fahrenheit: ");
        String tempType = scan.nextLine();

        System.out.println("How would you like your precipitation data provided to you today?");
        System.out.println("Cm for centimeters or In for Inches: ");
        String precType = scan.nextLine();

        // main code
        double finalAvTemp = 0.0;
        double finalAvPrecip = 0.0;
        double[] selectedTemp = {};
        double[] selectedPrec = {};
        switch (tempType.toLowerCase()) {
            case "c":
                for (int celcLocat = 0; celcLocat < impVals.fahrenheit.length; celcLocat++) {
                    metMath.celcius[celcLocat] = metMath.celcius(impVals.fahrenheit[celcLocat]);// add to a celcius array in the same positions
                    finalAvTemp += metMath.celcius[celcLocat];
                } ;
                finalAvTemp = finalAvTemp / metMath.celcius.length;
                selectedTemp = metMath.celcius;
                tempType = "c";
                break;
            case "f":
                for (int fahreLocat = 0; fahreLocat < impVals.fahrenheit.length; fahreLocat++) {
                    finalAvTemp += impVals.fahrenheit[fahreLocat];
                } ;
                finalAvTemp = finalAvTemp / impVals.fahrenheit.length;
                selectedTemp = impVals.fahrenheit;
                tempType = "f";
                break;
        };
        switch (precType.toLowerCase()) {
            case "in":
                for (int inLocat = 0; inLocat < impVals.inches.length; inLocat++) {
                    finalAvPrecip += impVals.inches[inLocat];
                } ;
                finalAvPrecip = finalAvPrecip / impVals.inches.length;
                selectedPrec = impVals.inches;
                precType = "in";
                break;

            case "cm":
                for (int cmLocat = 0; cmLocat < impVals.inches.length; cmLocat++) {
                    metMath.centimeters[cmLocat] = metMath.centimeters(impVals.inches[cmLocat]);
                    finalAvPrecip += impVals.inches[cmLocat];

                } ;
                finalAvPrecip = finalAvPrecip / impVals.inches.length;
                selectedPrec = metMath.centimeters;
                precType = "cm";
                break;
        }
        // Final Output
        System.out.println("Welcome to the Orlando Weather Data Center");
        System.out.println("Location: Orlando, FL");
        System.out.printf("%-9s%-19s%-20s%n", "Month", "Temperature (" + tempType + ")", "Precipitation (" + precType + ")");
        System.out.println("********************************************");
        for (int monthCountdown = 0; monthCountdown < months.length; monthCountdown++) {
            System.out.printf("%-9s%-19.1f%-20.3f%n", months[monthCountdown], selectedTemp[monthCountdown], selectedPrec[monthCountdown]);
        } ;
        System.out.println("********************************************");
        System.out.printf("%-16s%-4.2f%n%-16s%-4.2f%n", "Average Temperature: ", finalAvTemp, "Annual Precipitation: ", finalAvPrecip);
        System.out.println();
        scan.close();

    }
}
