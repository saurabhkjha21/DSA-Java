package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Traversal {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(10);
        Node d = new Node(6);
        Node e = new Node(8);
        Node f = new Node(11);


        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;
        System.out.println("Preorder: ");
        preOrder(a);
        System.out.println();

        System.out.println("Inorder: ");
        inOrder(a);
        System.out.println();

        System.out.println("Postorder: ");
        postOrder(a);
        System.out.println();

        System.out.println("Invert: ");
        invertTree(a);
        System.out.println();

        preOrder(a);
        System.out.println();

        inOrder(a);
        System.out.println();

        postOrder(a);
        System.out.println();

        levelOrderTraversal(a);
        System.out.println();

        levelOrderTraversalRight(a);
        System.out.println();

        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.println("Print Kth level");
        printKthLevel(a, 1,n);

    }
    private static void preOrder(Node root){
            if(root==null) return;
            System.out.print(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);
    }
    private static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    private static void invertTree(Node root){
        if(root==null) return;
        Node temp = root.left;
        root.left=root.right;
        root.right=temp;
        invertTree(root.left);
        invertTree(root.right);
    }

    private static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    private static void levelOrderTraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(!q.isEmpty()){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
    }
    private static void levelOrderTraversalRight(Node root){
        if(root==null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.right!=null) q.add(front.right);
            if(front.left!=null) q.add(front.left);
        }
    }

    private static void printKthLevel(Node root, int level, int n){
        if(root==null) return;
        if(n==level){
            System.out.print(root.val+" ");
        }
        printKthLevel(root.left,level+1,n);
        printKthLevel(root.right, level+1,n);

    }

}
