public class Bit {
    public static boolean isEven(int n){
        if((n&1)==1) return false;
        return true;
    }
    public static int checkithbit(int n,int i){
        return (n>>i)&1;
    }
    public static int getithbit(int n,int i){
        return (1<<i)&n;
    }
    public static int setithbit(int n,int i){
        return (1<<i)|n;
    }
    public static int clearithbit(int n,int i){
        return ~(1<<i)&n;
    }
    public static int clearLastibit(int n,int i){
        return ((~0)<<i)&n;
    }
    public static int updateithbit(int n,int i,int bit){
        // if(bit==0) return clearithbit(n, i);
        // else return setithbit(n, i);
        n=clearithbit(n, i);
        if(bit==1) return setithbit(n, i);
        return n;
    }
    public static int clearRangeofbit(int n,int i,int j){
        //TC-O(n)
        // for(int bit=i;bit<=j;bit++){
        //     n=~(1<<bit)&n;
        // }
        // return n;

        //TC-O(1)
        int a=(~0)<<j+1;
        int b=~(~0<<i);
        int bitMask=a|b;
        return bitMask & n;
    }
    public static boolean isPower(int n){
        return (n&(n-1))==0;
    }
    public static int NoOfSetbit(int n){
        int count=0;
        while(n!=0){
            if((n&1)==1) count++;
            n>>=1;
        }
        return count;
    }
    public static int fastExponetiation(int a,int b){
        int ans=1;
        while(b!=0){
            if((b&1)==1){
                ans*=a;
            }
            b>>=1;
            a*=a;
        }
        return ans;
    }
    public static void swap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
    }
    public static int add1(int n){
        return -~n;
    }
    public static void toLowerCase(){
        for(char ch='A';ch<='Z';ch++){
            System.out.print((char)(ch | ' ')+" ");
        }
    }
    public static void main(String[] args) {
        // System.out.println(isEven(10));
        // System.out.println(checkithbit(5, 2));
        // System.out.println(getithbit(15, 3));
        // System.out.println(setithbit(5, 1));
        // System.out.println(clearithbit(10, 1));
        // System.out.println(updateithbit(15, 2,0));
        // System.out.println(clearLastibit(15, 2));
        // System.out.println(clearRangeofbit(15, 1,2));
        // System.out.println(isPower(16));
        // System.out.println(NoOfSetbit(15));
        // System.out.println(fastExponetiation(2,5));
        // swap(2,5);
        // System.out.println(add1(5));
        toLowerCase();
    }    
}
