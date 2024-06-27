package assignment3;
import java.util.*;

public class givenarrayissorted {
    public static int print(int arr[],int k){
        if(arr.length-1==k){
            return 1;
        }

        if(arr[k+1]<arr[k]){
            return 0;
        }
        return print(arr,k+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int arr[]=new int[k];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(print(arr,0));
    }
}
