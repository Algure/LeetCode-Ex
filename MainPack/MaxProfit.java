import java.util.*;

public class LeetCodes {

public static int maxProfit(int[] prices) {
		 
		 int sum=0;
		 for(int i=prices.length-1;i>0;i--) {
			 if(prices[i]>prices[i-1]) {
				 sum+=(prices[i]-prices[i-1]);
			 }
		 }
	     return sum;
	 }
}
