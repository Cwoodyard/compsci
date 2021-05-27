/**
 * @purpose Main code for YEETMASTER!!!!!!!!
 *
 * @author  Cole Woodyard
 * 
 * @version 5/6/2021
 *
 */
public class YeetMasterTester {

    public static void main(String[] args) {
        int[] fastnessArray = {
                50,
                60,
                70,
                80,
                90,
                100

        };

        int[] lookerArray = {
                10,
                20,
                30,
                40,
                50,
                60
        };

        double[][] yeetnessArray = new double[fastnessArray.length][lookerArray.length];
        YeetMaster yeete;

        for (int i = 0; i < yeetnessArray.length; i++) {

            System.out.println("Debug: " + yeetnessArray.length + " i: " + i);

            for (int f = 0; f < yeetnessArray.length; f++) {
                System.out.println("Debug: " + yeetnessArray[0].length + " f: " + f);
                System.out.println("Debug: " + fastnessArray[f]);

                yeete = new YeetMaster(fastnessArray[f], lookerArray[i]);
                yeete.calcYeetStrength();

                System.out.println("Debug yeetStrength: " + yeete.getYeetStrength());

                yeetnessArray[f][i] = yeete.getYeetStrength();
            }
        }

        System.out.printf("%50s\n", "Project Distance (meters)");
        System.out.printf("%5s", "MPH");

        for (int look : lookerArray) {
            System.out.printf("%10s", look + " deg");
        }

        System.out.print("\n===================================================================");

        for (int i = 0; i < yeetnessArray.length; i++) {
            System.out.printf("\n%5d", fastnessArray[i]);

            for (int f = 0; f < yeetnessArray.length; f++) {
                System.out.printf("%10.2f", yeetnessArray[i][f]);
            }
        }

    }
}
