import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bestTimeBuySellStock {
	int max_profit= 0;
	int profit_value = 0;
	
	public int maxProfit(int[] prices) {
		
		int max_value = Integer.MAX_VALUE;
		int max_profit = 0;
		
		
		for (int i=0;i<prices.length;i++) {
			if(prices[i]<max_value)
				max_value = prices[i];
			else if(prices[i]-max_value > max_profit)
				max_profit = prices[i] - max_value;
		}
		return max_profit;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bestTimeBuySellStock b = new bestTimeBuySellStock();
		int[] intArray = {7,5,4,15,1,14};
		b.maxProfit(intArray);
		System.out.println(b.maxProfit(intArray));
		int[] intArray2 = {7,1,5,3,6,4};
		
		b.maxProfit(intArray2);
		System.out.println(b.maxProfit(intArray2));
		int[] anArray = {7,6,4,3,1};
		
		b.maxProfit(anArray);
				
		System.out.println(b.maxProfit(anArray));
	}
	


}
