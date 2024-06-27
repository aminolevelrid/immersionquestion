import java.util.*;
public class preodertree {
        public static class Node{
            int data;
            Node left;
            Node right;
            Node(int data){
                this.data=data;
                this.left=null;
                this.right=null;
            }
        }
        public static Node preoder(int i,int a[]){
            if(i>=a.length || a[i]==-1)
                return null;
            Node newnode=new Node(a[i]);
            newnode.left=preoder(2*i+1,a);
            newnode.right=preoder(2*i+2,a);
            return newnode;
        }
        public static int depth(Node curr){
            if(curr==null){
                return 0;
            }
            return 1+Math.max(depth(curr.left),depth(curr.right));

        }
        public static int max(Node curr){
            if(curr==null){
                return Integer.MIN_VALUE;        }
            int l=max(curr.left);
            int p=max(curr.right);
            int ans=Math.max(l,p);
            ans=Math.max(ans,curr.data);
            return ans;
        }
        public static boolean identical(Node curr,Node curr1){
            if(curr==null && curr1==null){
                return true;
            }
            if(curr==null){
                return false;
            }
            if(curr1==null){
                return false;
            }
            boolean ans=(curr.data==curr1.data);
            ans=ans && identical(curr.left,curr1.left);
            ans=ans && identical(curr.right,curr1.right);
            return ans;

        }
        public static int sumofthemax(Node curr){
            if(curr==null){
                return 0;
            }
            int l=sumofthemax(curr.left);
            int p=sumofthemax(curr.right);
            return curr.data+l+p;
        }
        public static void display(Node curr){
            if(curr==null){
                return;
            }
            System.out.print((curr.data+" "));
            display(curr.left);
            display(curr.right);
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int k=sc.nextInt();
            int arr[]=new int[k];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int arr1[]=new int[k];
            for(int i=0;i<arr1.length;i++){
                arr1[i]=sc.nextInt();
            }
            Node p=preoder(0,arr1);
            Node u=preoder(0,arr);
            int a=depth(u);
            System.out.println(a);
            System.out.println(max(u));
            System.out.println(sumofthemax(u));
            System.out.println(identical(p,u));
            display(u);
        }
    }
