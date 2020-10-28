import java.util.Scanner;
public class acceptInput {
	
    public static void main (String[ ] args) {

          Scanner scan = new Scanner (System.in);
          System.out.println("Enter the name of your favorite book: ");
          String title = scan.nextLine();
          System.out.println(title);
          
          }
}