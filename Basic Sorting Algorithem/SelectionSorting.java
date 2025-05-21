public class SelectionSorting {
    public static void SelectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minidx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minidx]){
                    minidx=j;
                }
            }
            int temp=arr[minidx];
            arr[minidx]=arr[i];
            arr[i]=temp;
        }
    }
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        SelectionSort(arr);
        PrintArray(arr);

    }    
}
