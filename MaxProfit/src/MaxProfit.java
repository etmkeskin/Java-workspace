import java.util.List;

public class MaxProfit {
	
	public static long getMaximumProfit(List<Integer> prices, List<Integer> profits) {
		
		int n = prices.size();
	    long maxProfit = -1; // Initialize with -1 to indicate no suitable triplets found

	    for (int i = 0; i < n - 2; i++) {
	        for (int j = i + 1; j < n - 1; j++) {
	            for (int k = j + 1; k < n; k++) {
	                if (prices.get(i) <= prices.get(j) && prices.get(j) < prices.get(k)) {
	                    long totalProfit = profits.get(i) + profits.get(j) + profits.get(k);
	                    maxProfit = Math.max(maxProfit, totalProfit);
	                }
	                else {
	                	maxProfit = -1;
	                }
	            }
	        }
	    }

	    return maxProfit;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		List<Integer> prices = List.of(1, 5, 15, 20, 6);
        List<Integer> profits = List.of(2, 3, 4, 5, 6);
        long result = getMaximumProfit(prices, profits);
        System.out.println("Maximum total profit: " + result);
		
		
	}

}
