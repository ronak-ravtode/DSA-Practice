// Leetcode 33: Search in Rotated Sorted Array
// Link : https://leetcode.com/problems/problems/search-in-rotated-sorted-array
// Difficulty : Medium
// Approach : Advance Binary Search
// Time Complexity : O(logn), Space Complexity : O(1)
public class Leetcode_33_SearchinRotatedSortedArray {
    class Solution {
    public int search(int[] nums, int target) {
        int si=0,ei=nums.length-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(nums[mid]==target) return mid;
            if(nums[si]<=nums[mid]){
                if(nums[si]<=target && target<=nums[mid]){
                    ei=mid-1;
                }
                else si=mid+1;
            }
            else{
                if(nums[mid]<=target && target<=nums[ei]){
                    si=mid+1;
                }
                else ei=mid-1;
            }
        }
        return -1;
    }
}
}
