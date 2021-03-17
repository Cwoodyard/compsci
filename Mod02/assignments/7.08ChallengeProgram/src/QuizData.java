/**
 * @purpose A class made to define the Quiz Data object
 *
 * @author  Cole Woodyard
 * 
 * @version 3/2/2021
 */
public class QuizData {

    // instance variables

    private int grade1;
    private int grade2;
    private int grade3;
    private int grade4;
    private int grade5;
    private String name;

    public QuizData(String name, int grade1, int grade2, int grade3, int grade4, int grade5) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
        this.grade5 = grade5;
    }

    public void setQuizScore(int quizNum, int quizGrade) {
        switch (quizNum) {
            case (1):
                grade1 = quizGrade;
                break;
            case (2):
                grade2 = quizGrade;
                break;
            case (3):
                grade3 = quizGrade;
                break;
            case (4):
                grade4 = quizGrade;
                break;
            case (5):
                grade5 = quizGrade;
                break;
        }
    }

    public int getQuizScore(int quizNum) {
        switch (quizNum) {
            case (1):
                return grade1;
            case (2):
                return grade2;
            case (3):
                return grade3;
            case (4):
                return grade4;
            case (5):
                return grade5;
            default:
                return 0;
        }
    }

    public void setName(String studentName) {
        name = studentName;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-10d %-10d %-10d %-10d %-10d", getName(), getQuizScore(1), getQuizScore(2), getQuizScore(3), getQuizScore(4), getQuizScore(5));
    }

}
