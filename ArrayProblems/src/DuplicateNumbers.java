
public class DuplicateNumbers {
	
	
	public static int FirstDuplicate(int[]a) {
		int[] duplicates = new int[a.length];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				int currNum = a[i];
				if(currNum == a[j]) {
					duplicates[j] = a[j];
				}
			}
		}
		
		
		for(int i = 0; i < duplicates.length; i++) {
			if(duplicates[i] != 0) {
				return duplicates[i];
			}
		}
		
		return -1;
		
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {2, 1, 3, 5, 3, 2};
		
		int result = FirstDuplicate(arr);
		
		System.out.println(result);

	}

}
