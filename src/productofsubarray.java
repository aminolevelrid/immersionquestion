import java.util.*;
public class productofsubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int arr[]=new int[k];
        for(int i=1;i<k;i++){
            arr[i]=sc.nextInt();
        }
        int prefix=1;
        int s=1;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<k;i++){
           if(prefix==0){
               prefix=1;
           }
           if(s==0){
               s=1;
           }
           prefix*=arr[i];
           s*=arr[k-1-i];
           max=Math.max(max,Math.max(s,prefix));
        }
        System.out.println(max);
    }
}
