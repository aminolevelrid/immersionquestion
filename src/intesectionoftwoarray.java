import java.util.*;
public class intesectionoftwoarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int arr[]=new int[k];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int l=sc.nextInt();
        int p=0;
        int arr1[]=new int[l];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        int z=arr[0];
        int o=arr1[0];
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (k > l) {
                    if (z == o) {
                        System.out.println(arr1[j]);
                        z++;
                        o++;
                    } else if (z != o) {
                        z++;
                    }
                } else if (k == l) {
                    if (z == l) {
                        System.out.println(arr1[j]);
                        z++;
                        l++;

                    } else if (k < l) {
                        if (z == o) {
                            System.out.println(arr[i]);
                            z++;
                            o++;
                            break;
                        } else {
                            o++;
                        }
                    }
                }
            }
        }}}
