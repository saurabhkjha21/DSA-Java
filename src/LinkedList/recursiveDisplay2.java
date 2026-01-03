package LinkedList;

class Node2{
    int val;
    Node2 next;
    Node2(int val){
        this.val=val;
        this.next=null;
    }
}
public class recursiveDisplay2 {
    public static void displayRecursive(Node2 head){
        if(head==null) return;
        System.out.println(head.val);
        displayRecursive(head.next);
    }

    public static void main(String[] args) {
        Node2 a = new Node2(10);
        Node2 b = new Node2(20);
        Node2 c = new Node2(30);
        Node2 d = new Node2(40);
        Node2 e = new Node2(50);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        displayRecursive(a);


    }
}
