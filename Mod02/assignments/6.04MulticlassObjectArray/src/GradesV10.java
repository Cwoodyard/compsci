/*  Author: Cole Woodyard
 *  Desc: Code for calculations for Tester code
 *  Version: 2/01/2021
 */
public class GradesV10 {
    private double y;
    private double x;
    private String stName;

    public GradesV10(String name) {
        stName = name;;
        x = 0.0;
        y = 0.0;
    }

    public GradesV10(String name, double g1, double g2) {
        stName = name;
        x = g1;
        y = g2;
    }

    public double calcAv() {

        double calcAvF = 0;
        if (y > x) {
            calcAvF = (y + x) / 2;
        } else {
            calcAvF = (x + y) / 2;
        }

        return calcAvF;
    }

    public double calcDif() {

        double calcDifF = 0;
        if (y > x) {
            calcDifF = y - x;
        } else {
            calcDifF = x - y;
        }
        return calcDifF;
    }

    public String getName() {
        return stName;
    }

    public double getGrade1() {
        return x;
    }

    public double getGrade2() {
        return y;
    }

    public void setName(String name) {
        stName = name;
    }

    public void setGrade1(double g1) {
        x = g1;
    }

    public void setGrade2(double g2) {
        y = g2;
    }

    @Override
    public String toString() {
        return String.format("%-9s%-10.1f%-10.1f", getName(), getGrade1(), getGrade2());
    }

}
