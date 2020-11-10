
public class notes {
	public static void main(String[] args) {
//		String phoneNum1 = "1234567890";
//		String areaCode1 = phoneNum1.substring(3, 6);
//		System.out.println(areaCode1);
		int lotNumLength = 3;
		String phoneNum1 = "407-555-2207";
		String phoneNum2 = "407-555-2207";
		int digit = (int) (Math.random()*50) + 1;
			for(int n = 1; n <= lotNumLength; n++) {
				System.out.println(n);
			};
			if(phoneNum1.compareTo(phoneNum2) == 0) { //phoneNum1 and phoneNum2 are equal 
				System.out.println("works");
			};	
	}
	
}
