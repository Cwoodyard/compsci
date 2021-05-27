/**
 * This class defines a Box object by extending Rectangle and includes height.
 * The toString method has been added.
 *
 * @author  Poly Morphism edited by Cole Woodyard
 * 
 * @version 06/13/17 edited 5/13/2021
 */
public class Box4 extends Rectangle4 {
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int l, int w, int h) {
        // call superclass
        super(l, w, 0);

        // initialize instance variables
        height = h;
    }

    // return the height
    @Override
    public int getHeight() {
        return height;
    }

    // return the name
    @Override
    public String getName() {
        return "Box";
    }

    // String to display when object is printed.

    @Override
    public String toString() {
        return getName() + " - " + getLength() + " X " + getWidth() + " X " + height;
    }

}
