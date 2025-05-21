// Leetcode 122: Best Time to Buy and Sell Stock II
// Link : https://leetcode.com/problems/problems/best-time-to-buy-and-sell-stock-ii
// Difficulty : Medium
// Approach : Simple Buy and Sell Concept
// Time Complexity : O(n), Space Complexity : O(1)
public class Leetcode_122_BestTimetoBuynSellStocks2 {

    class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int TotalProfit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>buy){
                TotalProfit+=prices[i]-buy;
                buy=prices[i];
            }
            else buy=prices[i];
        }
        return TotalProfit;
    }
}
}
