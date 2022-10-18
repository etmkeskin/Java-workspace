
/**
 * Objective: practice input/output, Strings, expressions, variables cs. constants 
 * @author May Haidar
 *
 */
public class Lab1 {
	/**
	 * @return returns the quotation in the lab document as a string including
	 * all the escape characters
	 */
	public static String printQuotation(){
		String quote = "";
		quote = "\tI am printing this text to show that i can use escape" + "\nsequences in a professional manner." +
		"\n\t  Even though things got complicated, you know...\"Complicated\".my" + "\n\t  computer can also print quotations by escaping." + 
				"\n\\is a new character, but things got more tangled\\\\\\" + 
		"\n/the \'trick\' was neat and simple, and I got it if I got here!" + 
				"\n\t\t I will pass this lab as" + 
		"\n\t\t\t OnE oF tHe GrEaTeSt\n\t\t\t :)";
	
		return quote;

	}
	/**
	 * Takes an integer as input and calculates the inverse of its square (x^-2)
	 * and returns the result as a double
	 */
	public static double inverseSquare(int x){
		double invSq = 0.0;
		invSq = 1.0 / (x * x);
		
		return invSq;

	}	
	/**
	 * Takes the time in hours, minutes, and seconds and convert it all to seocnds
	 * and returns the result as an integer
	 */
	public static int timeToHawaii(int hours, int mins, int secs){
		int totalSeconds = 0;
		hours *= 3600;
		mins *= 60;
		totalSeconds = hours + mins + secs;
		
		return totalSeconds;

	}
	/**
	 * Takes the dimensions of a room as parameters: length, width, and height as integers
	 * and compute the amount of paint needed in gallons
	 * @return returns the number of gallons of paint as integer
	 */
	public static double paintMyRoom(int length, int width, int height) {
		
		final int COVERAGE = 350; //paint covers 350 sq ft/gal
		
		//declare double totalSqFt;
		double totalSqFt = (height * length * 2) + (height * width * 2);
		//declare double paintNeeded;
		double paintNeeded = totalSqFt / COVERAGE;

		//Compute the total square feet to be painted--think
		//about the dimensions of each wall (of course you don’t paint the floor neither the ceiling)
		//Compute the amount of paint needed

		//return the number of gallons of paint 
		return paintNeeded;

	}
	/**
	 * Converts base 10 numbers to another base
	 * (at most 4 digits in the other base). 
	 * The base 10 number and the base are input.
	 */
	public static String baseConvert(int baseB,int base10Num) {
	
		int place0;	// digit in the 1's (base^0) place 
		int place1;	// digit in the base^1 place
		int place2;	// digit in the base^2 place 
		int place3;	// digit in the base^3 place
	
		String baseBNum = new String (""); // the number in the new base 
		
		// First compute place0 -- the units place. Remember this comes
		// from the first division so it is the remainder when the
		// base 10 number is divided by the base (HINT use %).
		place0 = base10Num % baseB;
		
		// Then compute the quotient (integer division / will do it!) -
		// You can either store the result back in base10Num or declare a
		// new variable for the quotient
		base10Num /= baseB;
	
		// Now compute place1 -- this is the remainder when the quotient
		// from the preceding step is divided by the base.
		// Then compute the new quotient
		place1 = base10Num % baseB;
		base10Num /= baseB;
	
		// Repeat the idea from above to compute place2 and the next quotient
		place2 = base10Num % baseB;
		base10Num /= baseB;
	
		// Repeat again to compute place3
		place3 = base10Num % baseB;
		base10Num /= baseB;
		//concatenate the resulting integers into a single string baseBNum
		baseBNum = String.valueOf(place3) + String.valueOf(place2) + String.valueOf(place1) + String.valueOf(place0);
		//return the string0
		return baseBNum;
	}

}



