
/*
 * @purpose Main tester for the Circle's classes
 * 
 * @author Cole Woodyard
 * 
 * @version 05/11/2021
 */
import java.util.ArrayList;

public class ClientTester {

    public String out;

    public ClientTester(String output) {
        out = output;
    }

    public static void showCenter(Circle2 c) {
        switch (c.getName()) {
            case ("Circle"):
                System.out.println("For this Circle2 the " + c.getCenter());
                break;
            case ("Cylinder"):
                System.out.println("For this Cylinder2 the " + c.getCenter());
                break;
            case ("Oval"):
                System.out.println("For this Oval2 the " + c.getCenter());
                break;
            case ("OvalCylinder"):
                System.out.println("For this OvalCylinder2 the " + c.getCenter());
                break;
        }
    }

    public static void main(String[] args) {
        ArrayList<Circle2> client = new ArrayList<Circle2>();
        client.add(new Circle2(22, 32, 55));
        client.add(new Cylinder2(22, 33, 56, 2));
        client.add(new Oval2(310, 351, 63, 55));
        client.add(new OvalCylinder2(303, 312, 63, 55, 22));
        for (int i = 0; i < client.size(); i++) {
            showCenter(client.get(i));
        }
    }
}
