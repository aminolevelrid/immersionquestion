import java.util.*;
public class movezeroes {
    public static void main(String[] args) {
        Scanner ac=new Scanner(System.in);
        int k=ac.nextInt();
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=ac.nextInt();
        }
        int nz=0;
        int z=0;
        while(nz<k){
            if(arr[nz]!=0){
                int temp=arr[nz];
                arr[nz]=arr[z];
                arr[z]=temp;
                z++;
                nz++;
            }
            else{
                nz++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
