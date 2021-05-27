
public class someObject {
    public static void main(String[] args) {
        double time = someObject.convertToSeconds(11.5);
        System.out.println(time + " seconds");
    }

    public static final double minToSeconds = 60.0;

    static double convertToSeconds(double in) {
        double seconds;
        seconds = in * minToSeconds;
        return seconds;
    }
}
