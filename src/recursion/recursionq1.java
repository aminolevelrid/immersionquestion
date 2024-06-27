package recursion;
import java.util.*;
public class recursionq1 {
    public static boolean print(String k,int p,int i){
                if(i>=k.length()){
                    return false;
                }


                if(k.charAt(i)!=k.charAt(p)){
                    return false;
                }
                print(k,p-1,i++);

                return true;


            }
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                String k=sc.next();
                if(print(k,k.length()-1,0)){
                    System.out.print("true");
                }
                else{
                    System.out.print("false");
                }
            }
        }