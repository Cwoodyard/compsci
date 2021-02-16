/**
 * @purpose to calculate the needed values for the string output
 * 
 * @note    Code was initially formatted by FLVS directors and has been modified
 *          to complete the needed assignment
 *
 * @author  Cole Woodyard
 * 
 * @version 2/15/2021
 *
 */
public class CheeseCakeV2 {
    private int myQuantity, myServings, myCreamCheese, myVanilla;
    private double mySugar;
    private String myFlavor;

    /**
     * Constructor for objects of type CheeseCakeV2
     * 
     * @param flavor
     * @param quantity
     */
    CheeseCakeV2(String flavor, int quantity) {
        // ******* fill in code for constructor here ****//
        myFlavor = flavor;
        myQuantity = quantity;
    }

    /**
     * Mutator method to calculate the number of servings
     */
    public void calcTotalServings() {
        // ******* fill in code for method here - 16 servings per cake ****//
        myServings = myQuantity * 16;

    }

    /**
     * Mutator method to calculate the Cream Cheese Needed
     */
    public void calcCreamCheese() {
        // ******* fill in rest of method here - 32 ounces per cake ****//
        myCreamCheese = myQuantity * 32;
    }

    /**
     * Mutator method to calculate the Vanilla Needed
     */
    public void calcVanilla() {
        // ******* fill in rest of method here - 1 teaspoon per cake ****//
        myVanilla = myQuantity * 1;
    }

    /**
     * Mutator method to calculate the Sugar Needed
     */
    public void calcSugar() {
        // ******* fill in rest of method here - 1/3 cup per cake ****//
        mySugar = (double) myQuantity / 3;
    }

    /**
     * Getter method to return the number of cakes (no parameters)
     */
    public int getQuantity() {
        return myQuantity;
    }

    /**
     * Getter method to return flavor of the cake (no parameters)
     */
    public String getFlavor() {
        return myFlavor;
    }

    /**
     * Getter method to return amount of Sugar needed (no parameters)
     */
    public double getSugar() {
        return mySugar;
    }

    /**
     * Getter method to return amount of Cream Cheese needed (no parameters)
     */
    public int getCreamCheese() {
        return myCreamCheese;
    }

    /**
     * Getter method to return amount of Vanilla needed (no parameters)
     */
    public int getVanilla() {
        return myVanilla;
    }

    /**
     * Getter method to return number of Servings (no parameters)
     */
    public int getServings() {
        return myServings;
    }

    @Override
    public String toString() {
        // ******* Practice your printf() skills by formatting this data! ****//
        return String.format("%-2s %-7d %-2s %-12s %-2s %-11s %-2s %-7d %-2s %-2.2f %-4s %-2s %-8s %-2s", "| ", getQuantity(), "| ", getFlavor(), "| ", getCreamCheese() + " oz", "| ", getServings(), "| ", getSugar(), "cups", "| ", getVanilla() + " tsps", "| ");
    }
}
