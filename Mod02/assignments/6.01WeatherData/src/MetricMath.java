/*  Author: Cole Woodyard
 *  Desc: Code to calculate the needed Metric values for the Annual Weather program
 *  Version: 1/19/2021
 * 
 */
public class MetricMath {
    double[] centimeters = new double[12];

    public double centimeters(double in) {
        double finalCm = 0;
        finalCm = in * 2.54;
        return finalCm;
    };

    double[] celcius = new double[12];

    public double celcius(double f) {
        double finalC = 0;
        finalC = (f - 32) / 1.8;
        return finalC;
    };
}
