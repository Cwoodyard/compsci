
/**
 * APCS Team
 *
 */
import java.util.Scanner;

public class StarterCode407

{
    public static void main(String[] args) {
        // initialize scanner
        Scanner in = new Scanner(System.in);

        // declare and initialize variables
        int userChoice = 0;
        int pwLength = 0;
        String password = "";
        double randomVal = 0;

        // password generator menu
        System.out.println("Password Generator");
        System.out.println("==============================================================");
        System.out.println("  [1] Only lowercase Letters    ");
        // More difficult password menu option, for example lowercase letters and
        // numbers
        // More difficult password menu option, for example lowercase letters, uppercase
        // letters and numbers
        // More difficult password menu option, for example symbols, lowercase letters,
        // uppercase letters and numbers
        System.out.println("  [5] Quit                      ");
        System.out.println("==============================================================");

        // Prompt for a menu selection

        // Check that selection meets the criteria of 1-4

        // When it is 5, loop ends and passwords are printed back from text file

        // Ask for password length

        if (userChoice == 1) {
            while (password.length() < pwLength) {
                randomVal = Math.random() * 26 + 97;
                password += (char) (randomVal);
            }
        }

        // Read passwords back from text file
    }
}
