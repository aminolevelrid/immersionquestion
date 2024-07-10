package assignment.assignment1.assignment4;
import java.util.*;

public class oddevendiffrence {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){

            this.data=data;
        }
    }
    public static Node preoder(int i, int a[]){
        if(i>=a.length || a[i]==-1)
            return null;
        Node newnode=new Node(a[i]);
        newnode.left=preoder(2*i+1,a);
        newnode.right=preoder(2*i+2,a);
        return newnode;
    }
    public static int diff(Node root){
        if(root==null){
            return 0;
        }
        int sum=0;
        int level=1;
        if(level==1){
            sum=root.data;
            level++;
        }
        int i=0;
        int j=0;
        int k=0;
        int p=0;
        if(level%2==0){
            k=diff(root.left);
            p=diff(root.right);
            level++;
        }
        else{
            i=diff(root.left);
            j=diff(root.right);
            sum+=i+j;
        }
        int max=sum-(k+p);
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int arr[]=new int[k];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Node u=preoder(0,arr);
        System.out.println(diff(u));


    }
}
