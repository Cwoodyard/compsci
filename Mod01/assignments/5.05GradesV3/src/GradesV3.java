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

    public double calcAv(double x, double y) {

        double calcAvF = 0;
        if (y > x) {
            calcAvF = (y + x) / 2;
        } else {
            calcAvF = (x + y) / 2;
        }

        return calcAvF;
    }

    public double calcDif(double x, double y) {

        double calcDifF = 0;
        if (y > x) {
            calcDifF = y - x;
        } else {
            calcDifF = x - y;
        }
        return calcDifF;
    }

    public static void main(String[] args) {
        GradesV3 grades = new GradesV3();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 number grades by separating them with a space: ");
        double grade1 = scan.nextDouble();
        double grade2 = scan.nextDouble();
        double gradesAv = Math.round(grades.calcAv(grade1, grade2) * 100);
        double gradesD = Math.round(grades.calcDif(grade1, grade2) * 100);
        System.out.println("\t\tGrades:");
        System.out.println("Grade 1\tGrade 2\tAverage\tDifference");
        System.out.println("===================================");
        System.out.println(grade1 + " \t" + grade2 + " \t" + gradesAv / 100 + " \t" + gradesD / 100);

    }
}
