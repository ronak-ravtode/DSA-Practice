// Leetcode 26: Remove Duplicates from Sorted Array
// Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array
// Difficulty : Easy
// Approach : Two Pointer
// Time Complexity : O(n), Space Complexity : O(1)
public class Leetcode_26_RemoveDuplicateFromSortedArray{
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