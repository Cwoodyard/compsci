/**
 * This class defines a Rectangle object using length and width. The toString
 * method has been added.
 *
 *
 * @author  Poly Morphism edited by Cole Woodyard
 * 
 * @version 06/13/17 edited 5/13/2021
 */
public class Rectangle4 {
    // instance variables
    private int length;
    private int width;
    private int height;

    // Constructor for objects of class Rectangle
    public Rectangle4(int l, int w) {
        // initialize instance variables
        length = l;
        width = w;
    }

    public Rectangle4(int l, int w, int h) {
        // initialize instance variables
        length = l;
        width = w;
        height = h;
    }

    // return the height
    public int getLength() {
        return length;
    }

    // return the width
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // return the name
    public String getName() {
        return "Rectangle";
    }
    // String to display when object is printed.

    @Override
    public String toString() {
        return getName() + " - " + length + " X " + width;
    }

}
