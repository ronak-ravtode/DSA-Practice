public class xpowern {
    public static int power(int x,int n){
        if(n==1) return x;
        int halfpower=power(x, n/2);
        if(n%2!=0){
            return halfpower*halfpower*x;
        }
        return halfpower*halfpower;
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
}
