// Leetcode 121: Best Time to Buy and Sell Stock
// Link : https://leetcode.com/problems/problems/best-time-to-buy-and-sell-stock
// Difficulty : Easy
// Approach : Simple Buy and Sell Concept
// Time Complexity : O(n), Space Complexity : O(1)
public class Leetcode_121_BestTimetoBuynSellStocks {
    class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int MaxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>buy){
                int profit=prices[i]-buy;
                MaxProfit=Math.max(MaxProfit,profit);
            }
            else buy=prices[i];
        }
        return MaxProfit;
    }
}
}
