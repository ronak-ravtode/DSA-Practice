import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row;
        for (int i = 1; i <= 2 * n - 1; i++) {
            row = (i <= n) ? i : 2 * n - i;
            for (int k = 1; k <= n - row; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * row - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
