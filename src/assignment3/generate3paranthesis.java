package assignment3;
import java.util.*;

public class generate3paranthesis {
    public static void print(int k,int open,int close,String ans){
        if(open==k && close==k){
            System.out.print(ans+" ");
            return;
        }
        if(open<k){
            print(k,open+1,close,ans+"(");
        }
        if(close<open){
            print(k,open,close+1,ans+")");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        print(k,0,0,"");
    }
}
