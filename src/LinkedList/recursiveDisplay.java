package LinkedList;

class Node1{
    int val;
    Node next;
    Node1(int val){
        this.val=val;
        this.next=null;
    }
}

public class recursiveDisplay {
    static  void display(Node node){
        if(node==null){
            System.out.println("null");
            return;
        }
        System.out.print(node.val+" => ");
        display(node.next);
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next=b;
        b.next=c;
        c.next=d;
        display(a);

    }
}
