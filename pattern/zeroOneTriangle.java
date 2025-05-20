import java.util.*;

public class zeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        for (int i = 0; i < n; i++) {
            a = (i % 2 == 0) ? 0 : 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(a);
                a = 1 - a;
            }
            System.out.println();
        }
    }
}