/**
 * 
 *
 *     Description: Triangle Sides and their Hypotenuse
 *
 * @author Cole Woodyard
 * @version 09/20/2020
 */
public class PyTheorem {
	public static void main(String[] args){
		
		System.out.println("");
		for(int i = 1; i < 3; i++) {
			double sideA = (int)(Math.random() * 18) + 5;
			double sideB = (int)(Math.random() * 18) + 5;
			double sideC = 0.0;
			double sideC2 = 0.0;
			sideC += (Math.pow(sideA, 2)) + (Math.pow(sideB, 2));
//			System.out.println("DEBUG");
//			System.out.println( (Math.pow(sideA, 2)));
//			System.out.println( (Math.pow(sideB, 2)));
//			System.out.println("DEBUG END");
			sideC2 += Math.sqrt(sideC);
			System.out.println("Triangle: " + i + " | " + "Side A: " + sideA + " | " + "Side B: " + sideB + " | " + "Hypotenuse: " + sideC2);
			//System.out.print(sideB);
			//System.out.print("Hypotenuse: " + sideC2);
		}
	}
}
