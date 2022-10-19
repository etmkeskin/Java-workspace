
/**
 * Objective: practice  If statements, nested If statements, Demorgan's Law, Data Comparison 
 * @author May Haidar
 *
 */
public class Lab3 {
	/**
	 * Takes an integer as the gender of a person, integer age, double weigh, 
	 * double height, and a boolean athlete 
	 * and calculates the needed daily calories for that person as a double.
	 */
	//include the code for getCalories()
	public static double getCalories(int gender, int age, double kg, double cm, boolean isAthlete) {
		double result = 0.0;
		
		if((gender == 1 && age > 0) && (kg > 0 && cm > 0)) {
			result = (10 * kg) + (6.25 * cm) - (5 * age) + 5;
			if(isAthlete == true) {
				result += (result * 20 / 100);
			}
		}
		else if((gender == 2 && age > 0) && (kg > 0 && cm > 0)) {
			result = (10 * kg) + (6.25 * cm) - (5 * age) - 161;
			if(isAthlete == true) {
				result += (result * 15 / 100);
			}
		}
		else {
			result = -1.0;
		}
		
		return result;
	}
		
	/**
	 * Takes a salary as a double and calculates the tax owed for this salary
	 * returns a double value. 
	 * if the salary is an invalid amount it returns -1.
	 */
	//include the code for computeTax()
	public static double computeTax(double salary) {
		double tax = 0.0;
		int flatAmount = 0;
		
		if(salary > 0 && salary < 7150) {
			tax = flatAmount + (salary * 10 / 100);
		}
		else if(salary >= 7150 && salary < 29050) {
			flatAmount = 715;
			tax = flatAmount + ((salary - 7150) * 15 / 100); 
		}
		else if(salary >= 29050 && salary < 70350) {
			flatAmount = 4000;
			tax = flatAmount + ((salary - 29050) * 25 / 100);
		}
		else if(salary >= 70350) {
			flatAmount = 14325;
			tax = flatAmount + ((salary- 70350) * 28 / 100);
		}
		else {
			tax = -1.0;
		}
		
		
		
		return tax;
	}
	
	/**
	 * Takes a date as three integers:day, month, and year.
	 * The method returns a true if he date is valid and false otherwise.
	 * The method checks if the month is valid, and the year is after the year 1000.
	 * It checks if the day is valid according to the month. If the month is February, 
	 * it checks if the year is a leap year
	 */
	//include the code for validDate()
	public static boolean validDate(int day, int month, int year) {
		boolean result = true;
		boolean dayValid = (day > 0 && day <= 31);
		boolean monthValid = (month > 0 && month < 12);
		boolean yearValid = year > 1000;
		boolean isLeapYear = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
		
		if(dayValid == true && monthValid == true && yearValid == true) {
			if(isLeapYear == true) {
				if(month == 2) {
					if(day <= 29) {
						return result;
					}
				}
				else if(month == 4 || month ==6 || month == 9 || month == 11) {
					if(day > 30) {
						result = false;
					}
					else {
						return result;
					}
				}
				else {
					return result;
				}
			}
			else {
				if(month == 2) {
					if(day > 28) {
						result = false;
					}
					else {
						return result;
					}
				}
				else if(month == 4 || month ==6 || month == 9 || month == 11) {
					if(day > 30) {
						result = false;
					}
					else {
						return result;
					}
				}
				else {
					return result;
				}
			}
		}
		else {
			result = false;
		}
		
		return result;
	}
		
}