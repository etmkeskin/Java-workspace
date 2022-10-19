import java.util.Scanner;

public class Lab3Console {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		//test getCalories()
//		System.out.println("Enter your gender (1 for male and 2 for female): ");
//		int gender = scan.nextInt();
//		System.out.println("Enter your age: ");
//		int age = scan.nextInt();
//		System.out.println("Enter your weight in kg: ");
//		double weight = scan.nextDouble();
//		System.out.println("Enter yout height in cm: ");
//		double height = scan.nextDouble();
//		System.out.println("Are you and athlete(true/false)?: ");
//		boolean isAthlete = scan.nextBoolean();
//		double totalCalories = Lab3.getCalories(gender, age, weight, height, isAthlete);
//		System.out.println(totalCalories);
		
		//test computeTax()
//		System.out.println("Enter your salary to compute income tax: ");
//		double salary = scan.nextDouble();
//		double incomeTax = Lab3.computeTax(salary);
//		System.out.println(incomeTax);
		
		//test validDate()
		System.out.println("Enter the day: ");
		int day = scan.nextInt();
		System.out.println("Enter the month: ");
		int month = scan.nextInt();
		System.out.println("Enter the year: ");
		int year = scan.nextInt();
		boolean isValidDate = Lab3.validDate(day, month, year);
		System.out.println(isValidDate);
		
		
		
		
		scan.close();
	
	}	
}
