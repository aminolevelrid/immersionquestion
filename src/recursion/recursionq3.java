package recursion;
import java.util.*;
public class recursionq3 {
    public static int print(int k){
        if(k==0 || k==1){
            return k;
        }
        int p=print(k-1);
        int l=print(k-2);
        return p+l;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        System.out.print(print(k));
    }
}
