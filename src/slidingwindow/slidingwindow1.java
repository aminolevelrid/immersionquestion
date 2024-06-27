package slidingwindow;

public class slidingwindow1 {
    public static void main(String[] args) {
        int arr[]={1,8,30,-5,20,7};
        int k=3;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int max=Integer.MIN_VALUE;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i]-arr[i-k];
            max=Math.max(max,sum);
        }
        System.out.println(max);


    }
}
