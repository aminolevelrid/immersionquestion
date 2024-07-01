import java.util.*;
public class consecutiveoddarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int arr[]=new int[k];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        int count=0;
//for(int i=0;i<arr.length;i++) {
//    count=0;
//    for (int j = i; j < arr.length; j++) {
//        if (arr[i] % 2 != 0 && arr[j] % 2 != 0) {
//            count++;
//            max = Math.max(count, max);
//        } else {
//            count = 0;
//            break;
//        }
//    }
//}
//        System.out.println(max);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2!=0 && arr[i+1]%2!=0){
                count++;
                max=Math.max(max,count);
            }
            else{
                count=0;
                break;
            }
        }
    if(max>2){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
}}




