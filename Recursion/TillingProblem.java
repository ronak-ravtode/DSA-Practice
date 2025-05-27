public class TillingProblem {
    public static int TillingWays(int n){
        if(n==1 || n==0) return 1;
        return TillingWays(n-1) + TillingWays(n-2);
    }
    public static void main(String[] args) {
        System.out.println(TillingWays(3));
    }
}
