package assignment.assignment1;
import java.util.*;

public class GamesofInteger {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int k=sc.nextInt();
            while(k>0){
                int p=sc.nextInt();
                if((p+1)%3==0 || (p-1)%3==0){
                    System.out.println("First");

                }
                else if((p+1)%3!=0 ||(p-1)%3!=0){
                    System.out.println("Second");
                }
                k--;

            }
        }
    }

