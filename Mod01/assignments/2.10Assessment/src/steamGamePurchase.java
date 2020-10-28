/**
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;
public class steamGamePurchase {
	public static String date;
	public static String firstName;
	public static String lastInit;
	public static String gameName;
	public static double fiQuantity;
	public static double fiPrice;
	public static String cardNum;
	public static Scanner scan = new Scanner (System.in);
	
	public static void getName() {
        System.out.println("Please enter your First and Last name (first last): ");
        String fName = scan.next();
//        System.out.println(fName);
        String lName = scan.nextLine();
//        System.out.println(lName);
        System.out.print("\n");
        firstName = fName;
        lastInit = lName.substring(0,2) + ".";
	}
	public static void getDate() {
        System.out.print("Please enters today's date (mm/dd/yyyy): ");
        String dateF = scan.nextLine();
        date = dateF;
//        System.out.println(date);
	}
	public static void games() {
        System.out.print("What game would you like to buy? : ");
        String game = scan.nextLine();
        gameName = game;
//        System.out.println(game);
	
        System.out.print("How many copies of this game would you like? : ");
        String quantity = scan.nextLine();
        double fQuantity;
        fQuantity = Integer.parseInt(quantity);
        fiQuantity = fQuantity;
//        System.out.println(fQuantity);

        System.out.print("How much does the game cost? : ");
        String price = scan.nextLine();
        double fPrice;
        fPrice = Integer.parseInt(price);
        fiPrice = fPrice;
//        System.out.println(fPrice);   
        
	}
	public static void card() {
		System.out.println("Please type in your Credit/Debit Card number (####-####-####): ");
		String card = scan.next();
		cardNum = card.substring(10,14);
		System.out.println("Please type in your Credit/Debit Card pin (#####): ");
		String pin = scan.nextLine();
	}
	
	public static void main(String[] args) {

		System.out.println("Welcome to the VGclub");
		getName();
		getDate();
		games();
		card();
		
		System.out.println("===============================================");
		System.out.println("Receipt: \n");
		System.out.println(date);
		System.out.println("Order: ovgc2001");
		System.out.println();
		System.out.println("Purchaser: " + firstName + lastInit);
		System.out.println("Card: ####-####-" + cardNum);
		System.out.println("Game: " + gameName);
		System.out.println("Number of copies: " + (int)fiQuantity);
		System.out.println("Price per game: $" + fiPrice + "\n");
		System.out.println("$" + (fiQuantity * fiPrice) + " has been charged to your card.");
		System.out.println("      ##          ##");
		System.out.println("        ##      ##  ");
		System.out.println("      ##############");
		System.out.println("    ####  ######  ####");  
		System.out.println("  ######################");
		System.out.println("  ##  ##############  ##");
		System.out.println("  ##  ##          ##  ##");
		System.out.println("        ####  ####");
		System.out.println("\n Have a great day! :)");
        
	}
}