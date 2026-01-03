package Tree;

public class MaxValNode {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
        static int count=0;

        public static void main(String[] args) {
            Node a = new Node(1);
            Node b = new Node(1);
            Node c = new Node(0);
            Node d = new Node(7);
            Node e = new Node(9);
            Node f = new Node(7);
            Node g = new Node(0);
            Node h = new Node(2);
            Node i = new Node(1);
            Node j = new Node(-1);
            Node k = new Node(1);

            a.left=b; a.right=c;
            b.left=d; b.right=e;
            c.left=f; c.right=g;
            d.left=k; d.right=h;
            e.left=i; e.right=j;



            display(a);
            System.out.println();
            System.out.println("Maximum Node: "+max(a));
            System.out.println("Minimum Node: "+min(a));
            System.out.println(size(a));
            System.out.println("Level: "+level(a));
        }
        private static int max(Node root){
            if(root==null) return Integer.MIN_VALUE;
            int maxLeft = max(root.left);
            int maxRight = max(root.right);
            return Math.max(root.val, Math.max(maxLeft,maxRight));

        }
        private static int min(Node root){
            if(root==null) return Integer.MAX_VALUE;
            int minLeft = min(root.left);
            int minRight = min(root.right);
            return Math.min(root.val, Math.min(minLeft,minRight));

        }
        private static int size(Node root){
            if(root==null) return 0;
            return  1+ size(root.left) + size(root.right);
        }

        private static int level(Node root){
            if(root==null) return 0;
            int levelL = level(root.left);
            int levelR = level(root.right);
            return 1 + Math.max(levelR, levelL);
        }
        private static void display(Node root){
            if(root==null) return;
            System.out.print(root.val+" ");
            display(root.left);
            display(root.right);


        }
    }
}
