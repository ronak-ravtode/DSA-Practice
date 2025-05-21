// Leetcode 31: Next Permutation
// Link : https://leetcode.com/problems/next-permutation
// Difficulty : EMedium
// Approach : find gola,gola's just large number and this two swapp after reverse after gola element
// Time Complexity : O(n), Space Complexity : O(1)
public class Leetcode_31_NextPermutation {
    class Solution {
    public void nextPermutation(int[] nums) {
        int gola_index=-1;
        int n=nums.length;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                gola_index=i-1;
                break;
            }
        }
        if(gola_index!=-1){
            int swap_index=gola_index;
            for(int i=n-1;i>gola_index;i--){
                if(nums[i]>nums[gola_index]){
                    swap_index=i;
                    break;
                }
            }
            int temp=nums[gola_index];
            nums[gola_index]=nums[swap_index];
            nums[swap_index]=temp;
        }
        for(int i=gola_index+1,j=n-1;i<j;i++,j--){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}
}
