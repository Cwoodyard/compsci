
/**
 * Write a description of class testCode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testCode
{
    public static void main(String[] args){
        Product p1 = new Product("341-1101", 129.99);
        Product p2 = new Widget("82794-mach10q", "12/7", 89.99);
        Widget w1 = new Widget("123-AB307", "12.7", 109.95);
        p1.canReplace(p2);
    }
}
class Product {
    private String productID;
    private double price;

    public Product(String productID, double price) {
        // implementation not shown
    }

    public boolean canReplace(Product p) {
        // implementation not shown
        System.out.println(p.productID.compareTo(productID));
        return true;

    }

    public boolean canReplace(Product p, double price) {
        return false;
    }

    // other instance variables, constructors and methods are not shown
}
class Widget extends Product {
    private String productionDate;

    public Widget(String id, String pd, double price) {
        super(id.concat("_" + pd), price);
        productionDate = pd;
    }

}

