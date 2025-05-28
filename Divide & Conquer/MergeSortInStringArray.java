public class MergeSortInStringArray {
    public static void MergeSort(String arr[],int si,int ei){
        if(si>=ei) return;
        int mid=si+(ei-si)/2;
        MergeSort(arr, si, mid);
        MergeSort(arr, mid+1, ei);
        Merge(arr,si,mid,ei);
    }
    public static void Merge(String arr[],int si,int mid,int ei){
        String temp[]=new String[ei-si+1];
        int i=si,j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(StringCompare(arr[i],arr[j])){
                temp[k++]=arr[i++];
            }
            else temp[k++]=arr[j++];
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0;k<temp.length;k++){
            arr[k+si]=temp[k];
        }
    }
    public static boolean StringCompare(String str1,String str2){
        return str1.compareTo(str2)<0;
    }
     public static void PrintArray(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String arr[]={"sun","earth","mars","mercury"};
        PrintArray(arr);
        MergeSort(arr,0,arr.length-1);
        PrintArray(arr);
    }     
}
