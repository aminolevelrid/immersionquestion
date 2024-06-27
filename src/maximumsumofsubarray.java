public class maximumsumofsubarray {
    public static void main(String[] args) {
        int arr[]={5};
        int n=1;
        int s=5;
        int sum=0;
        int start=0;
        int end=1;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
                while (sum > s && start <=i) {
                    sum -= arr[start];
                    start++;
                }
                if (sum == s) {
                    end = i;
                    break;
                }
            }
        if(end==-1){
            System.out.println("nothing");
        }
        else{
        System.out.println(start+1+" "+(end+1));}
    }
}
