
/**
 * @purpose The main code for outputting data or requesting calculations for values imported to the array
 * @note Code was initially formatted by FLVS directors and has been modified to complete the needed assignment
 *
 * @author Cole Woodyard
 * @version 2/14/2021
 *
 */
import java.util.ArrayList;

public class CheeseCakeTesterV2 {
    public static void main(String[] args) {
        // initializing and declaring an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV2> cake = new ArrayList<CheeseCakeV2>();
        // add CheeseCake to the ArrayList
        cake.add(new CheeseCakeV2("Blueberry", 2));
        cake.add(new CheeseCakeV2("Vanilla", 20));
        cake.add(new CheeseCakeV2("New York", 2));
        cake.add(new CheeseCakeV2("Raspberry", 12));
        cake.add(new CheeseCakeV2("Chocolate", 1));
        cake.add(new CheeseCakeV2("Caramel", 8));

        // printing the format of the table
        System.out.println("|       Cheese Cake Data           |             Ingredient Calculations              |");
        System.out.println("| Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar    |  Vanilla  |");
        System.out.println("|-------|----------|---------------|--------------|----------|------------|-----------|");
        int index = 0;
        for (CheeseCakeV2 dataRecord : cake) { // felt it was more appropriate to be using a for-each loop rather than a for
                                               // loop as it allows me to calculate individually while directly outputting the
                                               // data right after

            // invoke methods
            dataRecord.calcCreamCheese();
            dataRecord.calcTotalServings();
            dataRecord.calcSugar();
            dataRecord.calcVanilla();
            System.out.printf("%-6s %-78s %n", ("| " + index), (" " + dataRecord));
            index++;

        }

    }
}
