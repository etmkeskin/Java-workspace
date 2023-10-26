import java.util.Scanner;

public class RecursionExamples {
	
	
	public static boolean isPol(String input){
		if(input.length() == 0 || input.length() == 1){
			return true;
	    }
		if(input.charAt(0) == input.charAt(input.length() - 1)){
			return isPol(input.substring(1, input.length() - 1));
	    }
		
		return false;
   
	}
	
	public static String findBinary(int decimal, String result) {
		
		if(decimal == 0) {
			return result;
		}
		
		result = decimal % 2 + result;
		return findBinary(decimal / 2, result);
		
	}
	
	public static int recursiveSum(int num) {
		
		if(num <= 0) {
			return num;
		}
		
		return num + recursiveSum(num - 1);
	
	}
	
	public static long fib(long n) {
		if((n == 0) || (n == 1)) {
			return n;
		}
		else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static int multiplyEvens(int n){
		if (n <= 0) {
	        return 1; // Base case: the product of 0 even numbers is 1
	    }

	    int evenNumber = 2 * n;
	    
	    // Multiply the current even number by the product of the previous even numbers (n - 1)
	    return evenNumber * multiplyEvens(n - 1);
	}
	
	public static void move(int top, char from, char middle, char to) {
		if(top == 1) {
			System.out.println("Disk 1 from " + from + " to " + to);
		}
		else {
			move(top - 1, from, to, middle);
			System.out.println("Disk " + top + " from " + from + " to " + to);
			move(top - 1, middle, from, to);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("-----Palindrome-----");
//		System.out.println("\nEnter a string: ");
//	    String input = scan.nextLine();   
//	    System.out.println(isPol(input));
//	    
//	    System.out.println("\n-----Find Binary-----");
//	    System.out.println(findBinary(233, ""));
//	    
//	    System.out.println("\n-----Recursive Sum-----");
//	    System.out.println(recursiveSum(5));
//	    
//	    System.out.println("\n-----Fibonacci-----");
//	    System.out.println(fib(3));
	    
//	    System.out.println("\n-----Multiply Evens-----");
//	    System.out.println(multiplyEvens(3));
		
	    System.out.println("\n-----Tower Of Hanoi-----");		
		move(3, 'A', 'B', 'C');
	    
	    
	    scan.close();
	}

}
