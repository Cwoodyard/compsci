import java.util.Arrays;

public class work {
    public static void main(String[] args) {
        double times[] = {
                25.6,
                100,
                26.6,
                24.6
        };
        double avTimes[] = new double[times.length - 2];
        double doubleMin = times[1];
        double doubleMax = 0.0;
        int x;
        for (x = 1; x < times.length; x++) {
            if (doubleMin > times[x]) {
                doubleMin = times[x];
            } ;
            if (doubleMax < times[x]) {
                doubleMax = times[x];
            } ;
        } ;

        int y;
        int z = 0;
        double sum = 0;
        for (y = 0; y < times.length; y++) {
            if ((times[y] != doubleMin) && (times[y] != doubleMax)) {
                avTimes[z] = times[y];
                sum += avTimes[z];
                z++;

            }
        } ;

        double finalAv = sum / avTimes.length;

        System.out.println("Times w/o max or min: " + Arrays.toString(avTimes));
        System.out.println("Final Average time is: " + finalAv);
    }
}
