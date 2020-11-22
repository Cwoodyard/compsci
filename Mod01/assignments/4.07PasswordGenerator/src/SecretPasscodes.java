import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/* Author: Cole Woodyard
 * Version: 11.22.2020
 * Description: Password generator that will log randomly generated passwords to a file for the user
 * 
 * 
 * 
 */
public class SecretPasscodes {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        PrintWriter pw = new PrintWriter(new File("Passwords.txt"));

        double passGenDetect = 0;
        int passCount = 0;
        int passLength = 0;
        int menuSelect = 0;
        boolean keyCard;
        boolean accessGranted;
        boolean door = true;

        System.out.println("Password Generator Menu");
        System.out.println("********************************************");
        System.out.println("* [1] Lowercase letters                    *");
        System.out.println("* [2] Uppercase and lowercase letters      *");
        System.out.println("* [3] Uppercase with numbers               *");
        System.out.println("* [4] Lowercase with numbers               *");
        System.out.println("* [5] Quit                                 *");
        System.out.println("********************************************");
        pw.println("Welcome to your Generated passwords: ");
        keyCard = false;
        accessGranted = false;

        while (!accessGranted) {

            while (door) {
                System.out.println("Please select an option from above (ex. 5): ");
                menuSelect = in.nextInt();
                if (menuSelect <= 0 || menuSelect > 5) {
                    System.out.println("    Invalid option. Please try again. ");
                } else if (menuSelect == 5) {
                    accessGranted = true;
                    keyCard = false;
                    break;
                } else {
                    keyCard = true;
                    break;
                }

            }

            while (keyCard) {
                System.out.println("How long do you want your password? (Note: length must be 6+ characters long): ");
                passLength = in.nextInt();
                if (passLength < 6) {
                    System.out.println("    Sorry, that is too short. Please try again. ");
                } else {
                    switch (menuSelect) {
                        case 1:
                            menuSelect = 1;

                            for (passCount = 1; passCount != passLength; passCount++) {
                                char randomChar = (char) ('a' + rnd.nextInt(26));

                                pw.print(randomChar);

                            }

                            break;

                        case 2:
                            menuSelect = 2;
                            for (passCount = 1; passCount != passLength; passCount++) {
                                passGenDetect = Math.random() * 10;

                                if (passGenDetect <= 5.0 && passGenDetect > 0.0) {
                                    char randomChar = (char) ('a' + rnd.nextInt(26));
                                    pw.print(randomChar);
                                } else {
                                    char randomChar = (char) ('A' + rnd.nextInt(26));
                                    pw.print(randomChar);
                                }

                            }

                            break;
                        case 3:
                            menuSelect = 3;

                            for (passCount = 1; passCount != passLength; passCount++) {
                                passGenDetect = Math.random() * 10;

                                if (passGenDetect <= 5.0 && passGenDetect > 0.0) {
                                    char randomChar = (char) ('A' + rnd.nextInt(26));
                                    pw.print(randomChar);
                                } else {
                                    char randomChar = (char) ('0' + rnd.nextInt(10));
                                    pw.print(randomChar);
                                }

                            }

                            break;
                        case 4:
                            menuSelect = 4;

                            for (passCount = 1; passCount != passLength; passCount++) {
                                passGenDetect = Math.random() * 10;

                                if (passGenDetect <= 5.0 && passGenDetect > 0.0) {
                                    char randomChar = (char) ('a' + rnd.nextInt(26));
                                    pw.print(randomChar);
                                } else {
                                    char randomChar = (char) ('0' + rnd.nextInt(10));
                                    pw.print(randomChar);
                                }

                            }

                            break;
                    }
                    pw.println();
                    break;
                }

            }

        }

        System.out.println();
        System.out.println("Thank you for using the Password Generator.");
        System.out.println("Here are your generated Passwords: ");
        System.out.println();
        pw.close();
        File fileName = new File("Passwords.txt");
        Scanner inFile = new Scanner(fileName);
        while (inFile.hasNext()) {
            System.out.println(inFile.nextLine());
        }

        System.out.println();
        System.out.println("Your password(s) can also be found in the ");
        System.out.println("text file at the root of this program named Passwords.txt ");
        System.out.println("Have a great day!");
        inFile.close();
        in.close();

        return;

    }
}
