public class QuickSorting {
    public static void QuickSort(int arr[],int si,int ei){
        if(si>=ei) return;
        int pivot=partition(arr,si,ei);
        QuickSort(arr, si, pivot-1);
        QuickSort(arr, pivot+1, ei);
    }
    private static int partition(int arr[],int si,int ei){
        int i=si;
        int pivot=ei;
        while(si<ei){
            if(arr[si]<=arr[pivot]){
                int temp=arr[si];
                arr[si]=arr[i];
                arr[i]=temp;
                i++;
            }
            si++;
        }
        int temp=arr[i];
        arr[i]=arr[pivot];
        arr[pivot]=temp;
        return i;
    }
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        PrintArray(arr);
        QuickSort(arr,0,arr.length-1);
        PrintArray(arr);
    }     
}
