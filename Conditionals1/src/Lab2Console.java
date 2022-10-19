import java.util.Scanner;

public class Lab2Console {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		//test collatz()
		System.out.println("Enter an integer:");
		int n = scan.nextInt();
		int num = Lab2.collatz(n);
		System.out.println(num);

		//test yorkAdmit()
		System.out.println("\nEnter GPA:");
		double gpa = scan.nextDouble();
		System.out.println("\nEnter SAT score");
		int sat = scan.nextInt();
		String decision = Lab2.yorkAdmit(gpa,sat);
		System.out.println(decision);
		
		//test quadrant()
		System.out.println("\nEnter a point coordinates(x):");
		double x = scan.nextDouble();
		System.out.println("\nEnter a point coordinates(y):");
		double y = scan.nextDouble();
		int qdrt = Lab2.quadrant(x, y);
		System.out.println(qdrt);
		
		//test enoughLunchTime()
		//write code similar to the previous methods testing code to test this method
		System.out.println("Enter the starting time(as 24-hour clock): ");
		int hour1 = scan.nextInt();
		int minute1 = scan.nextInt();
		System.out.println("Enter the endind time (as 24-hour clock): ");
		int hour2 = scan.nextInt();
		int minute2 =scan.nextInt();
		boolean lunchTime = Lab2.enoughLunchTime(hour1, minute1, hour2, minute2);
		System.out.println(lunchTime);
		
		
		//test computePayment()
		//write code similar to the previous methods testing code to test this method
		System.out.println("\nEnter the previous balance on the credit card account: ");
		double prevBalance = scan.nextDouble();
		System.out.println("\nEnter the amount of additional charges during the month: ");
		double addCharges = scan.nextDouble();
		double minPaymentDue = Lab2.computePayment(prevBalance, addCharges);
		System.out.println(minPaymentDue);
		
		
		scan.close();
	
	}
}
