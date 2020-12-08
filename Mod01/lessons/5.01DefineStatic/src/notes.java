import java.util.Scanner;

public class notes {

    public static double someMethod(int a, int b) {
        return (a + b) / 4;

    }

    public static void helpMe(String x) {
        int l = 0; // int to count for the for loop

        char e = 'e'; // tells what char we are looking for in the sentence

//        System.out.println(x); //debug

        int charCounter = 0; // used to output how many times the letter appears
        for (l = 0; l < x.length(); l++) { // start for loop
            char lett = x.charAt(l); // tells to grab the letter at position l in the string
//            System.out.println(x); //debug
            if (lett == e) { // if statement to tell if the letter selected is e
                charCounter++; // increases count of how many times char e shows in string
            }

        }

        System.out.println("The letter e showed up: " + charCounter + " times"); // console result output
    }

    public static void main(String[] args) {
//        someMethod(12, 14);
        Scanner scan = new Scanner(System.in);
        System.out.println("what is the string: ");
        String h = scan.nextLine();
//        System.out.println(h);

        helpMe(h);
    }
}
