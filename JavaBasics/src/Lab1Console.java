import java.util.ArrayList;
import java.util.Scanner;

public class Lab1Console {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in); 
//		
//		//test printQuotation()
//		String quote = Lab1.printQuotation();
//		System.out.println(quote);
//
//		//test inverseSquare()
//		System.out.println("\nEnter an integer:");
//		int x = scan.nextInt();
//		double inverse = Lab1.inverseSquare(x);
//		System.out.println(x + "^-2 = " + String.format("%.2f", inverse));
//		
//		//test paintMyRoom()
//		//declare integers length, width, and height;
//		int length = 0; int width = 0; int height = 0;
//		//Prompt for and read in the length of the room
//		System.out.print("\nEnter the length of the room: ");
//		length = scan.nextInt();
//		//Prompt for and read in the width of the room
//		System.out.print("\nEnter the width of the room: ");
//		width = scan.nextInt();
//		//Prompt for and read in the height of the room
//		System.out.print("\nEnter the height of the room: ");
//		height = scan.nextInt();
//		//Call the method paintMyRoom(length, width, height)
//		double paintAmount = Lab1.paintMyRoom(length, width, height);
//		//Print the result to the console
//		System.out.println("\nTo paint your room, you need: " + String.format("%.2f", paintAmount) + " gallons");
//
//		
//		//test timeToHawaii(hours, mins, secs)
//		//declare integers hours, mins and secs;
//		int hours = 0; int mins = 0; int secs = 0;
//		//Prompt for and read in the hours in integer
//		System.out.println("\nPlease enter the number of hours: ");
//		hours = scan.nextInt();
//		//Prompt for and read in the minutes in integer
//		System.out.println("\nPlease enter the number of minutes: ");
//		mins = scan.nextInt();
//		//Prompt for and read in the seconds in integer
//		System.out.println("\nPlease enter the number of seconds: ");
//		secs = scan.nextInt();
//		//Call the method timeToHawaii(hours, mins, secs)
//		int totalSecond = Lab1.timeToHawaii(hours, mins, secs);
//		//Print the result to the console
//		System.out.println(hours + " Hour(s) " + mins + " Minute(s) " + secs + " Second(s) is equivalent to " + totalSecond + " Second(s)." );
//		
//		
//		//test baseConvert(number, base)
//		int base;	// the new base
//		int base10Num;  // the number in base 10
//		int maxNumber;  // the maximum number that will fit
//		// in 4 digits in the new base
//
//		// read in the base 10 number and the base 
//		System.out.println ("\nBase Conversion Program"); 
//		System.out.print ("\nPlease enter a base (2-9): "); 
//		base = scan.nextInt();
//
//		// Compute the maximum base 10 number that will fit in 4 digits
//		// in the new base and and store it in maxNumber 
//		// tell the user what range the number they
//		// want to convert must be in, using a println statement
//		maxNumber = (base * base * base * base) - 1;
//		System.out.println("\nRange of the base 10 number cannot be larger than " + maxNumber + "!");
//
//		System.out.print ("Please enter a base 10 number to convert: "); 
//		base10Num = scan.nextInt();
//		
//		//call the method baseConvert(base, base10Num)
//		String result = Lab1.baseConvert(base, base10Num);
//		//print the result to the console
//		System.out.println(result);
//		
//		
//		scan.close();

//		int arr[] = {1,2,3,4,5};
//		int count = 0;
//		for(int i = 0 ; i<5; i++ ){
//			if(arr[i]%2==0)
//				arr[i] *= 2;
//			System.out.print(arr[i]);      
//		}
		
//		int[] array= {1, 2, 3, 4};
//      int[] arrayCopy= array;
//      ArrayList<Integer> arrayList= new ArrayList<Integer>();
//      arrayList.add(1);
//      ArrayList<Integer> arrayListCopy= arrayList;
//      System.out.println(arrayListCopy);
//        
//      for(int i = 0; i < array.length; i++) {
//    	  System.out.println(arrayCopy[i]);
//      }
		
		String name = "Jack";
		String nameClone= name;
		System.out.println(name + " " + nameClone);
		name = "Sara";
		System.out.println(name + " " + nameClone);
		System.out.println(name.concat(" Smith"));
		System.out.println(name + " " + nameClone);
	
        
        
	}

}
