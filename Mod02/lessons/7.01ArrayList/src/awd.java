import java.util.ArrayList;

public class awd {
    public static void main(String[] args) {

        ArrayList<String> aList = new ArrayList<String>();
        aList.add("apple");
        aList.add("orange");
        aList.add("grape");
        aList.add("kiwi");
        aList.add("watermelon");
        aList.add("peach");
        aList.add("banana");
        aList.set(2, "pear");

        System.out.println(aList);

    }
}
