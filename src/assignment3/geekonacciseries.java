package assignment3;
import java.util.*;

public class geekonacciseries {
    public static int print(int a, int b, int c, int k) {
        if (k == 1) {
            return a;
        }
        if (k == 2) {
            return b;
        }
        if (k == 3) {
            return c;
        }
        return print(a, b, c, k - 1) + print(a, b, c, k - 2) + print(a, b, c, k - 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        while (k > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            System.out.print(print(a, b, c, n)); // Print result on a new line
            k--;
        }

    }
}
