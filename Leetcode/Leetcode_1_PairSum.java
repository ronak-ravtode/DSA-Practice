// Leetcode 1: Two Sum
// Link : https://leetcode.com/problems/two-sum
// Difficulty : Easy
// Approach : Use Brute Force
// Time Complexity : O(n^2), Space Complexity : O(1)
package Leetcode_temp;

public class Leetcode_1_PairSum {
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target) return new int[]{i,j};
            }
        }
        return new int[]{};
    }
}
}
