public class thirdlargestelement {
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        int max=Integer.MIN_VALUE;
        int max1 =Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if (max < arr[i]) {
                max2=max1;
                max1 = max;
                max = arr[i];
            } else if (arr[i]!=max1 &&max1 < arr[i]) {
                max2=max1;
                max1 = arr[i];

            }
            else if(arr[i]!=max2 && max2<arr[i]){
                max2=arr[i];
            }
        }
        System.out.println(max2);

    }
}
