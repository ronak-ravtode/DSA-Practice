// package Arrays;

public class BinarySearch {
    public static int binarySearch(int arr[],int key){
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==key) return mid;
            if(arr[mid]<key) left=mid+1;
            else right=mid; 
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println(binarySearch(arr,key));
    }
}
