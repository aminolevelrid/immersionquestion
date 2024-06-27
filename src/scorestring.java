import java.util.*;
public class scorestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String k=sc.next();
        int sum=0;
        for(int i=0;i<k.length()-1;i++){
            char y=k.charAt(i);
            char u=k.charAt(i+1);
            int l=Math.abs(y-u);
            sum+=l;
        }
        System.out.println(sum);
    }
}
