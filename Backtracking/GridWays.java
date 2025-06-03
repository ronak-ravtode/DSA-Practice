public class GridWays {
    public static int gridWays(int n,int m){
        if(n==1 || m==1) return 1;
        return gridWays(n-1, m)+gridWays(n, m-1);
    }
    public static void main(String[] args) {
        System.out.println(gridWays(3, 3));
    }
}
