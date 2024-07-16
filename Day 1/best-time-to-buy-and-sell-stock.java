121. Best Time to Buy and Sell Stock

https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

// Solution
class Solution {
    public int maxProfit(int[] prices) {
        
        int min = prices[0],max = 0;
        for(int i=0;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            int profit = prices[i]-min;
            max = Math.max(profit,max);
        }
        
        return max;
    }
}