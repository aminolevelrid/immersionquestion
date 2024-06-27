import java.util.*;
public class recursionq4 {
    public static int print(String k,String p){
        if(k.length()==0){
            System.out.println(p+" ");
            return 1;
        }
        int a=0;
        for(int i=0;i<k.length();i++){
            a+=print(k.substring(0,i)+k.substring(i+1),p+k.charAt(i));
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String k=sc.next();
        System.out.print(print(k,""));

    }
}
