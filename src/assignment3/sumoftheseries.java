package assignment3;
import java.util.*;

public class sumoftheseries {
    public static int print(int k){
        if(k==0){
            return 0;
        }
        return k+print(k-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        System.out.print(print(k));
    }
}
