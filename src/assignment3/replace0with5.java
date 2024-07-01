package assignment3;
import java.util.*;
public class replace0with5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        String k=Integer.toString(l);
        String p="";
        for(int i=0;i<k.length();i++){
            char b=k.charAt(i);
            if(b=='0'){
                p+='5';
            }
            else{
                p+=b;
            }
        }
        int y=Integer.parseInt(p);
        System.out.println(y);
    }
}
