public class FindFirstOccurrence {
    public static int FirstOccurrence(int arr[],int key,int i){
        if(i==arr.length) return -1;
        if(arr[i]==key) return i;
        return FirstOccurrence(arr, key, i+1);
    }
    public static void main(String[] args) {
        System.out.println(FirstOccurrence(new int[]{8,3,6,9,5,10,2,5,3},5,0));
    }
}
