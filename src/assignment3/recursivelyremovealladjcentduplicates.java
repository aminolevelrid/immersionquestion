package assignment3;
import java.util.*;

public class recursivelyremovealladjcentduplicates {
    public static void print(String k,String ans){
        if(k.length()==0){
        }
        for(int i=0;i<k.length()-1;i++){
            if(k.charAt(i)==k.charAt(i+1)){
                print(k.substring(2),ans+k.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String p=sc.next();
        print(p,"");
    }
}
