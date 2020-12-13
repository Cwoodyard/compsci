import java.util.Scanner;

/* Plan: Build an array based on grade entries.
 * - Will add a Grade column per rule added 
 * - Have grades in an array?
 *      - Have user enter grades with a space 
 *      - Have each array value be its own column
 *      - Have a final 2 columns be the average and difference
 *      - Make it so the user has to enter 2 or more grades.
 * 
 */
public class GradesV3 {
    public GradesV3() {

    }

    public static void gradeCollection() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grades in number form and enter more than 1 grade: ");
        String grades = scan.nextLine();
        System.out.println(grades);
        int gradeInt = Integer.parseInt(grades);

    }

    public static void main(String[] args) {
        gradeCollection();
    }
}
