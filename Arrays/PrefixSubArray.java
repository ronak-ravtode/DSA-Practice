public class PrefixSubArray {
    public static int[] prefixsubarray(int arr[]){
        int n=arr.length;
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }
        int maxSum=Integer.MIN_VALUE;
        int resI=0,resJ=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int currsum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                // maxSum=Math.max(currsum,maxSum);
                if(maxSum<currsum){
                    maxSum=currsum;
                    resI=i;
                    resJ=j;
                }

            }
        }
        return new int[]{resI,resJ};
    }
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        PrintArray(prefixsubarray(arr));
    }
}
