package assignment3;
import java.util.*;

public class powerxn {
    public static int print(double k,int p){
     if(p==0){
         return 1;
     }
     double temp=print(k,p/2);
     if(p%2==0){
         return (int) (temp*temp);
     }
     else{
         if(p>0){
             return (int)(k*temp*temp);
         }
         else{
             return (int) ((temp * temp) / k);
         }

     }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double k=sc.nextDouble();
        int p=sc.nextInt();
       System.out.print((double)print(k,p));
    }

}
