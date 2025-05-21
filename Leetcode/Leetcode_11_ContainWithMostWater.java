// Leetcode 11: Container With Most Water
// Link : https://leetcode.com/problems/container-with-most-water
// Difficulty : Medium
// Approach : Two Pointer
// Time Complexity : O(n), Space Complexity : O(1)

public class Leetcode_11_ContainWithMostWater {
    class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int MaxWater=0;
        while(i<j){
            int Water=(j-i)*Math.min(height[i],height[j]);
            MaxWater=Math.max(MaxWater,Water);
            if(height[i]<height[j]) i++;
            else j--;
        }
        return MaxWater;
    }
}
}
