package NumericArray;

public class InitializingNumericArrays {
    public static void main(String[] args) {

        // Declare a numeric array of length 10
        int[] nums;
        nums = new int[10];
        // OR
        // int [] nums = new int[10];

        System.out.println("Each index position within a ");
        System.out.println("numeric array is initialized to zero:");

        // Output: traverse the array to display the numbers
        for (int n = 0; n < nums.length; n++) {
            System.out.println(" index position " + n + ": " + nums[n]);
        }
        System.out.println("The length of the array is: " + nums.length);
    }
}
