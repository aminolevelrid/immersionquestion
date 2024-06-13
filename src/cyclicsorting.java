import java.util.*;
public class cyclicsorting {
    public static void main(String[] args) {
        int []arr={6,1,5,4,2,3};
        int n=arr.length;
        for(int i=0;i<n;i++){
           while(arr[i]!=i+1){
                int temp=arr[i];
                arr[i]=arr[temp-1];
                arr[temp-1]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
