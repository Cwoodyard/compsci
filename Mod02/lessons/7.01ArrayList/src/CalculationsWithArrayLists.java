
/**
 * This class adds randomly selected integers to two ArrayLists
 * then calculates the sum of the values in the first and second
 * ArrayList and adds the value to the third ArrayList.  Last, the
 * third ArrayList is printed out showing how each successive sum
 * is added to the answers ArrayList.
 *
 * @author Alan Kay
 * @version 06/08/17
 */
import java.util.ArrayList;                                         //import the ArrayList class
public class CalculationsWithArrayLists
{
    public static void main(String[] args)                          //header for the main method
    {
        ArrayList<Integer> numList1 = new ArrayList<Integer>();     //declares an ArrayList of Integers
        ArrayList<Integer> numList2 = new ArrayList<Integer>();     //declares an ArrayList of Integers
        ArrayList<Integer> answers = new ArrayList<Integer>();      //declares an ArrayList of Integers

        int rndNumber;                                              //declares a random number

        for(int i = 0; i < 10; i ++)                                //initializes, tests, and increments the loop index variable
        {
            rndNumber = (int)(Math.random() * 100);                 //generate a random number from 0 - 99
            numList1.add(rndNumber);                                //adds the random number to the end of the first ArrayList
            rndNumber = (int)(Math.random() * 100);                 //generate a random number from 0 - 99
            numList2.add(rndNumber);                                //ands the random number to the end of the second ArrayList
        }
        System.out.println();

        System.out.print("List 1: ");
        System.out.println(numList1);                               //prints the first ArrayList
        System.out.print("List 2: ");
        System.out.println(numList2);                               //prints the second ArrayList

        System.out.println("\nThe sum of the lists:");
        for(int i = 0; i < numList1.size(); i++)                    //initializes, tests, and increments the loop index variable
        {
            answers.add(numList1.get(i) + numList2.get(i));         //gets the value from index position i in the first and second ArrayLists,
                                                                    //calculates the sum, and assigns the value to index position i in the answers ArrayList.
            System.out.println(answers);                            //prints the values one at a time as they are inserted into the third ArrayList
            System.out.println();
        }
    }
}