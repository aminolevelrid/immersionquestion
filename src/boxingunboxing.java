public class boxingunboxing {
    public static void main(String[] args) {
        int arr[]={3,3};
        int l=0;
        for(int i=0;i<arr.length;i++){
            int index=Math.abs(arr[i])-1;
            if(arr[index]<0){
                l = index + 1;

            }
            if(arr[index]>0){
                arr[index]*=-1;
            }
        }
        System.out.println(l);

    }
}
