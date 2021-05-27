/**
 * @purpose Main Calculation and handling code for YeetMasterTester.java
 *
 * @author  Cole Woodyard
 * 
 * @version 5/6/2021
 *
 */
public class YeetMaster {
    private double fastness;
    private double looker;
    private double yeetStrength;

    YeetMaster() {

    }

    YeetMaster(int speed, int angle) {
        fastness = speed;
        looker = angle;
    }

    public double getFastness() {
        return fastness;
    }

    public double getLooker() {
        return looker;
    }

    public double getYeetStrength() {
        return yeetStrength;
    }

    public void calcYeetStrength() {
        double yeetnessMS = (fastness * 1609.344) / (60 * 60); // transition miles to meters. used convertunits.com

        System.out.println("debug yeetnessMS: " + yeetnessMS);
        System.out.println("debug looker: " + looker);
        System.out.println("debug Math.pow(yeetnessMS, 2.0): " + Math.pow(yeetnessMS, 2.0));
        System.out.println("debug Math.toRadians(looker): " + Math.toRadians(looker));
        System.out.println("debug Math.toRadians(looker): " + Math.toRadians(looker) * 2);
        System.out.println("debug Math.sin(2 * Math.toRadians(looker)): " + Math.sin(Math.toRadians(looker) * 2));

        yeetStrength = Math.pow(yeetnessMS, 2.0) * Math.sin(2 * Math.toRadians(looker)) / 9.8;
    }
}
