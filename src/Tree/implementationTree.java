package Tree;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class implementationTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.right=f;

        Node g = new Node(56);
        Node h = new Node(45);

        c.left=g;
        e.left=h;
//        b.left=null;



       display(a);
    }
    private static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
}
