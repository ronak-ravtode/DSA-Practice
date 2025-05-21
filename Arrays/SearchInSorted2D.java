public class SearchInSorted2D {
    public static int[] SearchIn2D(int arr[][],int target){
        int n=arr.length;
        int m=arr[0].length;
        //brute Force
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(arr[i][j]==target) return new int[]{i,j};
        //     }
        // }
        // return new int[]{};
        int i=0,j=n-1;
        while(i<n && j>=0){
            if(arr[i][j]==target) return new int[]{i,j};
            if(arr[i][j]>target) j--;
            else i++;
        }
        return new int[]{};
    }
    private static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.printf("%2d", arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        PrintArray(SearchIn2D(arr,33));
    }
}
