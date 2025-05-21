// Leetcode 54: Spiral Matrix
// Link : https://leetcode.com/problems/spiral-matrix
// Difficulty : Medium
// Approach : Simple understanding
// Time Complexity : O(n), Space Complexity : O(1)
import java.util.ArrayList;
import java.util.List;

public class Leetcode_54_SpiralMatrix {
    class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int n=matrix.length,m=matrix[0].length;
        int sr=0,er=n-1;
        int sc=0,ec=m-1;
        while(sr<=er && sc<=ec){
            for(int j=sc;j<=ec && sr<=er && sc<=ec;j++){
                result.add(matrix[sr][j]);
            }
            sr++;
            for(int i=sr;i<=er && sr<=er && sc<=ec;i++){
                result.add(matrix[i][ec]);
            }
            ec--;
            for(int j=ec;j>=sc && sr<=er && sc<=ec;j--){
                result.add(matrix[er][j]);
            }
            er--;
            for(int i=er;i>=sr && sr<=er && sc<=ec;i--){
                result.add(matrix[i][sc]);
            }
            sc++;
        }
        return result;
    }
}
}
