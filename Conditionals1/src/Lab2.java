
/**
 * Objective: practice arithmetic operations, If statements, nested If statements 
 * @author May Haidar
 *
 */
public class Lab2 {
	
	/**
	 * Takes an integer and calculates the next integer in the Collatz mathematica
	 * sequence
	 */
	public static int collatz(int n) {
		int result = 0;
		
		if(n < 0) {
			result = -1;
		}
		else {
			if(n % 2 == 0) {
				result = n / 2;
			}
			else if(n % 2 == 1) {
				result = 3 * n + 1;
			}
		}
		
		return result;
	}
	
	/**
	 * Takes an GPA and SAT score of a student and returns a string if "Accepted", "Rejected",
	 * or "ScoresTooLow"
	 */
	public static String yorkAdmit (double gpa, int sat) {
		String result = "";
		
		if(gpa < 1.8 && sat < 900) {
			result = "ScoresTooLow";
		}
		else if(gpa < 1.8 || sat < 900) {
			result = "Reject";
		}
		else {
			result = "Accept";
		}
		
		return result;
	}
	
	/**
	 * Takes coordinates of a points as double (x,y) and determines to which quadrant it belongs
	 */
	public static int quadrant (double x, double y) {
		int result = 0;
		
		if(x == 0.0 || y == 0.0) {
			result = 0;
		}
		else {
			if(x > 0.0 && y > 0.0) {
				result = 1;
			}
			else if(x < 0.0 && y > 0.0) {
				result = 2;
			}
			else if(x < 0.0 && y < 0.0) {
				result = 3;
			}
			else {
				result = 4;
			}
		}
		
		return result;
	}


	/**
	 * Takes inputs of two clock times in hours and minutes and determines if there is enough
	 * time between them for lunch. This time has to be at least 45 minutes.
	 */
	public static boolean enoughLunchTime (int hour1, int min1, int hour2, int min2) {
		boolean result = true;
		
		if((hour1 < 1 || hour2 < 1) || (min1 < 0 || min2 < 0) || (hour1 > 24 || hour2 > 24) || (min1 > 59 || min2 > 59)) {
			result = false;
		}
		else {
			if(hour1 == hour2) {
				if(min2 - min1 >= 45) {
					result = true;
				}
				else {
					result = false;
				}
			}
			else if(hour1 < hour2) {
				if(hour2 - hour1 == 1) {
					if(min1 + min2 >= 45) {
						result = true;
					}
					else {
						result = false;
					}
				}
					
			}
			else {
				result = false;
			}
		}
		
		return result;
		
	}		
	/**
	 * Takes inputs as a credit card old balance and current month additional charges and 
	 * calculates the minimum payment owed 
	 */
	public static double computePayment (double oldBalance, double charges) {
		double result = 0.0;
		double interest = 0.0;
		
		if(oldBalance == 0.0) {
			result = oldBalance + charges + interest;
			if(result < 50) {
				return result;
			}
			else if(result >= 50 && result <= 300) {
				result = 50;
			}
			else {
				result = result * 20 / 100;
			}
		}
		else if(oldBalance > 0) {
			interest = (oldBalance + charges) * 2 / 100;
			result = oldBalance + charges + interest;
			if(result < 50) {
				return result;
			}
			else if(result >= 50 && result <= 300) {
				result = 50;
			}
			else {
				result = result * 20 / 100;
			}
			
		}
			
		return result;
		
	}
}
