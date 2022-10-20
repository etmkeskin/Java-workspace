
public class Lab4 {

	public static boolean isPerfect (int n) {
		boolean result = true;
		
		if(n <= 0) {
			result = false;
		}
		else {
			int i = 2;
			int sum = 0;
			while(i <= n) {
				if(n % i == 0) {
					sum += n / i;
				}
				i++;
			}
			if(sum == n) {
				return result;
			}
			else {
				result = false;
			}
		}
		
		
		return result;
	
	}
	
	
	public static int getVowels (String str) {
		int count = 0;
		int length = str.length();
		int i = 0;
		while(i < length) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' || str.charAt(i) == 'i' ||
					str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'u' || str.charAt(i) == 'U') {
				count++;
			}
			i++;
		}
			
		return count;
		
	}
	
	
	public static String switchLetterCase (String str) {
		String result = "";
		
		int length = str.length();
		int i = 0;

		while(i < length) {
			char ch = str.charAt(i);
			boolean isLowerCase = Character.isLowerCase(ch);
			boolean isUpperCase = Character.isUpperCase(ch);
			if(isLowerCase == true) {
				result += Character.toUpperCase(ch);
				
			}
			else if(isUpperCase == true) {
				result += Character.toLowerCase(ch);
				
			}
			else if(isLowerCase || isUpperCase == false) {
				if(ch == ' ') {
					result += " ";
				}
				else {
					result += ch;
				}
			}
			i++;
		}
		
		return result;
		
	}
	
	
	public static int digitSum (int number) {
		int result = 0;
		String num = String.valueOf(number);
		int length = num.length();
		
		if(number == 0) {
			return result;
		}
		else if(number < 0) {
			for(int i = 0; i < length; i++) {
				result += number % 10;
				number /= 10;
			}
		}
		else {
			for(int i = 0; i < length; i++) {
				result += number % 10;
				number /= 10;
			}
		}
		
		return result;
	}
	
	
//	public static String printFactors (int number) {
//		String result = "";
//		
//		int i = 1;
//		while(i <= number) {
//			if(i < number) {
//				if(number % i == 0) {
//					result += (String.valueOf(number / i)) + "-";
//				}
//			}
//			else if(i == number) {
//				if(number % i == 0) {
//					result += String.valueOf(number / i);
//				}
//			}
//			i++;
//		}
//		
//		return result;
//		
//	}
	
	public static String printFactors (int number) {
			String result = "";
			int i = 1;
			
			for(; i <= number; i++) {
				String factor = String.valueOf(i);
				if(number % i == 0) {
					if(i < number) {
						result += factor + "-";
					}
					else if(i == number) {
						result += factor;
					}
					 
				}
			}
			
			return result;
			
		}
}
