package binnarysearchtree;

public class inordertraversal {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data=data;
        }
    }
    public static Node insert(Node a,int val){
        if(a==null){
            a =new Node(val);
            return a;
        }
        if(a.data>val){
            a.left=insert(a.left,val);
        }
        else{
            a.right=insert(a.right,val);
        }
        return a;
    }
    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print (root.data+" ");
        inorder(root.right);
        }
        public static boolean search(Node root,int val){
        if(root==null){
            return false;
        }
        if(root.data>val){
            return search(root.left,val);
        }
        else if(root.data==val){
            return true;
        }
        else{
            return search(root.right,val);
        }

        }

    public static void main(String[] args) {
        int value[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<value.length;i++){
            root=insert(root,value[i]);
        }
        inorder(root);
        if (search(root, 3)) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
