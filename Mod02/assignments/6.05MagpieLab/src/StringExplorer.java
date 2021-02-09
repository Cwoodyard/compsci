/**
 * A program to allow students to try out different String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author  Cole Woodyard
 * 
 * @version 02/02/2021
 */
public class StringExplorer {

    public static void main(String[] args) {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        // Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = " + position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        // Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = " + isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = "  I know all the state capitals  ";

        // Add examples below for the following methods:
        // trim()
        System.out.println("Trim: " + sample.trim());
        // length()
        System.out.println("Length: " + sample.length());

        // indexOf with one and two parameters
        System.out.println("indexOf l: " + sample.indexOf("l"));
        // substring() with one and two parameters
        System.out.println("Substring1: " + sample.substring(1));
        System.out.println("Substring2: " + sample.substring(0, 1));
        // compareTo()
        System.out.println("Compare: " + sample.compareTo("I dont know all the sate capitals"));
        // any other String methods you'd like to try
        System.out.println("Convert to Lower case: " + sample.toLowerCase());

    }

}
