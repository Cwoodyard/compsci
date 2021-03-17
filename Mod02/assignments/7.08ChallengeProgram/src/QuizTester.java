import java.util.ArrayList;

/**
 * @purpose A class made to test the Quiz Data object
 *
 * @author  Cole Woodyard
 * 
 * @version 3/2/2021
 */
public class QuizTester {
    // Change name of Student
    public static void studentSwap(ArrayList<QuizData> quizGrades, String oldStudent, String newStudent) {
        for (QuizData students : quizGrades) {
            if (students.getName().equals(oldStudent)) {
                System.out.println(oldStudent + " has been replaced with " + newStudent);
                students.setName(newStudent);
            }
        }
        finalOutput(quizGrades);

    }

    // Finds a Student and changes the Quiz grade with its new Grade
    public static void gradeSwap(ArrayList<QuizData> quizGrades, String name, int quizPos, int newGrade) {
        for (QuizData students : quizGrades) {
            if (students.getName().equals(name)) {
                System.out.println(name + "'s " + quizPos + "'s grade has changed to: " + newGrade);
                students.setQuizScore(quizPos, newGrade);
            }
        }
        finalOutput(quizGrades);
    }

    // Change name and grades of Student
    public static void fullStudentSwap(ArrayList<QuizData> quizGrades, String oldStudent, String newStudent, int newGrade1, int newGrade2, int newGrade3, int newGrade4, int newGrade5) {
        for (QuizData students : quizGrades) {
            if (students.getName().equals(oldStudent)) {
                System.out.println(oldStudent + " has been replaced with " + newStudent + " with a new set of grades.");
                students.setName(newStudent);
                System.out.println(newStudent + " joins class!");
                students.setQuizScore(1, newGrade1);
                students.setQuizScore(2, newGrade2);
                students.setQuizScore(3, newGrade3);
                students.setQuizScore(4, newGrade4);
                students.setQuizScore(5, newGrade5);

            }
        }
        finalOutput(quizGrades);
    }

    // Inserting a new Student before another on the Quiz list
    public static void studentInsertion(ArrayList<QuizData> quizGrades, String oldStudent, String newStudent, int newGrade1, int newGrade2, int newGrade3, int newGrade4, int newGrade5) {
        int pos = 0;
        for (QuizData students : quizGrades) {
            if (students.getName().equals(oldStudent)) {
                break;
            } else {
                pos++;
            }
        }
        System.out.println(oldStudent + " has been replaced with " + newStudent);
        quizGrades.add(pos, new QuizData(newStudent, randomGrade(), randomGrade(), randomGrade(), randomGrade(), randomGrade()));
        System.out.println(newStudent + " joined the class!");
        finalOutput(quizGrades);
    }

    // Finding a Student and removing them from the ArrayList
    public static void studentSearchRemoval(ArrayList<QuizData> quizGrades, String StudentName) {
        int pos = 0;
        for (QuizData students : quizGrades) {
            try {
                if (students.getName().contentEquals(StudentName)) {
                    break;
                } else {
                    pos++;
                }
            } catch (NullPointerException e) {
                pos++;
            }

        }
        quizGrades.remove(pos);
        System.out.println(StudentName + " has left the class!");
        finalOutput(quizGrades);

    }

    // Easy utility to get a random grade on generation
    public static int randomGrade() {
        return (int) (Math.random() * 100);
    }

    // Final output
    public static void finalOutput(ArrayList<QuizData> quizGrades) {

        System.out.println();
        System.out.println("\t\t\t\tQuiz Grades");
        System.out.printf("%-20s %-10s %-10s %-10s %-10s %-10s", "Student", "Quiz 1", "Quiz 2", "Quiz 3", "Quiz 4", "Quiz 5");
        System.out.println();
        System.out.println("=========================================================================");

        for (QuizData students : quizGrades) {
            System.out.println(students);
        }
        System.out.println();

    }

    public static void main(String[] args) {

        ArrayList<QuizData> quizGrades = new ArrayList<QuizData>();

        quizGrades.add(new QuizData("Michal Myres", randomGrade(), randomGrade(), randomGrade(), randomGrade(), randomGrade()));
        quizGrades.add(new QuizData("Jaremy Hendrick", randomGrade(), randomGrade(), randomGrade(), randomGrade(), randomGrade()));
        quizGrades.add(new QuizData("Andrea Michael", randomGrade(), randomGrade(), randomGrade(), randomGrade(), randomGrade()));
        quizGrades.add(new QuizData("Steven Olsen", randomGrade(), randomGrade(), randomGrade(), randomGrade(), randomGrade()));
        quizGrades.add(new QuizData("Jaremy Stokes", randomGrade(), randomGrade(), randomGrade(), randomGrade(), randomGrade()));

        finalOutput(quizGrades);

        gradeSwap(quizGrades, "Jaremy Hendrick", 1, randomGrade());

        studentSwap(quizGrades, "Jaremy Hendrick", "Napoleon Dynamite");

        fullStudentSwap(quizGrades, "Jaremy Hendrick", "Napoleon Dynamite", randomGrade(), randomGrade(), randomGrade(), randomGrade(), randomGrade());

        studentInsertion(quizGrades, "Jaremy Stokes", "Juan John", randomGrade(), randomGrade(), randomGrade(), randomGrade(), randomGrade());

        studentSearchRemoval(quizGrades, "Andrea Michael");

    }
}
