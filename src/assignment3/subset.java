package assignment3;
import java.util.*;


public class subset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer>list=new ArrayList<>();
        temp(arr,list);
    }
    public static void temp(int arr[],ArrayList<Integer>list){

    }
}
