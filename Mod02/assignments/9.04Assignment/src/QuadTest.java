
/**
 * Main Class that interacts with the other subclasses
 *
 * @author  Cole Woodyard 
 * 
 * @version 5/13/2021
 */
import java.util.ArrayList;

public class QuadTest {
    static ArrayList<Rectangle4> quads = new ArrayList<Rectangle4>();

    public static String showEffectBoth(int opt1, int opt2) {
        // Creating int values to measure
        int opt1Size;
        int opt2Size;

        // Setting Values to measure
        opt1Size = quads.get(opt1).getLength() * quads.get(opt1).getWidth() * quads.get(opt1).getHeight();
        opt2Size = quads.get(opt2).getLength() * quads.get(opt2).getWidth() * quads.get(opt2).getHeight();

        if (opt1Size == 0) {
            opt1Size = quads.get(opt1).getLength() * quads.get(opt1).getWidth();
        }
        if (opt2Size == 0) {
            opt2Size = quads.get(opt2).getLength() * quads.get(opt2).getWidth();
        }

        // Return area
        if (opt1Size == opt2Size) {
            return quads.get(opt1).toString() + " IS the same size as " + quads.get(opt2).toString();
        } else {
            return quads.get(opt1).toString() + " IS NOT the same size as " + quads.get(opt2).toString();
        }

    }

    public static void main(String[] args) {
        // Array will call the Class name with size parameters
        quads.add(new Rectangle4(6, 4));
        quads.add(new Box4(4, 4, 4));
        quads.add(new Box4(4, 1, 12));
        quads.add(new Cube4(4, 4, 4));
        quads.add(new Quadrilateral1(4, 6, 13));
        quads.add(new Diamond1(6, 3, 9));

        // List the Shapes and sizes
        System.out.println("Current Shapes: ");
        System.out.println();
        for (int i = 0; i < quads.size(); i++) {
            System.out.println(quads.get(i).toString());
        }
        System.out.println();

        // Loop will call showEffectBoth with 2 of the items in the array
        for (int i = 0; i < quads.size(); i++) {
            for (int f = i + 1; f < quads.size(); f++) {
                System.out.println(showEffectBoth(i, f));
            }
            System.out.println();
        }

        // Debug
//        System.out.println(showEffectBoth(0, 2));
//        System.out.println(quads.get(3).toString());
    }
}
