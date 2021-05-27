import java.util.ArrayList;

public class tipMe {
    public static void main(String[] args) {

//        System.out.println("User Tip of 20% for a meal of $100: " + calcTip(20, 100));
//        System.out.println("Default Tip of 17.5% for a meal of $100: " + calcTip(100));

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("be happy");
        arr.add("happy");
        arr.add("I am happy");
        arr.add("happy happy joy joy");
        arr.add("happy");

        System.out.println(countOccurances(arr, "happy"));
    }

    public static int countOccurances(ArrayList arr, String str) {
        int times = 0;
        int loc = 0;

        for (int i = 0; i < arr.size(); i++) {
            arr.indexOf(str);
            times++;
        }

        return times;

    }

    public static void removeValue(ArrayList<Integer> aList, int val) {
        int i;

        for (i = 0; i < aList.size(); i++) {
            if (aList.get(i) == val) {
                aList.remove(i);
            }
        }
    }

    public static int test(int n) {
        if (n == 0)
            return 3;
        else return 2 * test(n - 1);
    }

    public static int mystery(int n) {
        if (n > 6) {
            return 1 + mystery(n - 1);
        }
        return n % 3;
    }

//    // post condition: returns the amount of the tip
//    private static final double defaultTip = 17.5;
//
//    public static double calcTip(double mealCost) {
//
//        double finalTip = defaultTip / mealCost * 100;
//
//        return finalTip;
//
//    }
//
//    public static double calcTip(double percent, double mealCost) {
//        double finalTip = percent / mealCost * 100;
//
//        return finalTip;
//
//    }
//
//    // second method to be written here
}
