
public class Notes {
	public static void main(String[] args) {
		System.out.println("1.11 Notes");
		System.out.println("Java provides three conversion techniques to avoid syntax errors in mixed data type arithmetic expressions.");
		System.out.println("Assignment Conversion occurs when a value with less precision is assigned to a variable with greater precision. For example: ");
		double x = 100;
		System.out.println("Double x = " + x);
		System.out.println("");
		System.out.println("In this case, assigning an integer value to a double variable is a widening conversion that causes 100 to be automatically converted to 100.0.");
		System.out.println("However, attempting to assign a double to an int (a narrowing conversion), as in the following example, is not possible.");
		System.out.println("");
		System.out.println("int z = 100.0");
		System.out.println("Error: Type mismatch: cannot convert from double to int");
		System.out.println("");
		System.out.println("The compiler will issue a possible loss of precision error in this situation.");
		System.out.println("");
		System.out.println("Arithmetic Promotion also happens automatically in an expression of mixed types. For example: ");
		double z = 3.14 * 10 * 10; 
		System.out.println("double z = " + z);
		System.out.println("");
		System.out.println("The 10s in this expression are ints, but 3.14 is a double. In order to calculate the answer, a widening conversion occurs, automatically promoting the 10s to doubles.");
		System.out.println("The data type of the result of the expression is a double. After this statement is executed, x contains a value of 314.0, a decimal number.");
		System.out.println("");
		System.out.println("Casting allows promotion and demotion of types, but it must be done explicitly. For example: ");
		int y = (int)3.14 * 10 * 10; 
		System.out.println("int y = " + y);
		System.out.println("");
		System.out.println("Placing the int type in parentheses in front of 3.14 (a double) causes the compiler to treat 3.14 as if it were just 3 (an int).");
		System.out.println("This cast is a narrowing conversion, so after this statement is executed, x contains a value of 300, an integer.");
		System.out.println("It is important to note, however, that casting does not actually change the number 3.14 in any way; it simply causes the program to treat the value as if it were actually a 3 for the purposes of this calculation only. ");
		System.out.println("Generally, there is no problem with a widening conversion (e.g., an int to a double), but narrowing conversions (e.g. a double to an int) cause a loss of information and should be avoided unless it is intentionally done.");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("-----------------------------End-----------------------------");
		
	}
}
