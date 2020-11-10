
/**
 * This program models flipping an unbiased coin and counting the
 * number of times red or blue occurs.
 *
 * @author Charles Babbage 
 * @version 06/05/17
 */
public class HeadsorTailsV1
{
	public static void main(String[] args)
	{
	    // Declare and initialize variables
	    int red = 0;
	    int blue = 0;
	    int grabcount = 0;
	    int totalGrabbed = 10;
	    double randNum = 0.0;

	    // Input number of tokens grabbed
	    
	    while(grabcount < totalGrabbed)
	    {
	    	//Random value between 0.0 (inclusive) and 1.0 (exclusive)
	        randNum = Math.random();
	        System.out.print(grabcount + "\t" + randNum);

	        if(randNum < 0.2)
	        {
	            red++;
	            System.out.println("\t red");
	        }
	        else
	        {
	            blue++;
	            System.out.println("\t blue");
	        }
	        grabcount++;

	    }

	    //Output number of red and number of blue
	    System.out.println();
	    System.out.println("Number of red = " + red);
	    System.out.println("Number of blue = " + blue);
	}
}
