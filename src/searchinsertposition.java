import java.util.*;
public class searchinsertposition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int arr[]=new int[p];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int target=sc.nextInt();
        int start=0;
        int end=arr.length-1;
        int mid=0;

        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

            System.out.println(start);


    }
}
