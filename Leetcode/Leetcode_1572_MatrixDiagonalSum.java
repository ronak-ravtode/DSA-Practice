// Leetcode 1572: Matrix Diagonal Sum
// Link : https://leetcode.com/problems/matrix-diagonal-sum
// Difficulty : Easy
// Approach : Simple understanding
// Time Complexity : O(n), Space Complexity : O(1)
public class Leetcode_1572_MatrixDiagonalSum {
    class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            if(i!=mat.length-1-i){
                sum+=mat[i][mat.length-1-i];
            }
        }
        return sum;
    }
}
}
