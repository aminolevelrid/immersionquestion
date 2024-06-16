package assignment.assignment1;
import java.util.*;

public class armstrongnumber {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int k=n;
            int count=0;
            while(k>0){
                count++;
                k=k/10;
            }
            k=n;
            int sum=0;
            while(k!=0){
                int digit=k%10;
                sum=sum+(int)Math.pow(digit,count);
                k=k/10;
            }
            if(sum==n){
                System.out.print(true);
            }
            else{
                System.out.print(false);
            }
        }
    }

