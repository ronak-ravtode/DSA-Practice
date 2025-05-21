public class buynsellstock{
    public static int maxProfitFromSell(int arr[]){
        int buy=arr[0];
        int MaxProfit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>buy){
                int Profit=arr[i]-buy;
                MaxProfit=Math.max(Profit, MaxProfit);
            }
            else buy=arr[i];
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(maxProfitFromSell(arr));
    }
}