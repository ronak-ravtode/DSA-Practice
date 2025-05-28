public class SortedAndRotatedArraySearch {
    public static int Search(int arr[],int i,int j,int target){
        if(i>j) return -1;
        int mid=i+(j-i)/2;
        if(arr[mid]==target) return mid;
        if(arr[i]<=arr[mid]){
            if(arr[i]<=target && target<=arr[mid]){
                return Search(arr, i, mid-1, target);
            }
            else return Search(arr, mid+1, j, target);
        }
        else {
            if(arr[mid]<=target && target<=arr[j]){
                return Search(arr, mid+1, j, target);
            }
            else {
                return Search(arr, i, mid-1, target);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(Search(arr,0,arr.length-1,0));
    }    
}
