import java.util.*;
public class leftrotatearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=sc.nextInt();
        }
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.print(Arrays.toString(arr));


    }
}
