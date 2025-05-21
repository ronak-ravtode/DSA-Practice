// Leetcode 26: Remove Element
// Link : https://leetcode.com/problems/remove-element
// Difficulty : Easy
// Approach : Two Pointer
// Time Complexity : O(n), Space Complexity : O(1)
public class Leetcode_27_RemoveElement{
    class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
}
