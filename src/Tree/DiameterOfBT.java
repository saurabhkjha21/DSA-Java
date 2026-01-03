package Tree;

public class DiameterOfBT {
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
        Node b = new Node(1);
        Node c = new Node(1);
        Node d = new Node(1);
        Node e = new Node(1);
        Node f = new Node(1);
        Node g = new Node(1);
        Node h = new Node(1);
        Node i = new Node(1);
        Node j = new Node(1);

        a.left = b; a.right=c;
        b.left = d; b.right=e;
        c.left=f; c.right=g;
        d.left=h;h.right=i;
        f.right=j;
        System.out.println("Diameter: "+diameter(a));

    }
    private static int diameter(Node root){
        if(root==null) return 0;
        int leftL = level(root.left);
        int rightL = level(root.right);

        int leftD = diameter(root.left);
        int rightD = diameter(root.right);

        return Math.max(leftL+rightL+1, Math.max(leftD, rightD));

    }
    private static int level(Node root){
        if(root==null) return -1;
        int maxL = level(root.left);
        int maxR = level(root.right);
        return 1 + Math.max(maxR, maxL);
    }

}
