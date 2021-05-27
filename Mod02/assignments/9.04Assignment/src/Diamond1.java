/**
 * This class defines a Diamond object by extending Cube. The toString method
 * has been added.
 *
 * @author  Cole Woodyard
 * 
 * @version 5/13/2021
 */
public class Diamond1 extends Cube4 {
    // instance variables

    // Constructor for objects of class Box
    public Diamond1(int l, int w, int h) {
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
        return "Diamond";
    }

    // String to display when object is printed.
    @Override
    public String toString() {
        return getName() + " - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }

}
