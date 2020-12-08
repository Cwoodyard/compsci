/*  Author: Cole Woodyard
 *  Version: 12/7/2020
 *  Description: finding the surface gravity of the planet Mars.
 * 
 */

public class PlanetGravity {
    public static double gravity(double x, double y) { // x is for diameter, y is for mass
        double gravity = 0; // to be calculated
        double UGC = 6.67 * Math.pow(10, -11); // Universal Gravitational Constant
        double r = (x / 2) * 1000; // calculating the radius in meters from km

        gravity = Math.round(((UGC * y) / Math.pow(r, 2)) * 100);
        return gravity / 100;

    }

    public static void display(double r, double g, double m) {
        String planet = "Mars";
        System.out.println("\t\tPlanetary Data");
        System.out.println(" Planet\t Diameter (km)\t Mass (kg)\t g (m/s^2)");
        System.out.println("---------------------------------------------------------");
        System.out.println(" " + planet + " \t " + r + " \t " + m + " \t " + g);

    }

    public static void main(String[] args) {
        double diameter = 6794; // diameter of mars in km
        double mass = 6.4219e+23; // mass of mars in kg
        double gravity = gravity(diameter, mass);
        display(diameter, gravity, mass);

    }
}
