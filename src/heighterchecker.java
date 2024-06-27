import java.util.*;
public class heighterchecker {
    public static void main(String[] args) {
        int arr[]={5,1,2,3,4};
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr1[i]!=arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
