package hackerrank;

public class AppleStocks {

	public static void main(String[] args) {
        final int actual = getMaxProfit(new int[] {10, 3, 12, 11});
        System.out.println(actual);
	}

	public static int getMaxProfit(int[] stockPrices) { 
		if(stockPrices.length < 2) {
		    throw new IllegalArgumentException("Need at least 2 prices");
		}
		
		int min = 0;
		int max = 0;
		int secondMax = 1;
		
		for(int i = 1; i < stockPrices.length; i++) {
			if(stockPrices[min] > stockPrices[i])  {
				min = i;
			}
			
			if(stockPrices[max] < stockPrices[i])  {
				secondMax = max;
				max = i;
			}
			
			
		}
		
		// edge case where the prices go down
		if(max < min) {
			return stockPrices[secondMax] - stockPrices[max]; 
		}

		return stockPrices[max] - stockPrices[min];
	}

}
