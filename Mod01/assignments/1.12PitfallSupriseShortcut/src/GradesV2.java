/**
 * Assignment for going over 1.12
 * Grade calculator
 * 
 * @author Cole Woodyard
 * @version 09/17/2020
 */
public class GradesV2 {
	public static void main(String[] args) {
		//local variables
		int numTests = 0;      //counts number of tests
		int testGrade = 0;     //individual test grade
		int totalPoints = 0;   //total points for all tests
		double average = 0.0;  //average grade
		
		//Title
		System.out.println( "Grades" );
		
		//Test1
		testGrade = 95;
		numTests++;
		totalPoints += (int)testGrade;
		
		average = (double)totalPoints / numTests;
		System.out.println( "# of Tests: " + numTests + " | " + "Final total: " + totalPoints + " | " + "Final Grade: " + average );

		//Test2
		testGrade = 73;
		numTests++;
		totalPoints += (int)testGrade;
		
		average = (double)totalPoints / numTests;
		System.out.println( "# of Tests: " + numTests + " | " + "Final total: " + totalPoints + " | " + "Final Grade: " + average );

		//Test3
		testGrade = 91;
		numTests++;
		totalPoints += (int)testGrade;
		
		average = (double)totalPoints / numTests;
		System.out.println( "# of Tests: " + numTests + " | " + "Final total: " + totalPoints + " | " + "Final Grade: " + average );

		//Test4
		testGrade = 82;
		numTests++;
		totalPoints += (int)testGrade;
		average = (double)totalPoints / numTests;
		System.out.println( "# of Tests: " + numTests + " | " + "Final total: " + totalPoints + " | " + "Final Grade: " + average );
		
		//Test5 - added
		testGrade = 98;
		numTests++;
		totalPoints += (int)testGrade;
		
		average = (double)totalPoints / numTests;
		System.out.println( "# of Tests: " + numTests + " | " + "Final total: " + totalPoints + " | " + "Final Grade: " + average );

		//Test6 - added
		testGrade = 63;
		numTests++;
		totalPoints += (int)testGrade;
		
		average = (double)totalPoints / numTests;
		System.out.println( "# of Tests: " + numTests + " | " + "Final total: " + totalPoints + " | " + "Final Grade: " + average );

		//Test7 - added
		testGrade = 79;
		numTests++;
		totalPoints += (int)testGrade;
		
		average = (double)totalPoints / numTests;
		System.out.println( "# of Tests: " + numTests + " | " + "Final total: " + totalPoints + " | " + "Final Grade: " + average );

		//Test8 - added
		testGrade = 88;
		numTests++;
		totalPoints += (int)testGrade;
		
		average = (double)totalPoints / numTests;
		System.out.println( "# of Tests: " + numTests + " | " + "Final total: " + totalPoints + " | " + "Final Grade: " + average );

		//Test9 - added
		testGrade = 69;
		numTests++;
		totalPoints += (int)testGrade;

		//final total
		average = (double)totalPoints / numTests;
		System.out.println( "# of Tests: " + numTests + " | " + "Final total: " + totalPoints + " | " + "Final Grade: " + average );
		System.out.println("------------------------END------------------------");
	}
}
