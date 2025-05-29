public class FindInversionCount {
    public static int Appo1InversionCount(int arr[]){

        //Brute Force
        //O(n^2)

        int invCount=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]) invCount++;
            }
        }

        return invCount;
    }
    public static int Appo2InversionCount(int arr[],int si,int ei){
        if(si>=ei) return 0;
        int inv=0;
        int mid=si+(ei-si)/2;
        inv+=Appo2InversionCount(arr, si, mid);
        inv+=Appo2InversionCount(arr, mid+1, ei);
        inv+=InversionMerge(arr,si,mid,ei);
        return inv;
    }
    private static int InversionMerge(int arr[],int si,int mid,int ei){
        int temp[]= new int[ei-si+1];
        int i=si,j=mid+1;
        int k=0;
        int inv=0;
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else {
                temp[k++]=arr[j++];
                inv+=mid-i+1;
            }
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
        return inv;
    }
    public static void main(String[] args) {
        int arr[]={1,20,6,4,5};
        // System.out.println(Appo1InversionCount(arr));
        System.out.println(Appo2InversionCount(arr,0,arr.length-1));
    }    
}
