package hackerrank;

public class AppleStocks {

	public static void main(String[] args) {
        final int actual = getMaxProfit(new int[] {7, 2, 8, 9});
        System.out.println(actual);
	}

	public static int getMaxProfit(int[] stockPrices) { 
		if(stockPrices.length < 2) {
		    throw new IllegalArgumentException("Need at least 2 prices");
		}
		
		int minimum = stockPrices[0] < stockPrices[1] ? stockPrices[0] : stockPrices[1];
		int profit = stockPrices[1] - stockPrices[0];

		for(int i = 2; i < stockPrices.length; i++) {
			int possibleProfit = stockPrices[i] - minimum;
			
			if(possibleProfit >= profit) {
				profit = possibleProfit;
				if(stockPrices[i] < minimum) {
					minimum = stockPrices[i];
				}
			}
			
		}
				
		return profit;
	}

}
