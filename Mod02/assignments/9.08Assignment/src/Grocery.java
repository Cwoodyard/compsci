import java.util.ArrayList;

public class Grocery {
    private String category;
    private int units;
    private double price;

    /* there may be other instance variables, constructors and methods not shown */
    public Grocery(String c, int u, double p) {
        category = c;
        units = u;
        price = p;

    }

    public boolean equals(Grocery g) {
        return false;
        /* implementation not shown */
    }

    public int getUnits() {
        return units;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}

class Shopping {
    private ArrayList myGroceries;

    public Shopping(Grocery[] groc) {

        /* to be implemented in part A */
        int found = 0;

        System.out.println("Find results: ");
        for (int i = 0; i < groc.length; i++) {
            if (groc[i].getCategory().compareTo(((Grocery) myGroceries.get(i)).getCategory()) == 0) {

                System.out.println(groc[i].getCategory());
                found++;
            } else {
                myGroceries.add(i, groc);
                System.out.println(groc[i].getCategory());
            }
        }

        if (found == 0) {   // we have not found the location
//            System.out.println(toFind + " is not in the roster");
        }
    }

    public Grocery findBestValue(String c) {
        return null;
        /* to be implemented in part B */

    }

    public static void findLocation(Grocery[] r, String toFind) {
        int found = 0;

        System.out.println("Find results: ");
        for (int i = 0; i < r.length; i++) {
            if (r[i].getLocation().compareTo(toFind) == 0) {
                System.out.println(r[i]);
                found++;
            }
        }

        if (found == 0) {   // we have not found the location
            System.out.println(toFind + " is not in the roster");
        }
    }
}

class iteractor {
    public static void main(String[] args) {
        Grocery[] theGroceries = {
                new Grocery("cereal", 1, 4.99),
                new Grocery("milk", 1, 4.29),
                new Grocery("cereal", 2, 7.99),
                new Grocery("cereal", 1, 4.99),
                new Grocery("candy", 48, 10.99),
                new Grocery("candy", 6, 1.00)
        };
        Shopping myShopping = new Shopping(theGroceries);
    }

}
