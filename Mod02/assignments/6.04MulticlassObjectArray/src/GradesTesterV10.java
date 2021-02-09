import java.util.Scanner;

/*  Author: Cole Woodyard
 *  Desc: Main code. Client side
 *  Version: 2/01/2021
 */
public class GradesTesterV10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String student1 = "August";
        String student2 = "Jack";
        String student3 = "Summer";

        System.out.println("Please enter the 2 grades for August, seperated by a space: ");
        double gradeA1 = scan.nextDouble();
        double gradeB1 = scan.nextDouble();
        System.out.println("Please enter the 2 grades for Jack, seperated by a space: ");
        double gradeA2 = scan.nextDouble();
        double gradeB2 = scan.nextDouble();
        System.out.println("Please enter the 2 grades for Summer, seperated by a space: ");
        double gradeA3 = scan.nextDouble();
        double gradeB3 = scan.nextDouble();

        double av = 0.0;
        double dif = 0.0;
        GradesV10[] students = {
                new GradesV10(student1, gradeA1, gradeB1),
                new GradesV10(student2, gradeA2, gradeB2),
                new GradesV10(student3, gradeA3, gradeB3)
        };

        System.out.println("\t\tGrades:");
        System.out.printf("%-9s%-10s%-10s%-9s%-9s", "Student", "Grade 1", "Grade 2", "Average", "Difference");
        System.out.println();
        System.out.println("=================================================");
        for (GradesV10 st : students) {
            av = st.calcAv();
            dif = st.calcDif();
            System.out.printf("%-1s%-9.1f%-9.1f", st + "", av, dif);
            System.out.println();
        }

        scan.close();
    }
}
