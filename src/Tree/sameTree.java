package Tree;

public class sameTree {
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
        Node c = new Node(2);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(5);
        Node g = new Node(4);


        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=g;c.left=f;



        Node p = new Node(1);
        Node q = new Node(2);
        Node r = new Node(3);
        Node s = new Node(4);
        Node t = new Node(5);
        Node u = new Node(6);

        p.left=q; p.right=r;
        q.left=s; q.right=t;
        r.left=u;
        if(!isSameTree(a,p)){
            System.out.println("NO");
        }
        else{
            System.out.println("Yes");
        }
        System.out.println("Symmetric: ");
        if(!isSymmetric(a)){
            System.out.println("NO");
        }
        else{
            System.out.println("Yes");
        }
    }
    private static boolean isSameTree(Node a, Node p){
        if(a==null && p==null) return true;
        if(a==null || p==null) return false;
        return (a.val==p.val) &&
                isSameTree(a.left, p.left) &&
                isSameTree(a.right, p.right);
    }
    private static boolean isSymmetric(Node root){
        if(root==null) return true;
        return isMirror(root.left, root.right);

    }
    private static boolean isMirror(Node b, Node c){
        if(b==null && c==null) return true;
        if(b==null || c==null) return false;
        return (b.val==c.val) &&
                isMirror(b.left, c.right) &&
                isMirror(b.right, c.left);
    }
}
