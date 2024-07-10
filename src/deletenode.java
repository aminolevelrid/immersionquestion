import binnarysearchtree.inordertraversal;
import java.util.*;
public class deletenode {
    public static class Node {
        int data;
       Node left;
       Node right;
        Node (int data){
            this.data=data;
        }
    }

        public static   Node  insert(Node a, int val) {
            if (a == null) {
                a = new Node (val);
                return a;
            }
            if (a.data > val) {
                a.left = insert(a.left, val);
            } else {
                a.right = insert(a.right, val);
            }
            return a;
        }
        public static Node delete(Node root,int val){
            if(root.data>val){
                root.left=delete(root.left,val);
            }
            else if(root.data<val){
                root.right=delete(root.right,val);
            }
            else{
                if(root.left==null && root.right==null){
                    return null;
                }
                if(root.left==null){
                    return root.right;
                }
                else if(root.right==null){
                    return root.left;
                }
                Node is=inordert(root.right);
                root.data=is.data;
                root.right=delete(root.right,is.data);
            }
            return root;

        }
        public static Node inordert(Node root){
            while(root.left!=null){
                root=root.left;
            }
            return root;
        }
    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print (root.data+" ");
        inorder(root.right);
    }

        public static void main(String[] args) {
            int value[] = {5, 1, 3, 4, 2, 7};
         Node root = null;
            for (int i = 0; i < value.length; i++) {
                root = insert(root, value[i]);
            }
            inorder(root);
            System.out.println();
            root=delete(root,5);
            inorder(root);
        }
    }

