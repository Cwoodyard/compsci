/* Author: Cole Woodyard
 * Version: 12/15/2020
 * Desc: Take input from the GradesTesterV8.java and process them
 * 
 */
public class GradesV8 {
    // private instance variables
    private String classRoom;

    // clear constructor
    public GradesV8() {
        classRoom = "null";

    }

    // loaded constructor1
    public GradesV8(String x) {
        classRoom = x;
    }

    // normal method
    public double calcAv(double g1, double g2) {

        double calcAvF = 0;
        if (g2 > g1) {
            calcAvF = (g2 + g1) / 2;
        } else {
            calcAvF = (g1 + g2) / 2;
        }

        return calcAvF;
    }

    // overload method
    public double calcAv(double g1, double g2, double g3) {

        double calcAvF = 0;

        calcAvF = (g1 + g2 + g3) / 3;

        return calcAvF;
    }
}
