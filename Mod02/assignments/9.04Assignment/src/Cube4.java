/**
 * This class defines a Cube object by extending Box. The toString method has
 * been added.
 *
 * @author  Cole Woodyard
 * 
 * @version 5/13/2021
 */
public class Cube4 extends Box4 {
    // instance variables

    // Constructor for objects of class Box
    public Cube4(int l, int w, int h) {
        // call superclass
        super(l, w, h);

        // initialize instance variables
    }

    // return the height
    @Override
    public int getHeight() {
        return super.getHeight();
    }

    // return the name
    @Override
    public String getName() {
        return "Cube";
    }

    // String to display when object is printed.

    @Override
    public String toString() {
        return getName() + " - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }

}
