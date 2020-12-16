import java.util.Scanner;

/* Author: Cole Woodyard
 * Version: 12/15/2020
 * Desc: Input to GradesV8 and print final output
 * 
 * Plan: sent s1g1 data to GradeV8 to get individual and class average 
 * 
 * Little easter egg in here if you can find it
 * 
 * 
 */
public class GradesTesterV8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Get grades for August
        String teacher = "Mr. Browne's class";
        String student1 = "August";

        System.out.println("Welcome Mr. Browne!");
        System.out.println("Enter August's 1st grade: ");
        double s1g1 = in.nextDouble();
        System.out.println("Enter August's 2nd grade: ");
        double s1g2 = in.nextDouble();
        // Get grades for Jack
        String student2 = "Jack";
        System.out.println("Enter Jack's 1st grade: ");
        double s2g1 = in.nextDouble();
        System.out.println("Enter Jack's 2nd grade: ");
        double s2g2 = in.nextDouble();
        // Get grades for Summer
        String student3 = "Summer";
        System.out.println("Enter Summer's 1st grade: ");
        double s3g1 = in.nextDouble();
        System.out.println("Enter Summer's 2nd grade: ");
        double s3g2 = in.nextDouble();
        // object implementation for student grades
        GradesV8 gradesSt = new GradesV8();
        // calc Student averages
        double s1Avg = Math.round(gradesSt.calcAv(s1g1, s1g2) * 100);
        double s2Avg = Math.round(gradesSt.calcAv(s2g1, s2g2) * 100);
        double s3Avg = Math.round(gradesSt.calcAv(s3g1, s3g2) * 100);
        // object implementation for class avg grade
        GradesV8 gradesC = new GradesV8(teacher);
        // calc class avg
        double cAvg = Math.round(gradesC.calcAv(s1Avg, s2Avg, s3Avg) * 100);
        // print final grades
        System.out.println("\tNorth River Heights Grades:");
        System.out.println("Student\tGrade 1\tGrade 2\tAverage");
        System.out.println("====================================");
        System.out.println(student1 + "\t" + s1g1 + " \t" + s1g2 + " \t" + s1Avg / 100);
        System.out.println(student2 + "\t" + s2g1 + " \t" + s2g2 + " \t" + s2Avg / 100);
        System.out.println(student3 + "\t" + s3g1 + " \t" + s3g2 + " \t" + s3Avg / 100);
        System.out.println(teacher + "\t " + cAvg / 10000);

    }
}
