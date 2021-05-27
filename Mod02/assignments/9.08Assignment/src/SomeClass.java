
public class SomeClass {
    public static void main(String[] args) {
        SomeClass someObject1 = new SomeClass("Computer Science");

        SomeClass someObject2 = new SomeClass("Computer Science", "Rocks");

        SomeClass someObject3 = new SomeClass("Computer", "Science", "Rocks");
    }

    public SomeClass(String s1) {
        // Enter what you want to do with the parameters
    }

    public SomeClass(String s1, String s2) {
        // Enter what you want to do with the parameters
    }

    public SomeClass(String s1, String s2, String s3) {
        // Enter what you want to do with the parameters
    }

    public double divideThese(double a, double b) {
        double c;
        c = a / b;

        return c;
    }
}
