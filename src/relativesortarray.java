import java.util.*;
public class relativesortarray {
    public static void main(String[] args) {
        int arr1[]={2,3,1,3,2,4,6,7,2,19};
        int arr2[]={2,1,4,3,9,6};
        for(int i=0;i<arr1.length;i++){
            for(int j=i;j<arr2.length;j++){
                if(arr1[i]!=arr2[j]){
                    arr1[arr1.length-1]=arr2[j];
                }
            }
        }
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
