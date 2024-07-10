package assignment.assignment1.assignment4;

import java.util.Scanner;

public class balancetree{
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node preorder(int i, int a[]) {
        if (i >= a.length || a[i] == -1)
            return null;
        Node newNode = new Node(a[i]);
        newNode.left = preorder(2 * i + 1, a);
        newNode.right = preorder(2 * i + 2, a);
        return newNode;
    }

    public static int checkBalance(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = checkBalance(root.left);
        if (leftHeight == -1) return -1;
        int rightHeight = checkBalance(root.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static boolean isBalanced(Node root) {
        return checkBalance(root) != -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int arr[] = new int[k];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Node root = preorder(0, arr);
        System.out.println(isBalanced(root));
    }
}
