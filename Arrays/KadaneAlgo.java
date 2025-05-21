public class KadaneAlgo {
    public static int kadanemaxsum(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            // sum= Math.max(arr[i],sum+arr[i]);
            maxsum=Math.max(sum,maxsum);
            if(sum<0) sum=0;
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        System.out.println(kadanemaxsum(arr));
    }
}
