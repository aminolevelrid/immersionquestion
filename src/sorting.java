import java.util.*;
public class sorting {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int k=sc.nextInt();
            int arr[]=new int[k];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int l=0;
            int pos=arr[arr.length-1];
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]<pos){
                    int temp=arr[i];
                    arr[i]=arr[l];
                    arr[l]=temp;
                    l++;
                }
            }
            int temp=arr[l];
            arr[l]=arr[arr.length-1];
            arr[arr.length-1]=temp;
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }

        }
    }

