// Leetcode 1: Two Sum
// Link : https://leetcode.com/problems/two-sum
// Difficulty : Easy
// Approach : Two Pointer
// Time Complexity : O(n), Space Complexity : O(1)
package LeetCode;
public class Leetcode_26_RemoveDuplicate{
    class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
       for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[j]) j++;
        nums[j]=nums[i];
       }
       return j+1; 
    }
}
}