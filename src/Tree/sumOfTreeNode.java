package Tree;


public class sumOfTreeNode {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(0);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(0);
        a.left = b;
        a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        g.left=h; g.right=i;

        display(a);
        System.out.println();
//        a.left=null;
        System.out.println(sum(a));
        System.out.println(mul(a));
        System.out.println(mulNonZero(a));
    }
    private  static int mul(Node root){
        if(root==null) return 1;
        return root.val * mul(root.left) * mul(root.right);
    }
    private static int sum(Node root){
        if(root==null) return 0;
        return root.val + sum(root.left) +sum(root.right);
    }
    private static int mulNonZero(Node root){
            if(root==null) return 1;
            int left = mulNonZero(root.left);
            int right = mulNonZero(root.right);
            return (root.val==0?1:root.val)*left*right;
    }
    private static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
}
