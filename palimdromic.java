import java.util.Scanner;

public class palimdromic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            int a=i;
            for(int j=1;j<=2*i-1;j++){
                System.out.print(a);
                if(j>=i) a++;
                else a--;
            }
            System.out.println();
        }
    }
}
