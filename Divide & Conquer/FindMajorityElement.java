public class FindMajorityElement {
    public static int Appo1MajorityElement(int arr[]){

        // Brute Force Approach
        //O(n^2)

        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]) count++;
            }
            if(count>arr.length/2) return arr[i];
        }
        return -1;
    }
    public static int Appo2MajorityElement(int arr[],int si,int ei){

        //O(logn)

        if(si==ei){
            return arr[si];
        }

        int mid=si+(ei-si)/2;

        int left=Appo2MajorityElement(arr, si, mid);
        int right=Appo2MajorityElement(arr, mid+1, ei);

        if(left==right) return left;

        int leftCount=CountInRange(arr,left,si,ei);
        int rightCount=CountInRange(arr, right, si, ei);

        return leftCount>rightCount ? left:right;
    }
    private static int CountInRange(int arr[],int num,int si,int ei){
        int count=0;
        for(int i=si;i<ei;i++){
            if(arr[i]==num) count++;
        }
        return count;
    }

    public static int Appo3MajorityElement(int arr[]){
        int count=0;
        int candidate=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                candidate=arr[i];
            }
            if(candidate==arr[i]) count++;
            else count--;
        }
        return candidate;
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        // System.out.println(Appo1MajorityElement(arr));
        // System.out.println(Appo2MajorityElement(arr,0,arr.length-1));
        System.out.println(Appo3MajorityElement(arr));
    }    
}
