package assignment3;
import java.util.*;
public class powerof22 {
    public static boolean print(int k){
        if(k==0) {
            return false;
        }
        if(k==1){
            return true;
        }
        if(k%2!=0){
            return false;
        }
        return print(k/2);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        System.out.print(print(k));
    }
}
