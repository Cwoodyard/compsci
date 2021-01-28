package StringArray;

public class InitializingStringArrays {
    public static void main(String[] args) {
        // Declare a String array of length 10.
        String[] names;
        names = new String[10];
        // OR
        // String [] names = new String[10];

        System.out.println("Each index position within a ");
        System.out.println("String array is initialized to null:");

        // Output: traverse array to display values in each index position
        for (int n = 0; n < names.length; n++) {
            System.out.println(" index position " + n + ": " + names[n]);
        }
        System.out.println("The length of the array is: " + names.length);
        System.out.println("\n\n");
    }
}
